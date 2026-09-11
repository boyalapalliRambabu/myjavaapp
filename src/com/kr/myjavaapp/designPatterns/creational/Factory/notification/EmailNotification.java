package com.kr.myjavaapp.designPatterns.creational.Factory.notification;

public class EmailNotification implements Notification {

	@Override
	public void send(String message) {
		System.out.println("Sending email: " + message);
	}

}
