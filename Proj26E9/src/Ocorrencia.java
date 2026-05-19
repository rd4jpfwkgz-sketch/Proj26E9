import java.time.LocalDate;

public class Ocorrencia {
	private String titulo;
	private String descricao;
	private String estado;
	private LocalDate data_inicial;
	private LocalDate data_final;
	private String localizacao;
	private int nivel_urgencia;
	
	/**
	 * @param titulo
	 * @param descricao
	 * @param estado
	 * @param data_inicial
	 * @param data_final
	 * @param localizacao
	 * @param nivel_urgencia
	 * Construtor de ocorrencia
	 */
	public Ocorrencia(String titulo, String descricao, String estado, LocalDate data_inicial, LocalDate data_final,
			String localizacao, int nivel_urgencia) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.estado = estado;
		this.data_inicial = data_inicial;
		this.data_final = data_final;
		this.localizacao = localizacao;
		this.nivel_urgencia = nivel_urgencia;
	}
	
}
