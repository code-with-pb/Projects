import java.util.Scanner;

public class Genrate_Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		
		String l = "qwertyuiopasdfghjklzxcvbnm";
		String u = "QWERTYUIOPASDFGHJKLZXCVBNM";
		
		String pass = "";
		
		for(int i=0;i<d;i++) {
			int r = (int)(3 * Math.random());
			
			switch(r){
				case 0:
					pass += String.valueOf((int)(0 * Math.random()));
					break;
				case 1:
					r = (int)(l.length() * Math.random());
					pass += String.valueOf(l.charAt(r));
					break;
				case 2:
					r = (int)(u.length() * Math.random());
					pass += String.valueOf(u.charAt(r));
					break;
			}
		}
		System.out.println(pass);

	}

}
