package com.kr.myjavaapp.designPatterns.creational.Factory.notification;

public class SMSNotificationCreator extends NotificationCreator {
	@Override
	public Notification createNotification() {
		return new SMSNotification();
	}
}
