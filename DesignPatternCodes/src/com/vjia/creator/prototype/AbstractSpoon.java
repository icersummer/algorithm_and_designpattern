package com.vjia.creator.prototype;

public class AbstractSpoon implements Cloneable {

	String spoonName;

	public String getSpoonName() {
		return spoonName;
	}

	public void setSpoonName(String spoonName) {
		this.spoonName = spoonName;
	}

	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return object;

	}
}
