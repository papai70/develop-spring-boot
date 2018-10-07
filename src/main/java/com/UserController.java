package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Controller
//@PropertySource("classpath:${env.name}/${path.oNd}/application-${env.name}-${path.oNd}.yml")

public class UserController {
    @Autowired
	RestTemplateBuilder template;
	@Value("${db.uname}")
    private String uname;
	
	
	@RequestMapping("/users")
    public String getAllUsers() throws ApplicationException {
		System.out.println("rest method called");
		System.out.println(uname+"--------------");
		//method();
		RestTemplate restTemplate=template.build();
		String abc=restTemplate.getForObject("http://localhost:8080/user2", String.class);
		return "hello "+abc;
    }
	public void method()throws ApplicationException{
		try {
			int a=0;
			if(a==a)
			throw new ApplicationException();
		} catch (ApplicationException e) {
			throw new ApplicationException();
		}
	}
	@RequestMapping("/user2")
	public String getSecondService(){
		
		
		return "second";
	}
}

