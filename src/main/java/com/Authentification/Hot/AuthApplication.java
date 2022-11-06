package com.Authentification.Hot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	/*@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			Role r = new Role("ROLE_USER");
			userService.saveRole(r);
			userService.saveRole(new Role("ROLE_ADMIN"));
			userService.saveRole(new Role("ROLE_SUPER_ADMIN"));
			
			User u = new User("ungapmen@gmail.com","Bolan","Ulrich","119441692","655335466","Jules","Bandjoun, Ouest, Cameroun",r);
			
			userService.saveUser(u);
		};
	}*/

}
