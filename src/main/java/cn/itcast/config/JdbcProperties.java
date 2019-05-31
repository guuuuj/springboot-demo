package cn.itcast.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {

    String url;
    String driveClassName;
    String username;
    String password;
    User user = new User();

    class User{
        String name;
        int age;
        List<String> language;
    }


}
