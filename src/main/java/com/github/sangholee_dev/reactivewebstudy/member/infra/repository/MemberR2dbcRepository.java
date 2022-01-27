package com.github.sangholee_dev.reactivewebstudy.member.infra.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.github.sangholee_dev.reactivewebstudy.member.domain.Member;

public interface MemberR2dbcRepository extends ReactiveCrudRepository<Member, Long> {
}
