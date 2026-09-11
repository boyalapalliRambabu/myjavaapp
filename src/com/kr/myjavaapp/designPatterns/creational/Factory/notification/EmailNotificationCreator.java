package com.kr.myjavaapp.designPatterns.creational.Factory.notification;

public class EmailNotificationCreator extends NotificationCreator {
	@Override
	public Notification createNotification() {
		return new EmailNotification();
	}
}
