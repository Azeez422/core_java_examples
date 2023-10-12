package OOPS;
    public class Overloading {
	 void hello(int a,String b) {
		System.out.println(a+b);
	}

	 void hello(int b,int a) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.hello(5, "erripuka");
		ol.hello(10,5);
		
	}
}
 