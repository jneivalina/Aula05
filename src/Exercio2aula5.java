

import java.util.Scanner;

public class Exercio2aula5 {

	public static void main(String[] args) {
		
				Scanner leitor = new Scanner(System.in);
				
				double media;
				
				double nota;
				
				int totalInferior=0, totalSuperior=0;
				
				//int i = 0;//
				
				for(int i=0; i<50;i++) {
				System.out.println("Por favor, informe a média de notas dessa turma: ");
				media = leitor.nextDouble();
				
				//while (i<50) {
					
					System.out.println("Por favor, informe a nota do " + (i+1) + "º aluno");
					nota= leitor.nextDouble();
					
					
					if (nota>=media) {
						
						totalSuperior = totalSuperior + 1;
					}else {
						
						totalInferior = totalInferior + 1;
					}
					
					
					//i++;//
				}
				
				System.out.println("Para a turma informada, um total de " + totalSuperior + " alunos obtiveram nota igual ou acima da média, enquanto um total de " + totalInferior + " alunos obtiveram nota abaixo da média.");
				
				leitor.close();
		

	}

}
