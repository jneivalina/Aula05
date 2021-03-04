import java.util.Scanner;
public class Exercício1aula5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numerodoUsuario;
		int resultado;
		System.out.println("Digite um número para saber sua tabuada");
		numerodoUsuario=leitor.nextInt();
		
		for(int i=1;i<=10;i++) {
			resultado=numerodoUsuario*i;
			System.out.println(i);
			
		
	}
		leitor.next();

		leitor.close();
}

}