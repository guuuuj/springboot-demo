package cn.itcast.config;

//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
    /*@Bean
    public DataSource dataSource(JdbcProperties jpop){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setPassword(jpop.getPassword());
        druidDataSource.setUsername(jpop.getUsername());
        druidDataSource.setUrl(jpop.getUrl());
        druidDataSource.setDriverClassName(jpop.getDriveClassName());
        return druidDataSource;
    }*/

    /*@Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }*/
}
