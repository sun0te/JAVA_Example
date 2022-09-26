package chap06;	//어노테이션 정의

import java.lang.annotation.*;

@Target({ElementType.METHOD})	//@Target 은 메소드에만 적용
@Retention(RetentionPolicy.RUNTIME)	//@Retention 은 런타임 시까지 어노테이션 정보를 유지

public @interface PrintAnnotation {
	String value() default "-";	//기본 엘리먼트 value 는 구분선에 사용될 문자
	int number() default 15;	//number 는 반복 출력 횟수
}
