package MernisTestApplication.Abstracts;

import MernisTestApplication.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Veri Tabanına Kaydedildi " + customer.getFirstName());

	}

}
