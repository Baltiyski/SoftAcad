package lesson02;

public class Birthday {
	public static void main(String[] args) {
		int i = 0;
		while ( i <= 100) {
			if(i < 15) {
				System.out.println(i + " Celebrate with cake");
			} else if (i < 30){
				System.out.println(i + " Host a party");
			} else if(i > 30 ){
				System.out.println(i + " Don't celebrate");
			}
			i++;
		}
	}
}
