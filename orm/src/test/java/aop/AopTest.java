package aop;

import com.star.OrmApplication;
import com.star.orm.aop.AopTargetSource;
import com.star.orm.aop.TestDTO;
import com.star.orm.api.business.QueryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.objenesis.ObjenesisStd;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ZhuYX
 * @date 2020/10/29 14:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrmApplication.class})
//@TestPropertySource(properties = {"aws.sqs.enabled:false"})
@ActiveProfiles("dev")
public class AopTest {

    @Autowired
    QueryService qs;

    @Test
    public void test() {
       qs.query();
    }


    @Test
    public void test_factoryBean() throws Exception {
        ProxyFactory proxy = new ProxyFactory(new AopTargetSource());
        proxy.addAdvice((MethodBeforeAdvice) (method, args1, target) ->
                System.out.println("被拦截-方法名为：" + method.getName() +
                        " 参数为--" + Arrays.asList(args1)));

        AopTargetSource proTarget = (AopTargetSource)proxy.getProxy();
        proTarget.test();

        System.out.println("######### " + proxy.getTargetSource());
        System.out.println("######### " + proxy.getTargetSource().getTarget());
        System.out.println("######### " + proxy.getTargetSource().getTargetClass());
        System.out.println("######### " + proxy.getProxy());
        System.out.println("######### " + proxy.getProxy().getClass());
        System.out.println("Is cglib :" + AopUtils.isCglibProxy(proTarget));
        System.out.println("" + Proxy.isProxyClass(proTarget.getClass()));
    }


    @Test
    public void test_objenesis() {
        ObjenesisStd obj = new ObjenesisStd();
        TestDTO testDTO = obj.newInstance(TestDTO.class);
        testDTO.setCode("ab");
        System.out.println(testDTO);
    }

    @Test
    public void test_method() {
        // MethodIntrospector.selectInvocableMethod()

    }
}
