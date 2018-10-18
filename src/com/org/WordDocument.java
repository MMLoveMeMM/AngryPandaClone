package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordDocument implements Cloneable{

	private String mTexts;
	private ArrayList<String> mImages=new ArrayList<String>();
	private Map<String,String> mMaps=new HashMap<String,String>();
	
	private Content mContent=new Content();
		
	public WordDocument() {
		System.out.println("���캯��");
	}
	
	public Map<String, String> getmMaps() {
		return mMaps;
	}

	public void setmMaps(Map<String, String> mMaps) {
		this.mMaps = mMaps;
	}
	
	public void addMaps(String key,String value) {
		this.mMaps.put(key, value);
	}

	public Content getmContent() throws CloneNotSupportedException {
		return (Content) mContent.clone();
	}

	public void setmContent(Content mContent) {
		this.mContent = mContent;
	}

	public String getmTexts() {
		return mTexts;
	}

	public void setmTexts(String mTexts) {
		this.mTexts = mTexts;
	}

	public ArrayList<String> getmImages() {
		return mImages;
	}

	public void setmImages(ArrayList<String> mImages) {
		this.mImages = mImages;
	}
	
	public void addImages(String image) {
		this.mImages.add(image);
	}
	
	public void showDocument() {
		System.out.println("mTexts : "+mTexts);
		for(String im:mImages) {
			System.out.println("image : "+im);
		}
		System.out.println("mContent mTexts : "+mContent.getmTexts());
		System.out.println("mContent CreateTimes : "+mContent.getmCreateTimes());
		System.out.println("----------------------------------");
	}

	@Override
	protected WordDocument clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		WordDocument doc = (WordDocument) super.clone();
		doc.mTexts = this.mTexts;
		doc.mImages = (ArrayList<String>) this.mImages.clone();
		doc.mContent = this.mContent;
		/*
		 * ���ϵ���ν���������һ
		 */
		// doc.mMaps.putAll(this.mMaps);
		/*
		 * ���ϵ���ν�����������
		 */
		// mapDeepCopy(this.mMaps,doc.mMaps);
		/*
		 * ������99.999999999%�Ļ����϶��Ǵ��,��������ʲô���.
		 * */
		/*
		 * ��������������
		 * */
		doc.mMaps=new HashMap(this.mMaps);
		return doc;
	}
	
	public static void mapDeepCopy(Map paramsMap,Map resultMap) {
		resultMap=null;
		if(resultMap==null) {
			resultMap =new HashMap();
		}
		if(paramsMap==null) {
			return ;
		}
		
		Iterator it = paramsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			Object key=entry.getKey();
			resultMap.put(key, paramsMap.get(key)!=null?paramsMap.get(key):"");
		}

	}
	
}
