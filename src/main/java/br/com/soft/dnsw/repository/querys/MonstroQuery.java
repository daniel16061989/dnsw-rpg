package br.com.soft.dnsw.repository.querys;

public class MonstroQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT monstro.* "
			+ " FROM tb_monstro monstro "
			+ " WHERE monstro.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND monstro.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND monstro.id_sistema = :idSistema "
			+ " AND monstro.flag_ativo = :flagAtivo "
			+ " ORDER BY monstro.id_monstro ";
}
