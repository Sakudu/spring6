package methodFactory;

import com.sysy.methodFactory.Gun;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/9 11:56
 */
public class SpringInstantiationTest {

    @Test
    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);
    }
}
