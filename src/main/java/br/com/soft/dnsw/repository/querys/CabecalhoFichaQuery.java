package br.com.soft.dnsw.repository.querys;

public class CabecalhoFichaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT cabecalho_ficha.* "
			+ " FROM tb_cabecalho_ficha cabecalho_ficha "
			+ " WHERE cabecalho_ficha.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND cabecalho_ficha.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND cabecalho_ficha.id_sistema = :idSistema "
			+ " AND cabecalho_ficha.flag_ativo = :flagAtivo "
			+ " ORDER BY cabecalho_ficha.id_cabecalho_ficha ";
}
