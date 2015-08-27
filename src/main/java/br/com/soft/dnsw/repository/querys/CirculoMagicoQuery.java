package br.com.soft.dnsw.repository.querys;

public class CirculoMagicoQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT circulo_magico.* "
			+ " FROM tb_circulo_magico circulo_magico "
			+ " WHERE circulo_magico.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND circulo_magico.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND circulo_magico.id_sistema = :idSistema "
			+ " AND circulo_magico.flag_ativo = :flagAtivo "
			+ " ORDER BY circulo_magico.id_circulo_magico ";
}
