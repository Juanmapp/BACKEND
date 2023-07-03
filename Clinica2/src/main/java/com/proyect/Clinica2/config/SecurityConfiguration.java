//package com.proyect.Clinica2.config;
//
//
//import com.proyect.Clinica2.service.AppUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration {
//
//  @Autowired
//  private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//  @Autowired
//  private AppUserService userService ;
//
//
//  public void configure(AuthenticationManagerBuilder auth) {
//    DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//    provider.setPasswordEncoder(bCryptPasswordEncoder);
//    provider.setUserDetailsService(userService);
//    auth.authenticationProvider(provider);
//  }
//
//  @Bean
//  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    http.csrf().disable()
//        .authorizeRequests()
//        .requestMatchers(HttpMethod.GET, "/").permitAll()
//        .requestMatchers( "/public/**").permitAll()
//        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
//        .requestMatchers("/admin/**").hasRole("ADMIN")
//        .anyRequest().authenticated().and().formLogin().and().logout();
//
//    http.httpBasic();
//    return http.build();
//  }
//
//
//}
