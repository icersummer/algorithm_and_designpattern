package com.vjia.creator.builder;

public class Client {

	public Client() {
	}

	public static void main(String[] args) {
		Builder builder = new MinGong();
		Designer designer = new Designer();
		designer.order(builder);
		Room r= builder.getRoom();
		System.out.println(r.getWindow());
	}
}
