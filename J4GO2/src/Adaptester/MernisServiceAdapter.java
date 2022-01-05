package Adaptester;


import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
	
	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException{
		
		boolean result =  kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getId(),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toLowerCase(), 
				customer.getDateOfBirth());
		
		if(result == true) {
			
			System.out.println("Baþarýlý");
			return true;
			
		}
		else 
		{
			System.out.println("Baþarýsýz"); 
			return false;
		}
		
	}

}
