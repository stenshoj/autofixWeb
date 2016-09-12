package stenshoj.christoffer.autofix;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import stenshoj.christoffer.autofix.adapters.UnmarshallerAdapter;

public class Program {

	public static void main(String[] args) throws Exception {
		JAXBContext orderContext = JAXBContext.newInstance(OrderCollection.class);
        Unmarshaller orderUnmarshaller = orderContext.createUnmarshaller();
		Autofix autofix = new Autofix(new OrderSaver(), new OrderLoader(new UnmarshallerAdapter(orderUnmarshaller)));
	}

}
