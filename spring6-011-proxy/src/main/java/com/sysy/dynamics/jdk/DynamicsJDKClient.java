package com.sysy.dynamics.jdk;

import com.sysy.dynamics.jdk.service.OrderService;
import com.sysy.dynamics.jdk.service.impl.OrderServiceImpl;
import com.sysy.dynamics.jdk.util.ProxyUtil;

/**
 * @author saku
 * @date 2023/10/12 13:42
 */
public class DynamicsJDKClient {

    public static void main(String[] args) {
        // 第一步：创建目标对象
        OrderService target = new OrderServiceImpl();
        // 第二步：创建代理对象  参数1：类加载器  参数2：代理类要实现的接口  参数3：调用处理器对象
        /*
        本质上newProxyInstance方法做了两件事
            一是在内存中动态的生成了一个代理类的字节码class
            二是new对象  通过内存中生成的代理类这个代码 实例化了代理对象
        关于newProxyInstance方法的三个重要参数 ，每一个什么含义？有什么用？
            第一个参数：类加载器
                在内存中生成的字节码也是class文件  要执行也得先加载到内存中  加载类需要类加载器  所以这里需要指定类加载器
                且jdk要求代理类的类加载器必须和目标类的类加载器是同一个
            第二个参数：代理类要实现的接口
                代理类要和目标类实现同一个或同一些接口
                在内存中生成代理类时需要告知实现了哪些接口
            第三个参数：
                这是一个JDK动态代理规定的接口，接口全名：java.lang.reflect.InvocationHandler。显然这是一个回调接口，也就是说调用这个接口中方法的程序已经写好了，就差这个接口的实现类了。
         */
        //OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TimerInvocationHandler(target));
        OrderService orderServiceProxy = (OrderService) ProxyUtil.newProxyInstance(target);
        // 第三步：调用代理对象的代理方法
        //调用代理对象的代理方法的时候，注册在InvocationHandler接口中的invoke()方法会被调用。
        orderServiceProxy.detail();
        orderServiceProxy.modify();
        orderServiceProxy.generate();
    }
}
