package com.mx.config;

import org.springframework.context.annotation.*;

/**
 * <p>@Import</p>注解用于将一个或多个配置类导入当前应用程序上下文,它只能用于配置类
 * <P>@ComponentScan</P> 注解是 Spring 中的一种注解，用于在 Spring 应用程序上下文中扫描并注册组件，包括 @Component、@Service、@Repository、@Controller 等注解的类。
 *
 * @author echo
 * @version 1.1
 **/
@Configuration
@ComponentScan("com.mx")
//@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
