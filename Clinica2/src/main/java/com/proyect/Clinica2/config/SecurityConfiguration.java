package com.proyect.Clinica2.config;


import com.proyect.Clinica2.jwt.JwtRequestFilter;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

import static com.proyect.Clinica2.persistence.entity.AppUserRole.ADMIN;
import static com.proyect.Clinica2.persistence.entity.AppUserRole.USER;


@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfiguration {


    private final JwtRequestFilter jwtRequestFilter;



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .cors(Customizer.withDefaults())
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        authorizeHttpRequestsCustomizer -> authorizeHttpRequestsCustomizer
                                .requestMatchers(HttpMethod.POST, "/api/login").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/sign-up").permitAll()
                                .requestMatchers(HttpMethod.GET, "/hello/user")
                                .hasAnyAuthority(USER.name(), ADMIN.name())
                                .requestMatchers(HttpMethod.GET, "/hello/admin").hasAuthority(ADMIN.name())
                                .requestMatchers(HttpMethod.GET, "/swagger-ui/**").permitAll()
                                .requestMatchers(HttpMethod.GET, "/v3/api-docs/**").permitAll()
                                .requestMatchers(HttpMethod.GET, "/swagger-ui.html").permitAll()
                                .requestMatchers(HttpMethod.GET, "/api/users").hasAuthority(ADMIN.name())
                                .anyRequest().authenticated())
                .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:5173"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowedMethods(List.of("*"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

//    @Autowired
//    private AppUserService userService;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authz) -> authz
//                        .anyRequest().authenticated()
//                )
//                .httpBasic(withDefaults());
//        return http.build();
//    }
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http
////                .authorizeHttpRequests((authz) -> authz
////                        .antMatchers("/api/admin/**").hasRole("ADMIN")
////                        .antMatchers("/api/user/**").hasRole("USER")
////                        .anyRequest().authenticated()
////                );
////        return http.build();
////    }
//
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(daoAuthenticationProvider());
//    }
//    @Bean
//    public DaoAuthenticationProvider daoAuthenticationProvider() {
//        DaoAuthenticationProvider provider =
//                new DaoAuthenticationProvider();
//        provider.setPasswordEncoder(bCryptPasswordEncoder);
//        provider.setUserDetailsService(userService);
//        return provider;
//    }
//

}
