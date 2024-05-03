package chapter03.iftest;

public class Ifexample06 {

	public static void main(String[] args) {
		// 1Á¡ ~ 6Á¡±îÁö ¹ÞÀ» ¼ö ÀÖÀ½ °¢ Á¡¼ö´ç ºÐ½Ä ½î±â
		int num=(int)(Math.random()*6)+1;//6¹øÀ» µ·´Ù

		if(num==1) {
		System.out.println("1Á¡ > ¼ø´ë");
		}else if(num==2) {
		System.out.println("2Á¡ > ¿ÀÂ¡¾îÆ¢±è");
		}else if(num==3) {
		System.out.println("3Á¡ > ¶±ººÀÌ");
		}else if(num==4) {
		System.out.println("4Á¡ > ±è¸»ÀÌ");
		}else if(num==5) {
		System.out.println("5Á¡ > ¾î¹¬");
		}else {
		System.out.println("6Á¡ > ±è¹ä");
		}

	}

}
