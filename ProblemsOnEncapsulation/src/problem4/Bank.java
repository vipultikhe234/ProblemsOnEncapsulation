package problem4;

public class Bank {
	private static String bankName = "Bank Of India";
	private String name;
	private long acNumber;
	private double amount = 5000;
	private double deposit;
	private double withdraw;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(long acNumber) {
		this.acNumber = acNumber;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public static String getBankName() {
		return bankName;
	}
}
