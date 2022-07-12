package week1.day2;

public class MyMobile {

	String name = "samsung";
	String colour = "black";

	public static void main(String[] args) {
		MyMobile mb = new MyMobile();
		System.out.println(mb.name);
		System.out.println(mb.colour);
		mb.makeCall();
		mb.sendMsg();
		mb.payBills();
	}

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("make call");
	}

	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("send msg");
	}

	private void payBills() {
		// TODO Auto-generated method stub
		System.out.println("bill payment");
	}
}