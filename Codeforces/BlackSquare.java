import java.util.Scanner;

public class BlackSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[4];
		int cal = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		String str =sc.next();
		for (int i = 0; i < str.length(); i++) {
			if(Character.getNumericValue(str.charAt(i))==1)
				cal+=arr[0];
			else if(Character.getNumericValue(str.charAt(i))==2)
				cal+=arr[1];
			else if(Character.getNumericValue(str.charAt(i))==3)
				cal+=arr[2];
			else if(Character.getNumericValue(str.charAt(i))==4)
				cal+=arr[3];
			
		}
		System.out.println(cal);
	}

}
