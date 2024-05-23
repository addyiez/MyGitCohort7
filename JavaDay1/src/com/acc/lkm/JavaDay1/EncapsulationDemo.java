package com.acc.lkm.JavaDay1;

public class EncapsulationDemo {

	private String account_holder;
	private int CVV;
	private double balance;
	private int OTP;

	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getOTP() {
		return OTP;
	}

	public void setOTP(int oTP) {
		OTP = oTP;
	}

	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setAccount_holder("Arvind");
		ed.setBalance(80000.00);
		ed.setCVV(611);
		ed.setOTP(177);
		System.out.println(ed.getAccount_holder() + "\n" + ed.getBalance() + "\n" + ed.getOTP() + "\n" + ed.getCVV());
	}

}
