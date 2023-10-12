import com.sysy.bean.User;
import com.sysy.config.SpringConfiguration;
import com.sysy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/11 14:35
 */
public class AnnotationTest {

    @Test
    public void testBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void testBean2(){
        new ClassPathXmlApplicationContext("spring2.xml");
    }

    @Test
    public void testBean3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        UserService service = applicationContext.getBean("userServiceImpl", UserService.class);
        service.save();
    }

    @Test
    public void testBean4(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService service = applicationContext.getBean("userServiceImpl", UserService.class);
        service.save();
    }
}
