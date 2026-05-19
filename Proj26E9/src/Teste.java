/**
 * 
 */
package projeto_grupo_individual;
import java.util.Scanner;
/**
 * 
 */
public class Teste {
	
	public static void main(String[]args) {
		Gerir_ocorrencia metedos=new Gerir_ocorrencia();
		Scanner ler=new Scanner(System.in);
		

		int escolha;
		
		do {
			System.out.println("**************************************************************************************");
			System.out.println("*          __      __    ________    _________         *  Grupo 9 -> PL1             *");
			System.out.println("*         |  |    |  |  /   ___  \\  /         \\        *  Afonso Gomes -> 53579      *");
	        System.out.println("*         |  |    |  |  |  |   | |  \\__     __/        *  Afonso Coelho -> 53706     *");
	        System.out.println("*         |  |    |  |  |  |___| |     |   |           *  Afonso Santos -> 53574     *");
	        System.out.println("*         |  |    |  |  |  ______|     |   |           *  Bernardo Carvalho -> 53697 *");
	        System.out.println("*         |  |    |  |  |  |           |   |           *  Diogo Cardoso -> 54039     *");
	        System.out.println("*         \\  \\____/  /  |  |           |   |           *******************************");
	        System.out.println("*          \\________/   |__|           |___|                                         *");
	        System.out.println("*                                                                                    *");
	        System.out.println("**************************************************************************************");
	        System.out.println("*        1-Registar Utilizador                                                       *");
	        System.out.println("*        2-Login                                                                     *");
	        System.out.println("**************************************************************************************");
	        System.out.print("*        Opcao: ");
	        escolha=ler.nextInt();
	        System.out.println("**************************************************************************************");
	        if(escolha==1) {
	        	
	        }else if(escolha==2) {
	        	System.out.print("*        Nome Utilizador : ");
	        	String nome_login=ler.nextLine();;
	            //verifica se existe 
	        	System.out.print("*        Tipo Utilizador (Admin/Equipa/Utilizador) : ");
	        	String tipo_login=ler.nextLine();;
		        System.out.println("**************************************************************************************");
	        }else {
	        	System.out.println("*                                      Invalido                                      *");
	        }
			
			
			
		}while(escolha>0);
		
		
		//novozzasssssssssssssssd
	}
	
}
