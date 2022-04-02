
public class ExercicioLacos {
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				int numero = (contador * multiplicador);				
				if (numero % 3 == 0) {
					System.out.print(numero);
					System.out.print(" ");
				}			
			}
			System.out.println();	
		}
	}

}
