import com.sysy.aop.Spring6Configuration;
import com.sysy.aop.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author saku
 * @date 2023/10/16 10:16
 */
public class TestAop {

    @Test
    public void testAOPWithAllAnnotation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        OrderService orderService = applicationContext.getBean("orderServiceImpl", OrderService.class);
        orderService.generate();
    }
}
