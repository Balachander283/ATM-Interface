package com.java.atmInterface;

public interface AtmOperations {

	public void ViewBalance();

	public void withdrawAmount(double withdrawAmount);

	public void transferAmount(double accountNumber, double transferAmount);

	public void depositAmount(double depositAmount);

	public void viewMiniStatement();
}
