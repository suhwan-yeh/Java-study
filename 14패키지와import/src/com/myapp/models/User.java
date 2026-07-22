package com.myapp.models;

public class User {

		String name;
		public User(String name) {
			this.name = name;
		}
		public void printInfo() {
			System.out.println("내 앱 사용자 :" + this.name);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
