package com.vjia.creator.builder;

public class Designer {

	public Designer() {
	}

	public void order(Builder builder) {
		builder.makeWindow();
		builder.makeFloor();
	}
}
