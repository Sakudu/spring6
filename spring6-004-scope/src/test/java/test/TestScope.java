package test;

import com.sysy.project.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author saku
 * @date 2023/10/8 16:51
 */
public class TestScope {

    @Test
    public void TestBeanScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean acBean = ac.getBean("springBean", SpringBean.class);
        SpringBean acBean2 = ac.getBean("springBean", SpringBean.class);
        System.out.println(acBean);
        System.out.println(acBean2);
    }
}
