package com.zensar.spring.security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void congigur(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * auth.inMemoryAuthentication() .withUser("jerry") .password("jerry@123")
		 * .roles("USER") .withUser("tom") .password("tom@123") .roles(ADMIN");
		 */

		auth.userDetailsService(userDetailsService);

	}

	@SuppressWarnings("deprecation")
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// used for Authorization
		http.authorizeRequests().antMatchers("/user").hasAnyRole("user")
				// for user role
				.antMatchers("/admin").hasAnyRole("admin")
				// for Admin role
				.antMatchers("/all")
				// for all the users
				.permitAll().and().httpBasic();
		// for the type of login console, also can use.formlogin()

	}

}
