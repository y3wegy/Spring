package com.spring.marshaller.manager;

import org.apache.log4j.Logger;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by a549238 on 7/22/2016.
 */
public class CastorMarshllerManager<T> {

    private static final Logger logger = Logger.getLogger(CastorMarshllerManager.class);
    private Marshaller marshaller;
    private Unmarshaller unMarshaller;

    public T unmarshallerXML(String filePath) throws JAXBException, IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);

            return (T) getUnMarshaller().unmarshal(new StreamSource(fileInputStream));
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }

    }

    public void marshallerObject(T object, String filePath) throws IOException, JAXBException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
            getMarshaller().marshal(object, new StreamResult(fileOutputStream));
        } finally {
            if (fileOutputStream != null) {
                logger.info("save XML :" + new File(filePath).getAbsolutePath());
                fileOutputStream.close();
            }
        }
    }

    public Marshaller getMarshaller() {
        return marshaller;
    }

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public Unmarshaller getUnMarshaller() {
        return unMarshaller;
    }

    public void setUnMarshaller(Unmarshaller unMarshaller) {
        this.unMarshaller = unMarshaller;
    }
}
