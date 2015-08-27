package br.com.soft.dnsw.repository.querys;

public class ClasseQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT classe.* "
			+ " FROM tb_classe classe "
			+ " WHERE classe.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND classe.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND classe.id_sistema = :idSistema "
			+ " AND classe.flag_ativo = :flagAtivo "
			+ " ORDER BY classe.id_classe ";
}
