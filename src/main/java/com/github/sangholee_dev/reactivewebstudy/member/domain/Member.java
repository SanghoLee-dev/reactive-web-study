package com.github.sangholee_dev.reactivewebstudy.member.domain;

import org.springframework.data.annotation.Id;

import com.github.sangholee_dev.reactivewebstudy.member.domain.vo.Profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	@Id
	private Long id;
	private Profile profile;
}
