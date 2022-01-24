package com.github.sangholee_dev.reactivewebstudy.member.api;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration(proxyBeanMethods = false)
public class MemberRouter {

	public RouterFunction<ServerResponse> route(final MemberHandler memberHandler) {
		return RouterFunctions.route(GET("/members/{id}").and(accept(MediaType.APPLICATION_JSON)),
			memberHandler::getMemberById);
	}
}
