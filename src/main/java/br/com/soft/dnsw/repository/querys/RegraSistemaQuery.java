package br.com.soft.dnsw.repository.querys;

public class RegraSistemaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT regra_sistema.* "
			+ " FROM tb_regra_sistema regra_sistema "
			+ " WHERE regra_sistema.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND regra_sistema.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND regra_sistema.id_sistema = :idSistema "
			+ " AND regra_sistema.flag_ativo = :flagAtivo "
			+ " ORDER BY regra_sistema.id_regra_sistema ";
}
