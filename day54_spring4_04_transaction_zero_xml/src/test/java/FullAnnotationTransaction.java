import com.joke.config.SpringConfiguration;
import com.joke.entity.Account;
import com.joke.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class FullAnnotationTransaction {
    @Autowired
    private IAccountService accountService;
    @Test
    public void save() {
        System.out.println(accountService.getClass());
        System.out.println("111111");
        System.out.println("222222");
        System.out.println("333333");
        Account account = new Account();
        account.setUid(45);
        account.setMoney(10000);
        accountService.save(account);
    }
}
