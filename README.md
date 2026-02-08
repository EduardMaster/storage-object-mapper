# Storage API

### How to Install

#### Gradle

```kts
repositories {
   maven("https://jitpack.io")
}

dependencies {
    api("com.github.EduardMaster:storage-object-mapper:main-SNAPSHOT") // last-version
    api("com.github.EduardMaster:storage-object-mapper:v1.0.1") // v1.0-version
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
        <version>v1.0.1</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

### How to use

```java
import br.com.eduard.storage.StorageAPI;

public void exampleWithoutJSON() {
    StorageAPI.autoRegisterClass(MyCustomClass.class);
    var myClass = new MyCUstomClass();
    myClass.name = "NewName";
    
    var myClassMap = StorageAPI.store(MyCustomClass.class, myClass);
    myClassMap.put("name","Exodo");
    
    var myNewClass = StorageAPI.restore(MyCustomClass.class, myClassMap);
    
    System.out.println("My New Object name is: "+ myNewClass.name); // Output 'My New Object name is: Exodo'
}
```


