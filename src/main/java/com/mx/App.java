package com.mx;

import com.mx.config.SpringConfig;
import com.mx.domain.Account;
import com.mx.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account account = new Account();
        account.setName("xxx");
        account.setPassword("54343");
        account.setAge(12);
        accountService.save(account);
    }
}
