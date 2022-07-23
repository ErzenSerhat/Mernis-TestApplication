package MernisTestApplication.Adapters;

import MernisTestApplication.Abstracts.CustomerCheckService;
import MernisTestApplication.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
				customer.getLastName(), customer.getDateOfBirth());
	}

}
