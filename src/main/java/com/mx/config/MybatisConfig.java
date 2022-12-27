package com.mx.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * 这个类用来代替sql的配置文件
 *
 * @author echo
 * @version 1.1
 **/
public class MybatisConfig {
    //定义bean，SqlSessionFactoryBean，用于产生SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.mx.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    /* MapperScannerConfigurer 是一个用于自动扫描和装配 MyBatis Mapper 接口的 Spring 配置类。
     它可以自动发现应用程序中的所有 Mapper 接口，并将它们装配到 SqlSessionFactory 中，*/
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.mx.dao");
        return msc;
    }
}
