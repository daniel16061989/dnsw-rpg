package br.com.soft.dnsw.repository.querys;

public class MagiaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT magia.* "
			+ " FROM tb_magia magia "
			+ " WHERE magia.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND magia.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND magia.id_sistema = :idSistema "
			+ " AND magia.flag_ativo = :flagAtivo "
			+ " ORDER BY magia.id_magia ";
}
