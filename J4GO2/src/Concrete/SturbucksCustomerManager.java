package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adaptester.MernisServiceAdapter;
import Entities.Customer;


public class SturbucksCustomerManager extends BaseCustomerManager{
		
	private CustomerCheckService customerCheckService;
	
	public SturbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
	
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} 
		else { System.out.println("Not a valid person");
		}
		
		
	}

	
}
