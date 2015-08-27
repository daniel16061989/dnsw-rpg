package br.com.soft.dnsw.repository.querys;

public class AtributoQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT atributo.* "
			+ " FROM tb_atributo atributo "
			+ " WHERE atributo.nome LIKE CONCAT('%',?,'%') "
			+ " AND atributo.descricao LIKE CONCAT('%',?,'%') "
			+ " AND atributo.id_sistema = ? "
			+ " AND atributo.flag_ativo = ? "
			+ " ORDER BY atributo.id_atributo ";
}