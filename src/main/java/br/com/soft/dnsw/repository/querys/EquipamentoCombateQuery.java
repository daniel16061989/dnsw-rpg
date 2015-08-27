package br.com.soft.dnsw.repository.querys;

public class EquipamentoCombateQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT equipamento_combate.* "
			+ " FROM tb_equipamento_combate equipamento_combate "
			+ " WHERE equipamento_combate.nome LIKE CONCAT('%',:nome,'%') "
			+ " AND equipamento_combate.descricao LIKE CONCAT('%',:descricao,'%') "
			+ " AND equipamento_combate.id_sistema = :idSistema "
			+ " AND equipamento_combate.flag_ativo = :flagAtivo "
			+ " ORDER BY equipamento_combate.id_equipamento_combate ";
}
