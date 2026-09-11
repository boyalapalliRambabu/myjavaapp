package com.kr.myjavaapp.designPatterns.creational.Factory.notification;

public class SMSNotification implements Notification {
	@Override
	public void send(String message) {
		System.out.println("Sending SMS: " + message);
	}
}
