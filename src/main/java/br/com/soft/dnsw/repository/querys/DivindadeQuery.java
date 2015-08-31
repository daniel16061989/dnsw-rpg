package br.com.soft.dnsw.repository.querys;

public class DivindadeQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT divindade.* "
			+ " FROM tb_divindade divindade "
			+ " WHERE divindade.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND divindade.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND divindade.id_sistema = :idSistema "
			+ " AND divindade.flag_ativo = :flagAtivo "
			+ " ORDER BY divindade.nome ";
}
