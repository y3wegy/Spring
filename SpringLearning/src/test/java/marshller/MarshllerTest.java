package marshller;

import com.spring.marshaller.bean.Student;
import com.spring.marshaller.manager.CastorMarshllerManager;
import com.spring.marshaller.manager.JAXBMarshallerManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by a549238 on 7/22/2016.
 */
public class MarshllerTest {

    private static final String PATH = "marshaller.xml";

    private static ClassPathXmlApplicationContext classPathXmlApplicationContext;
    @BeforeClass
    public static void BeforeClass()
    {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Before
    public void init() {
        File file = new File(PATH);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testMarshaller() {

        ArrayList<String> numberList = new ArrayList<String>();
        numberList.add("01942652579");
        numberList.add("01762752801");
        numberList.add("8800545");

        Student student = new Student();
        student.setId(1);
        student.setName("Chen,Rui");
        student.setAge(26);

        CastorMarshllerManager castorMarshllerManager = (CastorMarshllerManager) classPathXmlApplicationContext.getBean("castorMarshallerManager");

        try {
            castorMarshllerManager.marshallerObject(student, PATH);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testJAXBUnMarshaller() {

        JAXBMarshallerManager<Student> jaxbMarshallerManager = (JAXBMarshallerManager<Student>) classPathXmlApplicationContext.getBean("JAXBMarshaller");
        try {
            Student instance = jaxbMarshallerManager.unMarshaller(Student.class,"students.xml");
            System.out.println(instance.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
