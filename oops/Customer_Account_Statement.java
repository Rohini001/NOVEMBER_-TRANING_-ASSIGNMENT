package com.example.assigment.oops;

public class Customer_Account_Statement extends Customer3 {
	private int CAID;
	private int CustId;
	private long amount;
	private long deposit_withdrawl;
	private String deposit_date;


	public Customer_Account_Statement(int custId, int accountno, String custname, String cust_address, String cust_dob,
			String cust_account_opening_date, String branch_Obj, int cAID, int custId2, long amount,
			long deposit_withdrawl, String deposit_date) {
		super(custId, accountno, custname, cust_address, cust_dob, cust_account_opening_date, branch_Obj);
		CAID = cAID;
		CustId = custId2;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	public int getCAID() {
		return CAID;
	}

	public void setCAID(int cAID) {
		CAID = cAID;
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(long deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}


	public String toString() {
		return "Customer_Account_Statement [CAID=" + CAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}

	
}
