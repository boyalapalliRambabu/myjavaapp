package com.kr.myjavaapp.designPatterns.creational.Factory.notification;

public class PushNotificationCreator extends NotificationCreator {
	@Override
	public Notification createNotification() {
		return new PushNotification();
	}
}
