package madhu;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {
	
	@Autowired
	private ApplicationContext ctx;

	@Test
	public void contextLoads() {
		System.out.println("There are " + ctx.getBeanDefinitionCount() + 
				" beans in the application.");
		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
