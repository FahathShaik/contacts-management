package com.fahad.contactsmanagement;

import com.fahad.entityclasses.Contact;
import com.fahad.entityclasses.User;
import com.fahad.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ContactsManagementApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
	}
}
