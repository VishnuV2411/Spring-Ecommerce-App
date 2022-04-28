package com.example.shoppingCart;

import com.example.shoppingCart.controller.AdminController;
import com.example.shoppingCart.controller.MainController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
class ShoppingCartApplicationTests {

	@Autowired
	private AdminController adminController;

	@Autowired
	private MainController mainController;

	@Test
	void contextLoads() {
		assertThat(adminController).isNotNull();
		assertThat(mainController).isNotNull();
	}

	void addProductTest(){

	}

}
