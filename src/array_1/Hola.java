package array_1;

public class Hola {
	static void darvuelta(String a) {
		String str = a;
		System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
	}
	

	public static void main(String[] args) {
		darvuelta("hola");
		darvuelta("mundo");
		darvuelta("soy programador");
       
	}

}
