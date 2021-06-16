package com.yc.bean02;

public class Test01 {
	public static void main(String[] args) {
		AppleBox ab=new AppleBox();//对象锁box
		
		Producer producer=new Producer(ab);
		Customer customer01=new Customer(ab);
		Customer customer02=new Customer(ab);
		new Thread(producer).start();
		new Thread(customer01).start();
		new Thread(customer02).start();
	}
}
