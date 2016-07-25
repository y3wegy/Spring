package com.spring.marshaller.manager;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by a549238 on 7/25/2016.
 */
public class JAXBMarshallerManager<T> {

    private static final Logger logger = Logger.getLogger(JAXBMarshallerManager.class);

    public T unMarshaller(Class<T> tClass,String path) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = this.getClass().getClassLoader().getResourceAsStream(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(tClass);
            Unmarshaller jaxbUnmarshaller  = jaxbContext.createUnmarshaller();
            T instance = (T) jaxbUnmarshaller.unmarshal(inputStream);
            return instance;
        } catch (JAXBException e) {
            e.printStackTrace();
        }finally {
            if(inputStream!=null)
            {
                inputStream.close();
            }
        }
        return null;
    }
}
