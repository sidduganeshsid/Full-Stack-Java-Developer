package com.pack1;

class HelloA
{
	public void dispHelloPub() {
		System.out.println("dispHelloPub() public");
	}
	protected void dispHelloPro() {
		System.out.println("dispHelloPro() protected");
	}
	void dispHelloDef() {
		System.out.println("dispHelloDef() ");
	}
	
	//private method won't participate in inheritance
	private void dispHelloPri() {
		System.out.println("dispHelloPri() private");
	}
}
class HelloB extends HelloA
{
	
	//specialized methods
	public void show() {
		System.out.println("show() specialized method, because this method is not present in the parent class.");
	}
}

public class Hello {

	public static void main(String[] args) {
		
		HelloB hb = new HelloB();
		hb.dispHelloPub();
		hb.dispHelloPro();
		hb.dispHelloDef();
		hb.show();
		
		HelloA hb1 = new HelloB();
		hb1.dispHelloPub();
		hb1.dispHelloPro();
		hb1.dispHelloDef();
		
	
	}

}
