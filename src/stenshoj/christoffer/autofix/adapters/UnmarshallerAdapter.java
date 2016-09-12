package stenshoj.christoffer.autofix.adapters;

import java.io.File;
import javax.xml.bind.Unmarshaller;

import stenshoj.christoffer.autofix.OrderCollection;

public class UnmarshallerAdapter implements XmlReader <OrderCollection>{

	Unmarshaller reader;
	
	public UnmarshallerAdapter(Unmarshaller unmarshaller) {
		reader = unmarshaller;
	}
	
	@Override
	public OrderCollection read(File file) throws Exception {
		return (OrderCollection) reader.unmarshal(file);
	}
}
