package com.csi.accessmodifires;

class Customer{
	private int cusId; //private access modifier
	
	private String custName;
	
	String custAddress; // default

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	
}

public class AccessModifireCoreConcept {
	protected String companyName = "CSI PUNE";
	public static void main(String[] args) {
		
		Customer cc = new Customer();
		cc.setCusId(101);// default Access Modifier
		cc.setCustName("Jerry");
		cc.custAddress="Pune";
		System.out.println("\n Customer Id:"+cc.getCusId());
		System.out.println("\n Customer Name:" + cc.getCustName());
		System.out.println("\n Customer Address:"+ cc.custAddress);
	}
}
