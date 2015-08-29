package br.com.soft.dnsw.repository.querys;

public class CabecalhoFichaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT cabecalho_ficha.* "
			+ " FROM tb_cabecalho_ficha cabecalho_ficha "
			+ " WHERE cabecalho_ficha.nome LIKE CONCAT('%',?,'%') "
			+ " AND cabecalho_ficha.descricao LIKE CONCAT('%',?,'%') "
			+ " AND cabecalho_ficha.id_sistema = ? "
			+ " AND cabecalho_ficha.flag_ativo = ? "
			+ " ORDER BY cabecalho_ficha.id_cabecalho_ficha ";
}
