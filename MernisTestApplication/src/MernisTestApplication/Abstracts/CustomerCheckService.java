package MernisTestApplication.Abstracts;

import MernisTestApplication.Entities.Customer;

public abstract interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws Exception;

}
