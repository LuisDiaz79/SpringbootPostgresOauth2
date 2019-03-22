package com.tempedge.TempEdge;

import com.tempedge.TempEdge.Domain.SecurityEntities.Role;
import com.tempedge.TempEdge.Domain.SecurityEntities.UserSecurity;
import com.tempedge.TempEdge.security.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class TempEdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempEdgeApplication.class, args);
	}

	@Bean
	public CommandLineRunner setupDefaultUser(UserService service) {
		return args -> {
			service.save(new UserSecurity(
					"user", //username
					"user", //password
					Arrays.asList(new Role("ROLE_USER"), new Role("ACTUATOR")),//roles
					true//Active
			));
		};
	}

	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
