package chap06;	//������̼� ����

import java.lang.annotation.*;

@Target({ElementType.METHOD})	//@Target �� �޼ҵ忡�� ����
@Retention(RetentionPolicy.RUNTIME)	//@Retention �� ��Ÿ�� �ñ��� ������̼� ������ ����

public @interface PrintAnnotation {
	String value() default "-";	//�⺻ ������Ʈ value �� ���м��� ���� ����
	int number() default 15;	//number �� �ݺ� ��� Ƚ��
}
