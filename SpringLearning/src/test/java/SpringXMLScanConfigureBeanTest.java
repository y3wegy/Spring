import com.spring.bean.complex.ComplexBean;
import com.spring.bean.scan.ConfigedAnnotationBean;
import com.spring.bean.simple.SimpleBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by a549238 on 11/23/2015.
 */
public class SpringXMLScanConfigureBeanTest {
    private static ClassPathXmlApplicationContext classPathXmlApplicationContext;
    private static ClassPathXmlApplicationContext classPathXmlApplicationContext2;

    @BeforeClass
    public static void init() {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config-bean.xml");
        classPathXmlApplicationContext2 = new ClassPathXmlApplicationContext("spring-config-bean2.xml");
    }

    @Test
    public void testAutoScanConfigureBean() throws Exception {
        SimpleBean simpleBean = classPathXmlApplicationContext.getBean("configSimpleBean", SimpleBean.class);
        simpleBean.funning();
    }

    @Test
    public void testAutoScanComponent() throws Exception {
        ConfigedAnnotationBean configedAnnotationBean = classPathXmlApplicationContext.getBean("configAnnotationBean", ConfigedAnnotationBean.class);
        configedAnnotationBean.funny();
    }

    @Test
    public void testComplexBean() throws Exception {
        ComplexBean complexBean  = classPathXmlApplicationContext2.getBean("ComplexBean",ComplexBean.class);
        complexBean.sayYY();
    }
}
