package com.github.sangholee_dev.reactivewebstudy.member.service;

import org.springframework.stereotype.Service;

import com.github.sangholee_dev.reactivewebstudy.member.domain.Member;
import com.github.sangholee_dev.reactivewebstudy.member.infra.repository.MemberR2dbcRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberR2dbcRepository memberR2dbcRepository;

	public Mono<Member> createMember () {
		return memberR2dbcRepository.save(new Member());
	}
}
