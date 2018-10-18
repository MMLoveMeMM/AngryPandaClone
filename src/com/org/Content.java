package com.org;

public class Content implements Cloneable{

	private String mTexts;
	private String mCreateTimes;
	
	public String getmTexts() {
		return mTexts;
	}
	public void setmTexts(String mTexts) {
		this.mTexts = mTexts;
	}
	public String getmCreateTimes() {
		return mCreateTimes;
	}
	public void setmCreateTimes(String mCreateTimes) {
		this.mCreateTimes = mCreateTimes;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Content ctt = (Content) super.clone();
		return ctt/*super.clone()*/;
	}

}
