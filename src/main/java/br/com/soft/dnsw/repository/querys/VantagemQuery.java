package br.com.soft.dnsw.repository.querys;

public class VantagemQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT vantagem.* "
			+ " FROM tb_vantagem vantagem "
			+ " WHERE vantagem.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND vantagem.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND vantagem.id_sistema = :idSistema "
			+ " AND vantagem.flag_ativo = :flagAtivo "
			+ " ORDER BY vantagem.id_vantagem ";
}
