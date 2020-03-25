import java.util.Scanner;


public class corona {
public static void main(String args[]) {
	char name,nationality;
	Scanner input=new Scanner(System.in);
	int passNo;
	System.out.println("Enter your Name");
	name=input.next().charAt(0);
	System.out.println("Enter your passport no");
	passNo=input.nextInt();
	System.out.println("Enter your nationaliy");
	nationality=input.next().charAt(0);
	System.out.println("Enter first letter of the country  from where u r coming ");
	char ch=input.next().charAt(0);
	switch(ch) {
	case 'c':
		System.out.println("you Should go through the screening process");
		break;
	
	case 'C':
		System.out.println("you Should go through the screening process");
		break;
	case 'i':
		System.out.println("you Should go through the screening process");
		break;
	case 'I':       																																																																																																											   
		System.out.println("you Should go through the screening process");
		break;
		default:
			System.out.println("have you travelled Iran or China for last 14 days(Y/N)");
			char C=input.next().charAt(0);
			switch(C) {
			case 'Y':
				System.out.println("you Should go through the screening process");
				break;
			case 'N':
				System.out.println("You can go now.Stay safe and strong");
				break;
				default:
					System.out.println("You can go now .Stay safe and Strong");
			}
	}
}
}
