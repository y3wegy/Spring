import com.spring.configure.bean.ConfigedAnnotationBean;
import com.spring.simple.SimpleBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by a549238 on 11/23/2015.
 */
public class SpringXMLScanConfigureBeanTest {
    private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @BeforeClass
    public static void init() {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config-bean.xml");
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
}
