package com.hcl.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MyConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http
	//.csrf().disable()//attack through non-browser client
	.authorizeRequests()	
	.antMatchers("/signin").permitAll()
	.antMatchers("/public/**").hasRole("NORMAL")
	.antMatchers("/users/**").hasRole("ADMIN")
	.anyRequest()
	.authenticated()
	.and()
	.formLogin()
	.loginPage("/signin");
	//.httpBasic();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("sundram.dubey").password(passwordEncoder().encode("sun@123")).roles("NORMAL");
	auth.inMemoryAuthentication().withUser("shivam.dubey").password(this.passwordEncoder().encode("shi@123")).roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(10);
	}
}
