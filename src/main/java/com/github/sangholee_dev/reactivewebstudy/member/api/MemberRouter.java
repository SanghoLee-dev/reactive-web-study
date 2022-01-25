package com.github.sangholee_dev.reactivewebstudy.member.api;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration(proxyBeanMethods = false)
public class MemberRouter {

	@Bean
	public RouterFunction<ServerResponse> memberRoute(final MemberHandler memberHandler) {
		return RouterFunctions.route().GET("/members/{id}",
			accept(MediaType.APPLICATION_JSON),
			memberHandler::getMemberById).build();
	}
}
