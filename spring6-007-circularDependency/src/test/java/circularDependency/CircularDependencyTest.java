package circularDependency;

import com.sysy.circularDependency.Husband;
import com.sysy.circularDependency.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/10 10:14
 */
public class CircularDependencyTest {

    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Wife wife = ac.getBean("wifeBean", Wife.class);
        System.out.println(wife);
        Husband husband = ac.getBean("husbandBean", Husband.class);
        System.out.println(husband);
    }
}
