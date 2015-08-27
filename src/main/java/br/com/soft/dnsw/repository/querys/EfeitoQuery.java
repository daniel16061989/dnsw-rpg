package br.com.soft.dnsw.repository.querys;

public class EfeitoQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT efeito.* "
			+ " FROM tb_efeito efeito "
			+ " WHERE efeito.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND efeito.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND efeito.id_sistema = :idSistema "
			+ " AND efeito.flag_ativo = :flagAtivo "
			+ " ORDER BY efeito.id_efeito ";
}
