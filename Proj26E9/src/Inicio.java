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
	        	        if(tipo_login.equals("Utilizador")) {
		        	        System.out.println("*        1-Criar Ocorrencia                                                          *");
	        	        }
	        	        System.out.println("*        2-Pesquisar Ocorrencia                                                      *");
	        	        System.out.println("*        3-Ver detalhes                                                              *");
	        	        System.out.println("*        4-Lista Ocorrencias                                                         *");
	        	        System.out.println("*        5-Editar Ocorrencia                                                         *");

	        	        if(tipo_login.equals("Equipa")||tipo_login.equals("Admin")) {
		        	        System.out.println("*        6-Criar Categoria                                                           *");
	        	        }
	        	        System.out.println("*        7-Logout                                                                    *");
	        	        System.out.println("**************************************************************************************");
	        	        System.out.println("*                                                                                    *");
	        	        System.out.print("*        Opcao: ");
	        	        int escolha_menu_2=ler.nextInt();
	        	        System.out.println("*                                                                                    *");
	        	        System.out.println("**************************************************************************************");
	        	        ler.nextLine();
	        			//Analise opcoes
	        	        switch(escolha_menu_2) {
	        	        
	        	        case 1://criar ocorrencia
	        	        	if(tipo_login.equals("Utilizador")) {
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
			        	        	Ocorrencia oc=new Ocorrencia(nome_login,titulo_ocorrencia,descricao_ocorrencia,"Aberto",data_inicio,null,localizacao_ocorrencia,nivel_ocorrencia);
			        	        	
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
	        	        	}else {
	        	        		System.out.println("**************************************************************************************");
	        	        		System.out.println("*                                                                                    *");
	    			        	System.out.println("*                            Tipo Utilizador Invalido                                *");
	    			        	System.out.println("*                                                                                    *");
	        	        	
	        	        	}
	        	        	break;
	        	        
	        	        case 2://pesquisar ocorrencia
	        	        	
	        	        	System.out.println("**************************************************************************************");
        	        		System.out.println("*                                                                                    *");
    			        	System.out.println("*                            Pesquisar Categoria                                      *");
    			        	System.out.println("*                                                                                    *");
    			        	System.out.println("*                            1- Titulo                                               *");
    			        	System.out.println("*                                                                                    *");
    			        	System.out.println("*                            2- Categoria                                            *");
    			        	System.out.println("*                                                                                    *");
    			        	System.out.println("**************************************************************************************");
    			        	System.out.print("*    Opcao: ");
    			        	
	        	        	int escolha=ler.nextInt();
	        	        	
	        	        	if(escolha==1) {
	        	        		System.out.println("**************************************************************************************");
	        	        		System.out.println("*                                Titulo                                              *");
	    			        	System.out.println("*                                                                                    *");
	    			        	String titulo_pesquisa=ler.nextLine();
	    			        	
	    			        	if(metedos.existe_titulo(titulo_pesquisa)==1) {
	    			        		if(tipo_login.equals("Utilizador")) {
	    			        			metedos.pesquisar_titulo_uti(nome_login, titulo_pesquisa);
	    			        		}else {
	    			        			metedos.pesquisar_titulo(titulo_pesquisa);
	    			        		}
	    			        	}else {
	    			        		System.out.println("**************************************************************************************");
		        	    			System.out.println("*                                                                                    *");
		        	            	System.out.println("*                                Titulo Invalido                                     *");
		        	            	System.out.println("*                                                                                    *");
		        	            	System.out.println("**************************************************************************************");
		        	    		
	    			        	}
	    			        	
	        	        	}else if(escolha==2) {
	        	        		System.out.println("**************************************************************************************");
	        	        		System.out.println("*                                Categoria                                              *");
	    			        	System.out.println("*                                                                                    *");
	    			        	String categoria_pesquisa=ler.nextLine();
	    			        	
	    			        	if(metedos.existe_categoria(categoria_pesquisa)==1) {
	    			        		if(tipo_login.equals("Utilizador")) {
	    			        			metedos.pesquisar_titulo_uti(nome_login, categoria_pesquisa);
	    			        		}else {
	    			        			metedos.pesquisar_titulo(categoria_pesquisa);
	    			        		}
	    			        	}else {
	    			        		System.out.println("**************************************************************************************");
		        	    			System.out.println("*                                                                                    *");
		        	            	System.out.println("*                                Categoria Invalida                                  *");
		        	            	System.out.println("*                                                                                    *");
		        	            	System.out.println("**************************************************************************************");
		        	    		
	    			        	}
	        	        		
	        	        	}else {
	        	        		System.out.println("**************************************************************************************");
	        	    			System.out.println("*                                                                                    *");
	        	            	System.out.println("*                                Escolha Invalida                                    *");
	        	            	System.out.println("*                                                                                    *");
	        	            	System.out.println("**************************************************************************************");
	        	    		
	        	        	}



	        	        
	        	        case 3://ver detalhes 
	        	        	System.out.println("*                                                                                    *");
	        	        	System.out.print("*        Título Ocorrencia : ");
	        	        	String titulo_ocorrencia=ler.nextLine();
	        	        	
	        	        	if(metedos.existe_titulo(titulo_ocorrencia, nome_login)==1) {
	        	        		metedos.lista_ver_detalhes(nome_login, tipo_login);
	        	        	}else {
	        	        		System.out.println("**************************************************************************************");
	        	        		System.out.println("*                                                                                    *");
	    			        	System.out.println("*                            Título invalido                                         *");
	    			        	System.out.println("*                                                                                    *");
	        	        	
	        	        	}
	        	        	break;
	        	        	
	        	        case 4://lista ocorrencias 
	        	        	if(tipo_login.equals("Admin")|| tipo_login.equals("Equipa")) {
	        	        		metedos.lista_ocorrencia_admin();
	        	        	}else {
	        	        		metedos.lista_ocorrencia_utilizador(nome_login);
	        	        	} 	    	
	        	        	break;
	        	        

	        	        case 5://editar
	        	        	//pesquisar por titulo
	        	        	System.out.println("**************************************************************************************");
	        	        	System.out.println("*                                                                                    *");
	        	        	System.out.println("*                            Título Ocorrencia                                       *");
	        	        	System.out.println("*                                                                                    *");
	        	        	System.out.println("**************************************************************************************");
	    					String titulo_editar=ler.nextLine();
	        	        	
	    					if(metedos.existe_titulo_utilizador(nome_login, titulo_editar)==1) {
	    						//menu editar
		        	        	if(metedos.existe_ocorrencias(titulo_editar)==1) {
			        	        	System.out.println("**************************************************************************************");
			    					System.out.println("*                                                                                    *");
			    					System.out.println("*                            1-editar titulo                                         *");
			    					System.out.println("*                                                                                    *");
			    					System.out.println("*                            2-editar descrição                                      *");
			    					System.out.println("*                                                                                    *");
			    					System.out.println("*                            3-editar localização                                    *");
			    					System.out.println("*                                                                                    *");
			    					System.out.println("*                            4-editar nivel de urgência                              *");
			    					System.out.println("*                                                                                    *");
			    					System.out.println("*                            5-Voltar ao inicio                                      *");
			        	        	
			    					System.out.println("**************************************************************************************");
			        	        	System.out.println("*                                                                                    *");
			        		        System.out.print("*        Opcao: ");
			        		        int escolha_menu_editar=ler.nextInt();
			        		        System.out.println("*                                                                                    *");
			        		        System.out.println("**************************************************************************************");
			    					ler.nextLine();
			    					
			    					switch(escolha_menu_editar) {
			    					case 1:

				        	        	System.out.println("*                                                                                    *");
			    						System.out.println("*                           Novo Titulo                                              *");
				        	        	System.out.println("*                                                                                    *");
			    						String nome_editar=ler.nextLine();
			    						// editar titulo
			    						metedos.editar_titulo_ocorrencia(nome_editar, nome_login, titulo_editar);
			    						
			    						break;
			    					case 2:
			    						System.out.println("*                                                                                    *");
			    						System.out.println("*                           Nova Descrição                                           *");
				        	        	System.out.println("*                                                                                    *");
			    						String descricao_editar=ler.nextLine();
			    						//editar descrição
			    						metedos.editar_descricao_ocorrencia(descricao_editar, nome_login, titulo_editar);
			    						break;
			    					
			    						
			    						
			    					case 3:
			    						//editar localização
			    						System.out.println("*                                                                                    *");
			    						System.out.println("*                           Nova Localização                                         *");
				        	        	System.out.println("*                                                                                    *");
				        	        	String localizacao_editar=ler.nextLine();
				        	        	metedos.editar_localizacao_ocorrencia(localizacao_editar, nome_login, titulo_editar);
			    						break;
			    					case 4:
			    						//editar urgencia
			    						System.out.println("*                                                                                    *");
			    						System.out.println("*                         Novo Nível Urgencia (1-5)                                  *");
				        	        	System.out.println("*                                                                                    *");
			    						int nivel_editar=ler.nextInt();
			    						if(nivel_editar>=1 && nivel_editar<=5) {
			    							metedos.editar_nivel_ocorrencia(nivel_editar, nome_login, titulo_editar);
			    						}else {
			    							System.out.println("**************************************************************************************");
					        	        	System.out.println("*                                                                                    *");
					        	        	System.out.println("*                            Nivel  Invalido                                         *");
					        	        	System.out.println("*                                                                                    *");
					        	        	System.out.println("**************************************************************************************");
			    						}
			    					case 5:
			    						break;	
			    						
			    					
			    					}
			    					
	    					}else {
	    						//titulo invalido
		        	        	System.out.println("**************************************************************************************");
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.println("*                            Título Invalido                                         *");
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.println("**************************************************************************************");
	    					}
		        	        	
	    					}else {
	    						//menu editar
		        	        	if(metedos.existe_ocorrencias(titulo_editar)==1) {
			        	        	System.out.println("**************************************************************************************");
			    					System.out.println("*                                                                                    *");
			    					System.out.println("*                            1-Editar Estado                                         *");
			    					System.out.println("*                            2-Voltar ao Inicio                                      *");
			    					
			    					System.out.println("**************************************************************************************");
			        	        	System.out.println("*                                                                                    *");
			        		        System.out.print("*        Opcao: ");
			        		        int escolha_menu_editar=ler.nextInt();
			        		        System.out.println("*                                                                                    *");
			        		        System.out.println("**************************************************************************************");
			    					ler.nextLine();
			    					
			    					if(escolha_menu_editar==1) {
			    						if(metedos.ver_utilizador(tipo_login)==1) {
			    							System.out.println("*                                                                                    *");
				    						System.out.println("*                           Novo Estado (Em Processo / Concluido )                   *");
					        	        	System.out.println("*                                                                                    *");
					        	        	String estado_editar=ler.nextLine();
					        	        	if(metedos.existe_estado(estado_editar)==1) {
					        	        		//editar estado
					        	        		metedos.alterar_estado(estado_editar, titulo_editar);
					        	        	}else {
					        	        		System.out.println("*                                                                                    *");
					    			        	System.out.println("*                                 Estado Invalido                                      *");
					    			        	System.out.println("*                                                                                    *");
					    			        	break;
					        	        	}
			    						}else {
			    							System.out.println("*                                                                                    *");
				    						System.out.println("*                     O utilizador não tem permissões                                *");
					        	        	System.out.println("*                                                                                    *");
					        	        	break;
			    						}
			    						
			    						
			    						
			    					
			    					}
			    					else if (escolha_menu_editar==2){
			    						break;
			    						
			    					
			    					}else {
			    						//titulo invalido
				        	        	System.out.println("**************************************************************************************");
				        	        	System.out.println("*                                                                                    *");
				        	        	System.out.println("*                            Opção Invalida                                         *");
				        	        	System.out.println("*                                                                                    *");
				        	        	System.out.println("**************************************************************************************");
			    					}
			    					
	    					}else {
	    						//titulo invalido
		        	        	System.out.println("**************************************************************************************");
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.println("*                            Título Invalido                                         *");
		        	        	System.out.println("*                                                                                    *");
		        	        	System.out.println("**************************************************************************************");
	    					}}
		        	        break;	
	    					
	    					
		    					
		    					
		    					
		    					
		        	        	
		        	        
	        	        
	        	        	
	        	        
	        	        
	        	        case 6://criar categoria
	        	        	System.out.println("*                                                                                    *");
	        	            System.out.print("*        Nome da Categoria : ");
	        	            String nome_categoria = ler.nextLine();

	        	            // verificar se já existe
	        	            if(metedos.existe_categoria(nome_categoria) == 1) {
	        	                System.out.println("**************************************************************************************");
	        	                System.out.println("*                                                                                    *");
	        	                System.out.println("*                         Categoria já existe                                        *");
	        	                System.out.println("*                                                                                    *");
	        	            } else {
	        	                Categoria nova = new Categoria(nome_categoria);
	        	                metedos.registar_categoria(nova);

	        	                System.out.println("**************************************************************************************");
	        	                System.out.println("*                                                                                    *");
	        	                System.out.println("*                     Categoria criada com sucesso                                   *");
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
