package in.ashokit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPk;
import in.ashokit.repo.AccountRepo;

@Service
public class AccountService {

	
	private AccountRepo repo;

	public AccountService(AccountRepo repo) 
	{
		super();
		this.repo = repo;
	}
	
	public void getDataUsingPk() 
	{
		AccountPk pk=new AccountPk();
		
		pk.setAccId(104);
		pk.setAccType("SAVING");
		pk.setHolderName("TCS");
		
		Optional<Account> findById = repo.findById(pk);
		
		if (findById.isPresent())
		{
			System.out.println(findById.get());
		} 
	}
	
	public void saveAccData() 
	{
		AccountPk pk=new AccountPk();
		
		pk.setAccId(104);
		pk.setAccType("SAVING");
		pk.setHolderName("TCS");
		
		Account acc=new Account();
		
		acc.setBranchName("SBI");
		acc.setMinBal(5000.00);
		
		acc.setAccPk(pk);
		
		repo.save(acc);
	}
	
	
}
