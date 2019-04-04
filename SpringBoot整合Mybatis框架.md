## SpringBoot整合Mybatis框架

#### 项目结构

![](C:\Users\heyahui\Pictures\OS_Picture\springboot整合mybatis项目结构图.png)

1. XxxMapper  接口要注意两点：
   - 添加@Mapper接口
   - 接口方法名要与XxxMapper.xml配置文件中 id相同

- 指定XxxMapper.xml的文件位置

  1. mybatis.mapper-locations=classpath:mapper/*.xml
  2. XxxMapper.xml一般放在resources目录下面

  ##### XxxMapper.xml 示例

  ```java
  <?xml version="1.0" encoding="UTF-8" ?>
  <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
  
  <mapper namespace="com.conposition.mybatis.mybatisspringboot.dao.UserMapper">
      <select id="selectById" parameterType="int" resultType="com.conposition.mybatis.mybatisspringboot.domain.User">
          SELECT * FROM t_user WHERE id=#{id}
      </select>
  </mapper>
  
  ```

------



```xml
<dependencies>
		<dependency>
			<groupId>org.mybatis.spring.boot</groupId>
			<artifactId>mybatis-spring-boot-starter</artifactId>
			<version>1.1.1</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.21</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

			<dependency>
				<groupId>com.alibaba</groupId>
				<artifactId>fastjson</artifactId>
				<version>1.2.46</version>
			</dependency>
	</dependencies>
```



### 启动类

不需要在@SpringbootApplication后面加上(exclude = {DataSourceAutoConfiguration.class})

```java
@SpringBootApplication
@MapperScan("com.conposition.mybatis.mybatisspringboot.dao")
public class MybatisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringbootApplication.class, args);
	}

}
```











































































- XxxMapper.xml配置示例