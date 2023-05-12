package uno.edu.ar;

public class repaso {
	public static boolean esImpar(int n) {
		if(n % 2 == 0)
			return false;
		else
			return true;
	}
	public static int sumaDeMultiplos(int n){
		int [] vectorImpar = new int [n];
		int [] vectorM = new int [n];
		int suma = 0;
		int div = 0;
		for(int i = 0; i < n; i++) {
			if(i % 3 == 0) {
				div = i/3;
				
			}
				
		}
		return 0;
	}


	public static void main(String[] args) {
		

boolean esImpar = esImpar(5);
System.out.println(esImpar);
}




	

}
