package com.Security.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringConfig {
    
	@Bean
	public UserDetailsService detailsService() {
		InMemoryUserDetailsManager un = new InMemoryUserDetailsManager();
		UserDetails user1 = User.withUsername("rajmal").password("123").authorities("read").build();
		UserDetails user2 = User.withUsername("Anisha").password("123").authorities("read").build();
		un.createUser(user1);
		un.createUser(user2);
		return un;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		}
	
}
