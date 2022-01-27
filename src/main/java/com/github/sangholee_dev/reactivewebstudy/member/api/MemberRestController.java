package com.github.sangholee_dev.reactivewebstudy.member.api;

import java.net.URI;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sangholee_dev.reactivewebstudy.member.domain.Member;
import com.github.sangholee_dev.reactivewebstudy.member.service.MemberService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class MemberRestController {
	private final MemberService memberService;

}
