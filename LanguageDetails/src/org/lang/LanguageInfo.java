package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage(){
	System.out.println("Welcome to Tamil Language");
	}
	public void englishLanguage(){
		System.out.println("Welcome to English Language");
		}
	public void hindiLanguage(){
		System.out.println("Welcome to Hindi Language");
		}
	public static void main(String[] args) {
		LanguageInfo sd=new LanguageInfo();
		sd.southIndia();
		sd.tamilLanguage();
		sd.northIndia();
		sd.hindiLanguage();
		System.out.println("Other then these two ");
		sd.englishLanguage();

	}
}
