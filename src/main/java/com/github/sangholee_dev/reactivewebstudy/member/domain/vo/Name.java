package com.github.sangholee_dev.reactivewebstudy.member.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Name {
	private String name;

	public Name(final String name) {
		this.name = name;
	}
}
