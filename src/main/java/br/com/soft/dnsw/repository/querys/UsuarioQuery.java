package br.com.soft.dnsw.repository.querys;

public class UsuarioQuery {

	public static final String FIND_BY_EXAMPLE = 
			"SELECT usuario.* "
			+ " FROM tb_usuario usuario "
			+ " WHERE usuario.login LIKE CONCAT('%',:login,'%') "
			+ " AND usuario.email LIKE CONCAT('%',:email,'%') "
			+ " AND usuario.apelido LIKE CONCAT('%',:apelido,'%') "
			+ " AND usuario.flag_ativo = :flagAtivo "
			+ " ORDER BY usuario.id_usuario ";
}