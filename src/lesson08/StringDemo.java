package lesson08;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String text  = "this is a test sentance. It aims to test the task.";
		int wordsCount = StringUtil.getWordsCount(text);
		String mostUsed = StringUtil.getMostUsedWord(text);
		String longestWord = StringUtil.findLongestWord(text);
		StringUtil.getWordsWithSpecialChar(text);
		System.out.println(
				"The count of words is:"+wordsCount+"\n"+
				"The most used word is:"+mostUsed+"\n"+
				"The longest word is:"+longestWord+"\n");;
	}

}
