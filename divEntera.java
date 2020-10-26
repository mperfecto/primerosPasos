package datos1;

public class divEntera {
	public static void main(String[] args) {

		//Div=div*coc + modulo
		//Div/div = coc + mod/div
		// variables
		int dividendo;
		int divisor;
		int cociente;
		int modulo;
		double res;
		Scanner sc = new Scanner(System.in);

		// entradas
		System.out.println("Introduce dividendo: ");
		dividendo=sc.nextInt();
		
		System.out.println("Introduce divisor: ");
		divisor=sc.nextInt();
		
		//ALG
		     cociente=   dividendo/divisor;
		     modulo=     dividendo%divisor;
		//fallo
		     res=        (double)dividendo/divisor;
		//SALIDAS
		     System.out.println("El resultado de "+dividendo+ " entre "+divisor+" es:");
		     System.out.println("Cociente: "+cociente+" y modulo: "+modulo);
		     
		     System.out.println("El resultado es: "+res);
		     
		     sc.close();
	}
}

