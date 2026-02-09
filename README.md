# Storage API

### How to Install

#### Gradle

```kts
repositories {
   maven("https://jitpack.io")
}

dependencies {
    api("com.github.EduardMaster:storage-object-mapper:main-SNAPSHOT") // last-version
    api("com.github.EduardMaster:storage-object-mapper:1.0.0") // v1.0-version
}
```
#### Maven

```xml
<repositories>
    <repository>
        <id>Jitpack</id>
        <url>https://jitpack.com/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.EduardMaster</groupId>
        <artifactId>storage-object-mapper</artifactId>
        <version>1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

### How to use

```java
import br.com.eduard.storage.StorageAPI;


public static void main(String[] args) {
    StorageAPI.autoRegisterClass(MyCustomClass.class);
    var myClass = new MyCustomClass();
    myClass.name = "NewName";
    
    var myClassMap = StorageAPI.store(MyCustomClass.class, myClass);
    myClassMap.put("name","Exodo");
    
    var myNewClass = StorageAPI.restore(MyCustomClass.class, myClassMap);
    
    System.out.println("My New Object name is: "+ myNewClass.name); // Output 'My New Object name is: Exodo'
}
```


