package MernisTestApplication.Abstracts;

import MernisTestApplication.Entities.Customer;

public interface ICustomerService {
	void save(Customer customer) throws Exception;
}
