import com.spring.demo.simple.SimpleBean;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by a549238 on 11/23/2015.
 */
public class SpringConfigScanTest {

    private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

    @BeforeClass
    public static void init() {
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com/spring/demo/configure/configbean");
    }

    @AfterClass
    public static void destory() {
        annotationConfigApplicationContext.close();
    }

    @Test
    public void testAutoScan() throws Exception {
        SimpleBean simpleBean = annotationConfigApplicationContext.getBean("configSimpleBean", SimpleBean.class);
        simpleBean.funning();
    }
}
