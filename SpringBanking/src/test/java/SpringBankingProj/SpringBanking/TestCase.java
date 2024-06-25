package SpringBankingProj.SpringBanking;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acc.lkm.springBanking.Bank;
import com.acc.lkm.springBanking.Customer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/com/acc/lkm/resources/beans.xml")
public class TestCase {
	@Autowired
	Customer customer;
	@Autowired
	Bank bank;
	
	@Test
	public void testCustomer() {
		Assert.assertTrue(customer!=null);
	}
	@Test
	public void testBank() {
		Assert.assertTrue(bank!=null);
	}
	
	@Test
	public void testCustomerID() {
		Assert.assertTrue(customer.getCustomer_Id()==100);
	}
	
	@Test
	public void testBankName() {
		Assert.assertTrue(bank.getBank_Name().equals("AccBank"));
	}
	@Test
	public void testPassword() {
		Assert.assertTrue(customer.getPassword().equals("crazypeople123"));
	}
}
