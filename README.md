用 Maven 组织 Java & Scala 混合编程
参考自：https://github.com/zxpbenson/scala-java-mixd-by-maven
升级了scala 和 java 版本，目前编译打包，运行正常
搞一个scala和java 混合编译太难了

```bash
1. mvn -version
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: /Users/jmd/soft/apache-maven-3.6.3
Java version: 17.0.12, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
Default locale: zh_CN_#Hans, platform encoding: UTF-8
OS name: "mac os x", version: "15.5", arch: "aarch64", family: "mac"
(base) jmd@bogon scala-java-mixd-by-maven % 

2. java -version
java version "17.0.12" 2024-07-16 LTS
Java(TM) SE Runtime Environment (build 17.0.12+8-LTS-286)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.12+8-LTS-286, mixed mode, sharing)
(base) jmd@bogon scala-java-mixd-by-maven %

3. mvn clean compile 
[INFO] ------------< com.benson.practice:scala-java-mixd-by-maven >------------
[INFO] Building scala-java-mixd-by-maven 1.0
[INFO] --------------------------------[ jar ]--------------------------------- 
...
[INFO] --- maven-compiler-plugin:3.8.1:compile (default) @ scala-java-mixd-by-maven ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/jmd/AAA/scala-java-mixd-by-maven/target/classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------

4. mvn clean package
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ scala-java-mixd-by-maven ---
[INFO] Building jar: /Users/jmd/AAA/scala-java-mixd-by-maven/target/scala-java-mixd-by-maven-1.0.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

1. 之前有时候IDEA能运行，mvn无法编译，这是因为maven 编译和打包配置问题，值配置编译顺序是不行的，有交叉调用（我感觉）
2. maven clean compile package 没问题，idea运行有问题，可能是配置问题或者idea缓存问题