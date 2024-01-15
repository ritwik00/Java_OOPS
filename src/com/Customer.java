package com;

class Customer extends Paytm {
	@Override
	void pay() {
		System.out.println("Pay using paytm");
	}
	@Override
	void purchase() {
		System.out.println("Purchase using Flipkart App");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.pay();
		c.purchase();
	}

}

//Flipkart.java   & Paytm.java