package br.com.soft.dnsw.repository.querys;

public class DesvantagemQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT desvantagem.* "
			+ " FROM tb_desvantagem desvantagem "
			+ " WHERE desvantagem.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND desvantagem.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND desvantagem.id_sistema = :idSistema "
			+ " AND desvantagem.flag_ativo = :flagAtivo "
			+ " ORDER BY desvantagem.id_desvantagem ";
}
