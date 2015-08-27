package br.com.soft.dnsw.repository.querys;

public class ItemQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT item.* "
			+ " FROM tb_item item "
			+ " WHERE item.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND item.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND item.id_sistema = :idSistema "
			+ " AND item.flag_ativo = :flagAtivo "
			+ " ORDER BY item.id_item ";
}
