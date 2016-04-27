package com.probableunivere;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.probableuniverse.SocialAggreApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SocialAggreApplication.class)
@WebAppConfiguration
public class ImgurAggreApplicationTests {

	@Test
	public void contextLoads() {
	}

}
