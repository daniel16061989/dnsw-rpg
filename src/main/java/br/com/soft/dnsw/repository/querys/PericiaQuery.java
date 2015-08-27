package br.com.soft.dnsw.repository.querys;

public class PericiaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT pericia.* "
			+ " FROM tb_pericia pericia "
			+ " WHERE pericia.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND pericia.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND pericia.id_sistema = :idSistema "
			+ " AND pericia.flag_ativo = :flagAtivo "
			+ " ORDER BY pericia.id_pericia ";
}
