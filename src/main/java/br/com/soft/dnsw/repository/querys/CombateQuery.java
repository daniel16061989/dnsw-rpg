package br.com.soft.dnsw.repository.querys;

public class CombateQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT combate.* "
			+ " FROM tb_combate combate "
			+ " WHERE combate.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND combate.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND combate.id_sistema = :idSistema "
			+ " AND combate.flag_ativo = :flagAtivo "
			+ " ORDER BY combate.id_combate ";
}
