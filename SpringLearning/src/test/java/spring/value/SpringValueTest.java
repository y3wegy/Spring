package spring.value;

import com.spring.simple.ComponentBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by a549238 on 3/14/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/Spring-config.xml")
public class SpringValueTest {

    @Autowired()
    private ComponentBean componentBean;

    @Test
    public void testAutowiredValue() throws Exception {
        assertEquals("Chen,Rui",componentBean.getName());
        assertEquals("Game",componentBean.getFavourite());
    }
}
