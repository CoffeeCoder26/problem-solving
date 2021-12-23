package kareem;

import java.util.Scanner;

public class CheckCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String s = in.next();
		char []ch = s.toCharArray();
		boolean f = true;
		
		for(int i =0; i<ch.length; i++) {
			if(i == a) {
				if(ch[i] != '-') {
					System.out.println("No");
					f = false;
					break;
				}
			} else {
				if(! Character.isDigit(ch[i])) {
					System.out.println("No");
					f = false;
					break;
				}
			}
			
		}
		if(f) {
			System.out.println("Yes");
		}
		

	}

}
