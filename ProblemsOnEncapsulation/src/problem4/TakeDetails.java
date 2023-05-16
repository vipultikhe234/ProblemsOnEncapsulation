package problem4;

import java.util.Scanner;

public class TakeDetails {
	Scanner sc = new Scanner(System.in);
	Bank bk = new Bank();

	public void info() {
		System.out.println("Enter choice \n1.Deposit\n2.Withdraw");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter Bank Details");
			System.out.println("Enter Name of Account Holder");
			String name = sc.next();
			System.out.println("Enter Account Number");
			long acNumber = sc.nextLong();
			System.out.println("Enter Deposited Amount");
			double deposit = sc.nextDouble();
			double total = bk.getAmount() + deposit;
			bk.setName(name);
			bk.setAcNumber(acNumber);
			bk.setDeposit(deposit);
			bk.setAmount(total);
		} else {
			System.out.println("Enter Bank Details");
			System.out.println("Enter Name of Account Holder");
			String name = sc.next();
			System.out.println("Enter Account Number");
			long acNumber = sc.nextLong();
			System.out.println("Enter withdrawed Amount");
			double withdraw = sc.nextDouble();
			if (withdraw < bk.getAmount()) {
				double total = (bk.getAmount() - withdraw);
				bk.setName(name);
				bk.setAcNumber(acNumber);
				bk.setWithdraw(total);

			} else {
				System.out.println("insufficient amount ");
			}
		}

	}

	public void showInfo() {
		System.out.println("=======================================");
		System.out.println("Bank Name : " + Bank.getBankName());
		System.out.println("Account Holder Name : " + bk.getName());
		System.out.println("Accout Number : " + bk.getAcNumber());
		System.out.println("Amount in bank : " + bk.getAmount());
		System.out.println("=======================================");

	}
}
