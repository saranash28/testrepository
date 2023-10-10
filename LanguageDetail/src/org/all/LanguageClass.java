package org.all;

import org.tamil.Tamil;

public class LanguageClass extends Tamil {
	public void allLanguage()
	{
		System.out.println("Select Language which you prefered ");
	}

	public static void main(String[] args) {
		LanguageClass m = new LanguageClass();
		m.allLanguage();
		m.tamilLanguage();
		m.englishLanguage();
		m.teluguLanguage();
	}
}
