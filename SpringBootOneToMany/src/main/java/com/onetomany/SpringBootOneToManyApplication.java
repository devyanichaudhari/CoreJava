package com.onetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.onetomany.model.Apps;
import com.onetomany.model.Mobile;
import com.onetomany.repository.AppRepository;
import com.onetomany.repository.MobileRepository;

@SpringBootApplication
public class SpringBootOneToManyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootOneToManyApplication.class, args);
		MobileRepository mobileRepo = context.getBean(MobileRepository.class);
		AppRepository appRepo = context.getBean(AppRepository.class);
		Mobile mob = new Mobile("Galaxy","Samsung");
		mobileRepo.save(mob);
		appRepo.save(new Apps("WhatsApp",25,mob)):
		appRepo.save(new Apps("Hike",25,mob));
		appRepo.save(new Apps("LinkedIN",25,mob));
		
	}

}
