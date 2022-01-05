import java.rmi.RemoteException;


import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adaptester.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException{
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1, "Duygu", "Hotin", 29081999, "46867724970"));
		
		
		

	}
}
