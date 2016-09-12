package stenshoj.christoffer.autofix;

import stenshoj.christoffer.autofix.adapters.XmlReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 52947 on 26-08-2016.
 */
public class OrderLoader {
	
	XmlReader<OrderCollection> reader;
	
	public OrderLoader(XmlReader<OrderCollection> reader){
		this.reader = reader;
	}
	
    public List<Order> load() throws Exception {
        OrderCollection orderCollection = new OrderCollection();
        File xmlFile = new File("C:\\Orders\\orders.xml");
        if(xmlFile.exists())
            orderCollection = reader.read(xmlFile);
        else
            orderCollection.setOrders(new ArrayList<>());
        return orderCollection.getOrders();
    }
}
