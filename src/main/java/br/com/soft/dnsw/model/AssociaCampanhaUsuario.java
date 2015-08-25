package br.com.soft.dnsw.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_associa_campanha_usuario")
public class AssociaCampanhaUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_campanha_usuario")
	private Integer idAssociaCampanhaUsuario;

	@ManyToOne
	@JoinColumn(name = "id_campanha")
	private Campanha campanha;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Column(name = "status")
	private Character status;
	
	public static final Character STATUS_ATIVO = 'A';
	public static final Character STATUS_PENDENTE = 'P';
	public static final Character STATUS_BLOQUEADO = 'B';
	
	public Integer getIdAssociaCampanhaUsuario() {
		return idAssociaCampanhaUsuario;
	}

	public void setIdAssociaCampanhaUsuario(Integer idAssociaCampanhaUsuario) {
		this.idAssociaCampanhaUsuario = idAssociaCampanhaUsuario;
	}

	public Campanha getCampanha() {
		return campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

}