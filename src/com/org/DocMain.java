package com.org;

public class DocMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		WordDocument originDoc=new WordDocument();
		Content content = new Content();
		content.setmCreateTimes("2018/10/08 16:20:35");
		content.setmTexts("liuzhibao");
		originDoc.setmTexts("�ͻ�����");
		originDoc.addImages("���");
		originDoc.addImages("��.����");
		originDoc.setmContent(content);
		originDoc.addMaps("android", "liuzhibao");
		originDoc.showDocument();
		
		// �������
		content = originDoc.getmContent();
		
		WordDocument copyDoc = originDoc.clone();
		content.setmCreateTimes("2018:10:08 16:20:35");
		content.setmTexts("evergrand");
		copyDoc.setmContent(content);
		copyDoc.setmTexts("�ͮ���Ʒ");
		copyDoc.addImages("�ϼ���");
		copyDoc.addMaps("ios", "liuzhibao");
		copyDoc.showDocument();
		originDoc.showDocument();
		
	}

}
