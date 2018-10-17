package com.licerlee.sheboot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.licerlee.sheboot.web.dao.MenuDao;
import com.licerlee.sheboot.web.dao.UserDao;
import com.licerlee.sheboot.web.domain.Task;
import com.licerlee.sheboot.web.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShebootApplicationTests {

	private Logger logger = Logger.getLogger(getClass());

	// @Test
	public void contextLoads() {

		logger.debug("this msg from test");
	}

	@Test
	public void userDaoTest() {


	}

	@Test
	public void taskDaoTest() {

	}

}
