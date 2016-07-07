import com.spring.demo.simple.AnnotationBean;
import com.spring.demo.simple.ComponentBean;
import com.spring.demo.simple.SimpleBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by a549238 on 11/20/2015.
 */
public class SpringXMLTest {

    private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @BeforeClass
    public static void init() {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void testSimpleBean() {

        SimpleBean bean = classPathXmlApplicationContext.getBean("simple", SimpleBean.class);
        bean.funning();
    }

    @Test
    public void testAnnotationBean() {
        AnnotationBean annotationSimple = classPathXmlApplicationContext.getBean("annotationSimple", AnnotationBean.class);
        annotationSimple.funning();

    }

    @Test
    public void testAutoScan() {
        ComponentBean componentBean = classPathXmlApplicationContext.getBean("componentBean", ComponentBean.class);
        componentBean.funning();
    }
}
