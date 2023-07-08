import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		System.out.println("Enter the discount");
		int discount=sc.nextInt();
		double AfterDiscount = amount * (100-discount)/100 ;
		System.out.println("Total Money After Discount " + AfterDiscount);

	}

}
