import java.util.ArrayList;

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
	
}
