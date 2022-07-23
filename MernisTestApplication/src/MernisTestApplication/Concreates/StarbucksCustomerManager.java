package MernisTestApplication.Concreates;

import MernisTestApplication.Abstracts.BaseCustomerManager;
import MernisTestApplication.Abstracts.CustomerCheckService;
import MernisTestApplication.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Add To Db " + customer.getFirstName());
		} else {
			throw new Exception("Not a valid person");
		}
	}

}
