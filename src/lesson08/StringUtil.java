package lesson08;

public class StringUtil {

	public static int getWordsCount(String text){
		String[] words = text.split(" ");
		return words.length;
	}
	
	public static void getWordsWithSpecialChar(String text){
		String[] words = text.split(" ");
		for(int i=0;i<words.length;i++){
			String word = words[i];
			if(		word.contains("'") ||
					word.contains("@") ||
					word.contains("*") ||
					word.contains("-") ||
					word.contains("%")){
				System.out.println(word);
			}
			
		}
	}
	
	public static String findLongestWord(String text ){
		String[] words = text.split(" ");
		int maxLenght = words[0].length();
		String longestWord = words[0];
		for(int i=0;i<words.length;i++){
			if(words[i].length() > maxLenght){
				longestWord = words[i];
				maxLenght = words[i].length();
			}
		}
		return longestWord;
	}
	
	public static String getMostUsedWord(String text){
		String[] words = text.split(" ");
		int maxUsed = 1;
		String mostUsedWord =words[0];
		for(int i=0; i<words.length;i++){
			String word = words[i];
			int repeats = 0;
			for(int j=0;j<words.length;j++){
				if(i!=j){
					if(words[j].equalsIgnoreCase(word)){
						repeats++;
					}
				}
			}
			if(repeats>maxUsed){
				maxUsed = repeats;
				mostUsedWord = word;
			}
		}
		if(maxUsed == 1) return "All words are used per once";
		return mostUsedWord;
	}
	
	
	
	
	
	
}
