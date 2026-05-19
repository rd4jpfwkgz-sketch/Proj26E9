import java.util.ArrayList;
import java.util.Scanner;

public class Gerir_ocorrencia {
	private ArrayList<Ocorrencia> lista_correncias;
	private ArrayList<Utilizador> lista_utilizadores;
	private ArrayList<Categoria> lista_categoria;
	
	/**
	 * Construtor do gerir ocorrencia
	 */
	public Gerir_ocorrencia( ) {
		this.lista_correncias = new ArrayList<Ocorrencia>();
		this.lista_utilizadores = new ArrayList<Utilizador>();
		this.lista_categoria = new ArrayList<Categoria>();
	}
	
	public int existe_nome(String nome) {
		
		for(Utilizador u:lista_utilizadores) {
			if(u.getNome().equals(nome)) {
				return 1;
			}
		}
		return 0;
	}
	
	public int existe_tipo_utilizador(String tipo) {
		if(tipo.equals("Admin")||tipo.equals("Equipa")||tipo.equals("Utilizador")) {
			return 1;
		}
		return 0;
	}
	
	public void registar_utilizador(Utilizador uti) {
		lista_utilizadores.add(uti);
	}
	
	public int existe_categoria(String cat) {
		for(Categoria u:lista_categoria) {
			if(u.getNome().equals(cat)) {
				return 1;
			}
		}
		return 0;
	}
	
	public void registar_ocorrencia(Ocorrencia o) {
		lista_correncias.add(o);
	}
	public void editar_ocorrencias() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o titulo da ocorrência que pretende editar");
		String titulo=sc.nextLine();
		for (Ocorrencia o:lista_correncias) {
			if(o.getTitulo().equalsIgnoreCase(titulo)) {
				int opcao;
				do {
					System.out.println("Selecione o que pretende editar:");
					System.out.println("1-editar titulo");
					System.out.println("2-editar descrição");
					System.out.println("3-editar Estado");
					System.out.println("4-editar localização");
					System.out.println("5-editar nivel de urgência");
					System.out.println("0- sair");
					opcao=sc.nextInt();
					sc.nextLine();
					switch(opcao) {
					case 1:
						System.out.println("Novo Titulo:");
						o.setTitulo(sc.nextLine());
						break;
					case 2:
						System.out.println("Nova Descrição:");
						o.setDescricao(sc.nextLine());
						break;
					case 3:
						System.out.println("Novo Estado");
						o.setEstado(sc.nextLine());
						break;
					case 4:
						System.out.println("Nova Localização:");
						o.setLocalizacao(sc.nextLine());
						break;
					case 5:
						System.out.println("Novo nível de urgência:");
						o.setNivel_urgencia(sc.nextInt());
						break;
					case 0:
						System.out.println("Edição terminada!");
						break;
					
					}	
				}while (opcao !=0);
				return;
				
			}
		}
		System.out.println("Esta ocorrência não existe");
	}
	
	
}
