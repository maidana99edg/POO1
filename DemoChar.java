package arreglospruebas;

public class DemoChar {
	public static char[] crearArrays(){
		char []s;
		s = new char[26];
		for(int i = 0; i < 26; i++) {
			s[i] = (char) ('A' + i);
		}
		return s;
		
	}
public static void main(String[] args) {
	char[] a;
	a = crearArrays();
	System.out.println(a);
	Punto p = new Punto(1, 2);
	System.out.println(p.toString());
	System.out.println(p.createArray(4).toString());
	
}
}
