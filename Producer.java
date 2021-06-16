package com.yc.bean02;

import java.util.Random;
public class Producer implements Runnable{
	//操作资源:applebox
	AppleBox ab=null;
	public Producer(AppleBox ab) {
		this.ab=ab;
	}
	public void run() {
		Random rd=new Random();
		for(int i=1;i<=20;i++) {
			Apple app=new Apple(i);
			ab.deposite(app);
			System.out.println("生产了："+app.id+"苹果");
			try {
				Thread.sleep(rd.nextInt(500));
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
	}
}
