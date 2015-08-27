package br.com.soft.dnsw.repository.querys;

public class SistemaQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT sistema.* "
			+ " FROM tb_sistema sistema "
			+ " WHERE sistema.nome LIKE CONCAT('%',?,'%') "
			+ " AND sistema.descricao LIKE CONCAT('%',?,'%') "
			+ " AND sistema.flag_ativo = ? "
			+ " ORDER BY sistema.id_sistema ";
}