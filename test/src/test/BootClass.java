package test;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("HELLO");
    show();
	}
	public static void show() {
		int [] arr={54,6,98,234};
		int sum=0;
    for(int n:arr) {
    	sum+=n;
    	System.out.println(n);
    }
    System.out.println("showing show method");
	}
}
