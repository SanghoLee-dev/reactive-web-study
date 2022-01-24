package com.github.sangholee_dev.reactivewebstudy.member.api;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.github.sangholee_dev.reactivewebstudy.member.domain.Member;

import reactor.core.publisher.Mono;

@Component
public class MemberHandler {

	public Mono<ServerResponse> getMemberById(ServerRequest serverRequest) {
		final var id = Long.valueOf(serverRequest.pathVariable("id"));
		return ServerResponse.ok()
			.contentType(MediaType.APPLICATION_JSON)
			.body(BodyInserters.fromValue(new Member(id, "name " + id)));
	}
}
