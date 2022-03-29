package com.sgenlecroyant.springboot.simplecaching.datainit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sgenlecroyant.springboot.simplecaching.repository.UserRepository;
import com.sgenlecroyant.springboot.simplecaching.user.User;

@Component
public class DataInit implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		
		User sgen = new User("Franck", "Sgen", "sgen@gmail.com");
		User jenny = new User("Jenny", "Richards", "jennyrich@gmail.com");
		
		this.userRepo.save(sgen);
		this.userRepo.save(jenny);
	}

}
