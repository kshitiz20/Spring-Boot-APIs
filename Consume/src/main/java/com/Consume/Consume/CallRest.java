package com.Consume.Consume;

import org.apache.logging.log4j.Logger;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.Consume.*;

@Component
public class CallRest implements CommandLineRunner{
	
	
	public static String callRestService() {
		RestTemplate rt= new RestTemplate();
		Quote q=  rt.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		return q.getValue().getQuote();
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		callRestService();
		
	}

}
