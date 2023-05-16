package problem3;

public class Bill {
	int counter;
	String billId="B9001";
	String paymentMode;

	public Bill(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getCounter() {
		return counter;
	}

}
