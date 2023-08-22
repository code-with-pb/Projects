import java.util.*;

class Pass{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Digit: ");
		int n = sc.nextInt();

		String s = "qwertyuioplkjhgfdsazxcvbnm";
		String a = "QWERTYUIOPLKJHGFDSAMNBVCXZ";

		String Pass = "";	

		for(int i=0;i<n;i++){
			int r = (int)(3 * Math.random());
	
			switch(r){
				case 0:
					Pass += String.valueOf((int) (0 * Math.random()));
					break;
				case 1:
					r = (int)(s.length() * Math.random());
					Pass += String.valueOf(s.charAt(r));
					break;
				case 3:
					r = (int)(a.length() * Math.random());
					Pass += String.valueOf(a.charAt(r));
					break;
			}
		}
		System.out.println(Pass);
	}
}