
import java.util.Scanner;

public class Exercio2aularascunho {

	public static void main(String[] args) {
		//Para solicitarmos que o usu�rio digite um dado pelo teclado, ser� necess�rio criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no in�cio desse arquivo)
				Scanner leitor = new Scanner(System.in);
				//Nosso enunciado exige que o professor digite a m�dia da sala, portanto criaremos uma vari�vel chamada media que seja do tipo double
				double media;
				//Al�m disso, ao longo do programa o professor dever� digitar uma nota para cada aluno. Vamos criar uma vari�vel chamada nota, tamb�m do tipo double
				double nota;
				//Por fim, nosso programa quer calcular quantas notas foram superiores � m�dia e quantas foram inferiores. Vamos criar duas vari�veis para essa finalidade: totalInferior, totalSuperior
				int totalInferior=0, totalSuperior=0;
				//Para controlarmos quantas vezes pediremos ao professor que digite as notas (50), vamos criar uma vari�vel que servir� para controlar as voltas do nosso loop. Chamaremos essa vari�vel de i
				int i = 0;
				
				//Agora � preciso solicitar que o professor digite a m�dia da turma
				System.out.println("Por favor, informe a m�dia de notas dessa turma: ");
				media = leitor.nextDouble();
				
				//Para solicitarmos as 50 notas dos alunos, usaremos um loop. Como condi��o, verificaremos se a vari�vel i � menor do que 50 e a cada volta do loop somaremos 1 nessa vari�vel. Com essa l�gica, garantiremos que as instru��es ser�o executadas 50 vezes
				while (i<50) {
					//Em cada uma das 50 vezes que o loop for executado, solicitaremos que o professor digite a nota. � importante ressaltar que a instru��o (i+1) n�o altera o valor da vari�vel i e apenas funcionar� para a EXIBI��O
					System.out.println("Por favor, informe a nota do " + (i+1) + "� aluno");
					nota= leitor.nextDouble();
					
					//Com a nota digitada, precisamos verificar se ela � superior ou inferior � m�dia. Para isso, usaremos o nosso conhecido if
					if (nota>=media) {
						//Caso a condi��o seja verdadeira, vamos somar 1 na vari�vel totalSuperior
						totalSuperior = totalSuperior + 1;
					}else {
						//Caso a condi��o seja falsa, vamos somar 1 na vari�vel totalInferior
						totalInferior = totalInferior + 1;
					}
					
					//Ao final do nosso loop, precisamos incrementar a vari�vel i para garantir que ela, futuramente, chegue ao valor 50 e o loop termine. Faremos isso somando 1 nessa vari�vel. Al�m da nota��o i = i + 1, podemos usar tamb�m i++ ou i+=1
					i++;
				}
				//Uma vez que nosso loop for encerrado e j� tivermos lido todas as 50 notas, al�m de verificado quais est�o acima da m�dia e quais est�o abaixo, precisamos exibir a informa��o final para nosso usu�rio
				System.out.println("Para a turma informada, um total de " + totalSuperior + " alunos obtiveram nota igual ou acima da m�dia, enquanto um total de " + totalInferior + " alunos obtiveram nota abaixo da m�dia.");
				
				leitor.close();
		

	}

}
