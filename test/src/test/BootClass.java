package test;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("HELLO");
    show();
	}
	public static void show() {
		int [] arr={12,34,56,3,4,5,6};
		int sum=0;
    for(int n:arr) {
    	sum+=n;
    	System.out.println(n);
    }
    System.out.println("showing show method");
	}
}
