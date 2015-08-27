package br.com.soft.dnsw.repository.querys;

public class RacaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT raca.* "
			+ " FROM tb_raca raca "
			+ " WHERE raca.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND raca.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND raca.id_sistema = :idSistema "
			+ " AND raca.flag_ativo = :flagAtivo "
			+ " ORDER BY raca.id_raca ";
}
