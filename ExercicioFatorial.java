//Nesse exercício, o seu desafio é imprimir os fatoriais de 1 a 10!

public class ExercicioFatorial {

	public static void main(String[] args) {

		int fatorial = 1;
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.print("!" + multiplicador + " = ");
			fatorial = fatorial * multiplicador;
			System.out.print(fatorial);
			System.out.println(" ");
		}

	}

}
	
