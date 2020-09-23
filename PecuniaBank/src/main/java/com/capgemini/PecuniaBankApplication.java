package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.model.BankAccountDetails;
import com.capgemini.service.IPassbookService;

@SpringBootApplication
public class PecuniaBankApplication implements CommandLineRunner{
	
	@Autowired
	
	private IPassbookService passbookService;

	public static void main(String[] args) {
		SpringApplication.run(PecuniaBankApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		BankAccountDetails ba = new BankAccountDetails();
		
		 ba.setAccNumber(234562345);
		 
		 ba.setAccountBalance(2300);	
		 
		 ba.setAccountBranchId("100");
		 
		 ba.setAccountInterest(2);
		 
		 ba.setCustomerAdharId(58901234);
		 
		 ba.setCustomerPancard("789456");
		 
		 ba.setCustomerName("rakesh");
		 
		 ba.setCustomerGender("male");
		
		  passbookService.save(ba);
 
		 
	}

}
