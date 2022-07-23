package MernisTestApplication;

import MernisTestApplication.Abstracts.BaseCustomerManager;
import MernisTestApplication.Adapters.MernisServiceAdapter;
import MernisTestApplication.Concreates.StarbucksCustomerManager;
import MernisTestApplication.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		Customer customer = new Customer(1, "SERHAT", "ERZEN", 1997, "11111111111");//
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer);

	}

}
