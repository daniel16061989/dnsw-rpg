package br.com.soft.dnsw.repository.querys;

public class TendenciaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT tendencia.* "
			+ " FROM tb_tendencia tendencia "
			+ " WHERE tendencia.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND tendencia.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND tendencia.id_sistema = :idSistema "
			+ " AND tendencia.flag_ativo = :flagAtivo "
			+ " ORDER BY tendencia.id_tendencia ";
}
