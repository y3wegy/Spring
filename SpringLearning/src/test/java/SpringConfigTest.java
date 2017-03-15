import com.spring.bean.scan.ConfigedAnnotationBean;
import com.spring.configure.MyConfigure;
import com.spring.bean.simple.SimpleBean;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by a549238 on 11/20/2015.
 */
public class SpringConfigTest {
    private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

    @BeforeClass
    public static void init() {
        //actual call register(clazz).then refreash()
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfigure.class);
    }

    @AfterClass
    public static void destory() {
        annotationConfigApplicationContext.close();
    }

    @Test
    public void testSimpleConfigBean() {
        SimpleBean simpleBean = annotationConfigApplicationContext.getBean("configSimpleBean", SimpleBean.class);
        simpleBean.funning();
    }

    @Test
    public void testAnnotationSimpleBean() throws Exception {
        ConfigedAnnotationBean annotationSimpleBean = annotationConfigApplicationContext.getBean("configAnnotationBean", ConfigedAnnotationBean.class);
        annotationSimpleBean.funny();
    }
}
