package test;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("HELLO");
    show();
	}
	public static void show() {

		int [] arr={12,34,56,3,4,5,6};
		
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    }
		
    System.out.println("showing show method");
	}
}
