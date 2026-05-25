import java.time.LocalDate;
import java.util.ArrayList;
 
public class Ocorrencia {
	private String categoria; // CORRIGIDO: era ArrayList<Categoria> nunca inicializado
	private String nome_autor;
	private String titulo;
	private String descricao;
	private String estado;
	private LocalDate data_inicial;
	private LocalDate data_final;
	private String localizacao;
	private int nivel_urgencia;
 
	/**
	 * @param nome_autor
	 * @param titulo
	 * @param descricao
	 * @param estado
	 * @param data_inicial
	 * @param data_final
	 * @param localizacao
	 * @param nivel_urgencia
	 * @param categoria
	 * construtor ocorrencia
	 */
	public Ocorrencia(String nome_autor, String titulo, String descricao, String estado, LocalDate data_inicial,
			LocalDate data_final, String localizacao, int nivel_urgencia, String categoria) {
		this.nome_autor = nome_autor;
		this.titulo = titulo;
		this.descricao = descricao;
		this.estado = estado;
		this.data_inicial = data_inicial;
		this.data_final = data_final;
		this.localizacao = localizacao;
		this.nivel_urgencia = nivel_urgencia;
		this.categoria = categoria; // CORRIGIDO: agora é guardada corretamente
	}
 
	public String getNome_autor() {
		return nome_autor;
	}
 
	public String getTitulo() {
		return titulo;
	}
 
	public String getDescricao() {
		return descricao;
	}
 
	public String getEstado() {
		return estado;
	}
 
	public LocalDate getData_inicial() {
		return data_inicial;
	}
 
	public LocalDate getData_final() {
		return data_final;
	}
 
	public String getLocalizacao() {
		return localizacao;
	}
 
	public int getNivel_urgencia() {
		return nivel_urgencia;
	}
 
	public String getCategoria() {
		return categoria;
	}
 
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
 
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
 
	public void setEstado(String estado) {
		this.estado = estado;
	}
 
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
 
	public void setNivel_urgencia(int nivel_urgencia) {
		this.nivel_urgencia = nivel_urgencia;
	}
 
	public void setData_final(LocalDate data_final) {
		this.data_final = data_final;
	}
 
	@Override
	public String toString() {
		if (estado.equals("Concluido")) {
			return "Ocorrencia: " + titulo + " | Estado: " + estado + " | Data Inicio: " + data_inicial + " | Data Final: " + data_final;
		}
		return "Ocorrencia: " + titulo + " | Estado: " + estado + " | Data Inicio: " + data_inicial;
	}
 
	// ver os detalhes
	public void detalhes() {
		if (estado.equals("Concluido")) {
			System.out.println("Ocorrencia: " + titulo + " | Descrição: " + descricao + " | Estado: " + estado+ " | Categoria: " + categoria + " | Data de registo: " + data_inicial+ " | Data final: " + data_final);
		} else {
			System.out.println("Ocorrencia: " + titulo + " | Descrição: " + descricao + " | Estado: " + estado	+ " | Categoria: " + categoria + " | Data de registo: " + data_inicial);
		}
	}
}