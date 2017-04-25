package com.sathish.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathish.model.User;
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepo;
	@Test
	
	public void testSave(@RequestParam("id") Long id,@RequestParam("name") String name) {
		
		
		 
        System.out.println("userRepo -> Save");
        User user = new User();
        user.setId(id);
        user.setName(name);
        System.out.println(user);
        userRepo.save(user);
    }

}
