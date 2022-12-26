package com.mx;

import com.mx.config.SpringConfig;
import com.mx.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.mx.service.AccountService;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        //System.out.println(accountService.findById(1));
        //accountService.delete(7);
        /*for (int i = 6532; i <10000 ; i++) {
            accountService.delete(i);
        }*/

        Account account = new Account();
        account.setName("xxx");
        account.setPassword("54343");
        account.setAge(12);
        accountService.save(account);
//        accountService.save(account);
////        accountService.delete(6);
//        System.out.println("account = " + account);
    }
}
