package com.github.sangholee_dev.reactivewebstudy.member.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {
	private String postCode;
	private String street;
	private String detail;


}
