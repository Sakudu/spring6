import com.sysy.lifeCycle.Order;
import com.sysy.lifeCycle.Person;
import com.sysy.lifeCycle.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/9 16:34
 */
public class LifeCycleTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        User user = ac.getBean("user", User.class);
        System.out.println("4 使用bean " + user);
        //必须手动关闭Spring容器 Spring容器才会销毁bean
        ac.close();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("person.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println("8 使用bean " + person);
        //必须手动关闭Spring容器 Spring容器才会销毁bean
        ac.close();
    }

    @Test
    public void test3(){
        Order order = new Order();
        System.out.println(order);
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("order", order);
        Order orderBean = factory.getBean("order", Order.class);
        System.out.println(orderBean);
    }
}
