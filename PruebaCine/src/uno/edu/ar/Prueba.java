package uno.edu.ar;

public class Prueba {
		
		private boolean [][] sala;
		public int f=0, b=0;
		
		//constructor
		public Prueba (int filas, int butacas) {
			this.f = filas;
			this.b = butacas;
			this.sala = new boolean [filas][butacas];
		
		}
		
		public int getF() {
			return f;
		}

		public int getB() {
			return b;
		}

		public boolean estaOcupada(int fila, int asiento) {
			boolean ocupado = false;
	        if (sala[fila][asiento] == true) {
	            ocupado = true;
	        }

	        return ocupado;
		
		}
		public void ocuparButaca(int fila, int asiento) {
			if (sala[fila][asiento] == false) {
				sala[fila][asiento] = true;
		 }
		}
		public int cantidadDeButacasOcupadas() {
			int asientosOcupados=0;
			for (int f=0; f<5; f++) {
				for (int b=0; b<8; b++) {
					if (this.sala[f][b])
						asientosOcupados+=1;
				}
			}
			return asientosOcupados;
		}
		
		boolean hayEspacioPara(int cantidadDePersonas) {
			boolean cantPersonas = false;
			int cant = 0; // controla asientos disponibles por fila

			for(int i = 0; i < this.f; i++) {
				for(int j = 0; j < this.b; j++) {
					if(sala[i][j] == false) {
						cant++;
					}
				}
				
				if(cantidadDePersonas <= cant) {
					cantPersonas = true;
					i = this.f;
				}
				
				cant = 0; //resetea el conteo por fila
				
			}
			
			return cantPersonas;
		}
}
