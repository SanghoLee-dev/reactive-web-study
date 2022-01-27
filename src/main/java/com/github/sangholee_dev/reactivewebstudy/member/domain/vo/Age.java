package com.github.sangholee_dev.reactivewebstudy.member.domain.vo;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of = "age")
public class Age {
	private int age;
	private static final int MAX_AGE = 150;

	protected Age(final int age) {
		validateAge(age);
		this.age = age;
	}

	public static Age of(final int age) {
		return new Age(age);
	}

	private void validateAge(final int age) {
		if (age < 0 || age > MAX_AGE) {
			throw new IllegalArgumentException("올바르지 않은 나이 인자값 입니다.: " + age);
		}
	}
}
