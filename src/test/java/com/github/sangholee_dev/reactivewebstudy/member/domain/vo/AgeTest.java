package com.github.sangholee_dev.reactivewebstudy.member.domain.vo;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AgeTest {

	@ParameterizedTest
	@MethodSource("wrongAges")
	@DisplayName("나이_데이터가_올바르지_않은_경우")
	void 나이_데이터가_올바르지_않은_경우(final int wrongAge) {
		assertThatThrownBy(() -> new Age(wrongAge))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("올바르지 않은 나이 인자값 입니다.: %s", wrongAge);
	}

	static Stream<Arguments> wrongAges() {
		return Stream.of(
			Arguments.arguments(-20),
			Arguments.arguments(200)
		);
	}
}