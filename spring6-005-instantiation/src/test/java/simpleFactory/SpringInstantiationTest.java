package simpleFactory;

import com.sysy.simpleFactory.Star;
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
        Star star = applicationContext.getBean("starBean", Star.class);
        System.out.println(star);
    }
}
