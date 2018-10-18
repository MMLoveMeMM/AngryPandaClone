package com.org;

public class DocMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		WordDocument originDoc=new WordDocument();
		Content content = new Content();
		content.setmCreateTimes("2018/10/08 16:20:35");
		content.setmTexts("liuzhibao");
		originDoc.setmTexts("油画作者");
		originDoc.addImages("梵高");
		originDoc.addImages("达.芬奇");
		originDoc.setmContent(content);
		originDoc.addMaps("android", "liuzhibao");
		originDoc.showDocument();
		
		// 做个深拷贝
		content = originDoc.getmContent();
		
		WordDocument copyDoc = originDoc.clone();
		content.setmCreateTimes("2018:10:08 16:20:35");
		content.setmTexts("evergrand");
		copyDoc.setmContent(content);
		copyDoc.setmTexts("油畫作品");
		copyDoc.addImages("毕加索");
		copyDoc.addMaps("ios", "liuzhibao");
		copyDoc.showDocument();
		originDoc.showDocument();
		
	}

}
