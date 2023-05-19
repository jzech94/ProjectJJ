package com.projectJJ.config;



import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.oauth2.server.resource.web.BearerTokenAuthenticationEntryPoint;
import org.springframework.security.oauth2.server.resource.web.access.BearerTokenAccessDeniedHandler;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;

//@Configuration
public class WebSecurityConfig {
	
	@Autowired
	PrivateKeyConverter privateKeyConverter;
	
	@Autowired
	PublicKeyConverter publicKeyConverter;

	@Value("${jwt.public.key}")
	Resource publicKey;

	@Value("${jwt.private.key}")
	Resource privateKey;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		// @formatter:off
		http
				.authorizeHttpRequests((authorize) -> authorize
						.requestMatchers("/h2-consoles/**").permitAll()
						.requestMatchers("/login/**").permitAll()
						.anyRequest().authenticated()
				)
				.httpBasic(Customizer.withDefaults())
				.sessionManagement((session) -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.exceptionHandling((exceptions) -> exceptions
						.authenticationEntryPoint(new BearerTokenAuthenticationEntryPoint())
						.accessDeniedHandler(new BearerTokenAccessDeniedHandler())
				);
		// @formatter:on
		return http.build();
	}

	@Bean
	UserDetailsService users() {
		// @formatter:off
		return new InMemoryUserDetailsManager(
			User.withUsername("user")
				.password("{noop}password")
				.authorities("app")
				.build()
		);
		// @formatter:on
	}

	@Bean
	JwtDecoder jwtDecoder() throws IOException {
		return NimbusJwtDecoder.withPublicKey(publicKeyConverter.convert(this.publicKey.getContentAsString(StandardCharsets.UTF_8))).build();
	}

	@Bean
	JwtEncoder jwtEncoder() throws IOException {
		RSAKey jwk = new RSAKey.Builder(publicKeyConverter.convert(this.publicKey.getContentAsString(StandardCharsets.UTF_8))).privateKey(privateKeyConverter.convert(this.privateKey.getContentAsString(StandardCharsets.UTF_8))).build();
		JWKSource<SecurityContext> jwks = new ImmutableJWKSet<>(new JWKSet(jwk));
		return new NimbusJwtEncoder(jwks);
	}
	
}
