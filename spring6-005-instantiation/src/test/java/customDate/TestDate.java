package customDate;

import com.sysy.customDate.Man;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/9 15:41
 */
public class TestDate {

    @Test
    public void Test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Man man = ac.getBean("man", Man.class);
        System.out.println(man);
    }
}
