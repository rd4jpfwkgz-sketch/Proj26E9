/**
 * 
 */

import java.util.Scanner;
import java.time.LocalDate;
/**
 * 
 */
public class Inicio {
	
	public static void main(String[]args) {
		Gerir_ocorrencia metedos=new Gerir_ocorrencia();
		Scanner ler=new Scanner(System.in);
		int escolha_menu_1;
		
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
	        System.out.println("*        3-Sair                                                                      *");
	        System.out.println("**************************************************************************************");
	        System.out.println("*                                                                                    *");
	        System.out.print("*        Opcao: ");
	        escolha_menu_1=ler.nextInt();
	        System.out.println("*                                                                                    *");
	        System.out.println("**************************************************************************************");
	        ler.nextLine();
	        //registar utilizador
	        if(escolha_menu_1==1) {
	        	System.out.println("*                                                                                    *");
	        	System.out.print("*        Nome Utilizador a registar : ");
	        	String nome_registar=ler.nextLine();;
	        	
	        	//verifica se existe o nome
	        	if(metedos.existe_nome(nome_registar)==1) {
	        		System.out.println("**************************************************************************************");
	        		System.out.println("*                                                                                    *");
		        	System.out.println("*                          O utilizador já existe                                    *");
		        	System.out.println("*                                                                                    *");
	        	}else{
	        		
	        		//se não existir pede o tipo
	        		System.out.println("*                                                                                    *");
	        		System.out.print("*        Tipo Utilizador a registar (Admin/Equipa/Utilizador) : ");
	        		
		        	String tipo_registar=ler.nextLine();
		        	System.out.println("*                                                                                    *");
		        	//verifica se existe o tipo
		        	if(metedos.existe_tipo_utilizador(tipo_registar)==1) {
		        		//se existir cria um objeto Uilizador
		        		Utilizador uti=new Utilizador(nome_registar,tipo_registar);
		        		metedos.registar_utilizador(uti);
		        		System.out.println("**************************************************************************************");
		        		System.out.println("*                                                                                    *");
			        	System.out.println("*                        Utilizador Criado com sucesso                               *");
			        	System.out.println("*                                                                                    *");
		        		
		        	}else {
		        		// se o tipo for invalido
		        		System.out.println("*                                                                                    *");
			        	System.out.println("*                                      Invalido                                      *");
			        	System.out.println("*                                                                                    *");
		        	}
	        	}
	        	
	        	
	        	
	        //login
	        }else if(escolha_menu_1==2) {
	        	System.out.println("*                                                                                    *");
	        	System.out.print("*        Nome Utilizador : ");
	        	String nome_login=ler.nextLine();
	        	System.out.println("*                                                                                    *");
	        	//verifica se existe nome
	        	if(metedos.existe_nome(nome_login)==1) {
	        		System.out.println("*                                                                                    *");
	        		System.out.print("*        Tipo Utilizador (Admin/Equipa/Utilizador) : ");
		        	String tipo_login=ler.nextLine();
		        	System.out.println("*                                                                                    *");
		        	//verifica se existe tipo
		        	if(metedos.existe_tipo_utilizador(tipo_login)==1) {
	        			
	        			
	        			//Segundo menu
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
	        	        System.out.println("*        1-Criar Ocorrencia                                                          *");
	        	        System.out.println("*        2-                                                                          *");
	        	        System.out.println("*        3-                                                                          *");
	        	        System.out.println("*        4-                                                                          *");
	        	        System.out.println("*        5-                                                                          *");
	        	        System.out.println("*        6-                                                                          *");
	        	        System.out.println("**************************************************************************************");
	        	        System.out.println("*                                                                                    *");
	        	        System.out.print("*        Opcao: ");
	        	        int escolha_menu_2=ler.nextInt();
	        	        System.out.println("*                                                                                    *");
	        	        System.out.println("**************************************************************************************");
	        	        ler.nextLine();
	        			//Analise opcoes
	        	        switch(escolha_menu_2) {
	        	        case 1:
	        	        	System.out.println("*                                                                                    *");
	        	        	System.out.print("*        Categoria Ocorrencia : ");
	        	        	String categoria=ler.nextLine();
	        	        	
	        	        	if(metedos.existe_categoria(categoria)==1) {
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.print("*        Título Ocorrencia : ");
		        	        	String titulo_ocorrencia=ler.nextLine();
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.print("*        Descrição Ocorrencia : ");
		        	        	String descricao_ocorrencia=ler.nextLine();
		        	        	LocalDate data_inicio = LocalDate.now(); //data do registo ano-mes-dia
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.print("*        Localização Ocorrencia : ");
		        	        	String localizacao_ocorrencia=ler.nextLine();
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.print("*        Nivel Ocorrencia (1-5) : ");
		        	        	int nivel_ocorrencia=ler.nextInt();
		        	        	
		        	        	//cria objeto ocorrencia
		        	        	Ocorrencia oc=new Ocorrencia(titulo_ocorrencia,descricao_ocorrencia,"Aberto",data_inicio,null,localizacao_ocorrencia,nivel_ocorrencia);
		        	        	
		        	        	metedos.registar_ocorrencia(oc);
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.println("**************************************************************************************");
		        	        	System.out.println("*                                                                                    *");
					        	System.out.println("*                        Ocorrencia Criada com sucesso                               *");
					        	System.out.println("*                                                                                    *");
	        	        	
	        	        	}else {//se não existir categoria
	        	        		System.out.println("**************************************************************************************");
	        	        		System.out.println("*                                                                                    *");
	    			        	System.out.println("*                            Categoria Invalida                                      *");
	    			        	System.out.println("*                                                                                    *");
	        	        	}
	        	        	
	        	        	break;
	        	        	
	        	        }

	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        	        
	        		}else {//se não existir tipo
	        			System.out.println("*                                                                                    *");
			        	System.out.println("*                                 Tipo Invalido                                      *");
			        	System.out.println("*                                                                                    *");
	        		}
	        	}else {//se não existir nome
	        		System.out.println("*                                                                                    *");
		        	System.out.println("*                                 Nome Invalido                                      *");
		        	System.out.println("*                                                                                    *");
	        	}  
	        }else {//Se a opcao for invalida
	        	System.out.println("*                                                                                    *");
	        	System.out.println("*                                      Invalido                                      *");
	        	System.out.println("*                                                                                    *");
	        }
			
			
			
		}while(escolha_menu_1>0 && escolha_menu_1<3);
		//opcao menu invalida
		if(escolha_menu_1>3) {
			System.out.println("**************************************************************************************");
			System.out.println("*                                                                                    *");
        	System.out.println("*                                      Invalido                                      *");
        	System.out.println("*                                                                                    *");
        	System.out.println("**************************************************************************************");
		
		}else {//se for sair
			System.out.println("**************************************************************************************");
			System.out.println("*                                                                                    *");
        	System.out.println("*                                      A sair                                        *");
        	System.out.println("*                                                                                    *");
        	System.out.println("**************************************************************************************");
		}
		
		
	}
	
	
}
