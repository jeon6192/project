package com.naver.myhome2.sample3;

public class MessageBeanEn implements MessageBean{
	
	public MessageBeanEn() {
		System.out.println("MessageBeanEn 생성자");
	}
	@Override
	public void sayHello(String name) {
		System.out.println("Hello! " + name);
		
	}
}
