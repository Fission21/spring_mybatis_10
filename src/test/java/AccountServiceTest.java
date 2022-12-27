import com.mx.config.SpringConfig;
import com.mx.domain.Account;
import com.mx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 测试类
 *
 * @author echo
 * @version 1.1
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindId() {
        Account ac = accountService.findById(1);
    }

    @Test
    public void testFindAllId() {
        List<Account> all = accountService.findAll();
    }
}
