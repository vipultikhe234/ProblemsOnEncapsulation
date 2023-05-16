package problem3;

import java.util.Scanner;

public class MakeBill {
	Scanner sc;

	public void modeOfPayment() {
		sc = new Scanner(System.in);
		System.out.println("Enter mode of payment");
		String mode = sc.next();
		Bill bi = new Bill(mode);
		System.out.println("Bill detail");
		System.out.println("Bill Id : "+bi.getBillId());
		System.out.println("Payment Method : "+bi.paymentMode);
	}
}
