# Maven下用MyBatis Generator生成文件

1.在pom文件内添加plugin

```xml
<build>
        <finalName>KenShrio</finalName>
        <defaultGoal>compile</defaultGoal>
        <plugins>
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.5</version>
                <configuration>
                    <!--指定配置文件位置-->
                    <configurationFile>src/main/resources/generatorConfig.xml</configurationFile>
                    <verbose>true</verbose>
                    <overwrite>true</overwrite>
                </configuration>
                <executions>
                    <execution>
                        <id>Generate MyBatis Artifacts</id>
                        <goals>
                            <goal>generate</goal>
                        </goals>
                    </execution>
                </executions>
                <dependencies>
                    <dependency>
                        <groupId>org.mybatis.generator</groupId>
                        <artifactId>mybatis-generator-core</artifactId>
                        <version>1.3.5</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
```



2. generatorConfig.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
 
<!-- 配置Run As Maven build : Goals 参数 : mybatis-generator:generate -Dmybatis.generator.overwrite=true -->
<!-- 配置 tableName,使用 Run As Maven build 生成 dao model 层 -->
<generatorConfiguration>
    <!-- 配置文件路径
    <properties url="${mybatis.generator.generatorConfig.properties}"/>-->
 
    <!--数据库驱动包路径 -->
    <classPathEntry location="/Users/it/Documents/JAVA/lib/mysql-connector-java-5.0.8/mysql-connector-java-5.0.8-bin.jar"/>
 
    <context id="DB2Tables" targetRuntime="MyBatis3">
        <!--关闭注释 -->
        <commentGenerator>
            <property name="suppressAllComments" value="true"/>
        </commentGenerator>
 
        <!--数据库连接信息 -->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver" connectionURL="jdbc:mysql://localhost:3306/TEST?useUnicode=true&characterEncoding=utf-8" userId="root"
                        password="db123">
        </jdbcConnection>
 
        <!--生成的model 包路径 -->
        <javaModelGenerator targetPackage="com.qianfeng.entity" targetProject="src/main/java">
            <property name="enableSubPackages" value="ture"/>
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>
 
        <!--生成xml mapper文件 路径 -->
        <sqlMapGenerator targetPackage="com.qianfeng.mapperxml" targetProject="src/main/java">
            <property name="enableSubPackages" value="ture"/>
        </sqlMapGenerator>
 
        <!-- 生成的Dao接口 的包路径 -->
        <javaClientGenerator type="XMLMAPPER" targetPackage="com.qianfeng.mapper" targetProject="src/main/java">
            <property name="enableSubPackages" value="ture"/>
        </javaClientGenerator>
 
        <!--对应数据库表名，多个表，请复制指定 -->
        <table tableName="T_USER"></table>
        <table tableName="T_ROLE"></table>
        <table tableName="T_USER_ROLE"></table>
        <table tableName="T_PERMISSION"></table>
    </context>
</generatorConfiguration>
```

3. 用Maven命令mvn mybatis-generator:generate生成