package com.bank.ws.util;

import java.io.Reader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author stephen
 * Class to convert data to and from xml with jaxb marshell/unmarshell
 * in cass pass string back out to user
 */
public class Util {
	// Marshal an object into XML
		public static String marshalToXml(Object myObject, Class myClass) throws JAXBException {
			String responseStr = null;
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(myClass);
				
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

				StringWriter writer = new StringWriter();
				jaxbMarshaller.marshal(myObject, writer);
				responseStr = writer.toString();
		  } 
		  catch (JAXBException e) {
				e.printStackTrace();
				throw e;
		  }
		  
		  return responseStr;
		}
		
		// Unmarshal an object from XML
		public static Object unmarshalFromXml(Reader myReader, Class myClass) {
			Object myObject = null;
			try { 
				JAXBContext jaxbContext = JAXBContext.newInstance(myClass);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				myObject = jaxbUnmarshaller.unmarshal(myReader); 
		  } 
		  catch (JAXBException e) {
				e.printStackTrace();
		  }
		  return myObject;
		}

}
