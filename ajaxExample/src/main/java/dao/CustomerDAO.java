package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vo.Customer;

public class CustomerDAO {
	Map<String, Customer> customerMap = new HashMap<>();
	
	public CustomerDAO(){
		customerMap.put("ALFKI",
		new Customer("ALFKI", "	Alfreds Futterkiste","Alfreds Futterkiste ", "Obere Str. 57", "Berlin","12209", "Germany"));
		customerMap.put("NORTS",
				new Customer("NORTS", "North/South","Simon Crowther", "South House 300 Queensbridge ", "London","SW7 1RZ", "UK"));
		customerMap.put("WOLZA",
				new Customer("WOLZA", "Wolski Zajazd","Zbyszek Piestrzeniewicz", "ul. Filtrowa 6", "Warszawa","01-012", "Poland"));
	}
	
public List<Customer> getList(){
	 List<Customer> list = (List<Customer>) customerMap.values();
	 return list;
}
 
public Customer getInfo(String id) {
	return customerMap.get(id);
}

}
