package uk.co.threebugs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
public class ForexAlertsApplication {

    //http://rates.fxcm.com/RatesXML

    public static void main(String[] args) {
        SpringApplication.run(ForexAlertsApplication.class, args);

        try {

            File file = new File("RatesXML.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Rates.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Rates customer = (Rates) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }


}
