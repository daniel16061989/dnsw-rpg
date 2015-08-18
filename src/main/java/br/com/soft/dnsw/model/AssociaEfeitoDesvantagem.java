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
@Table(name = "tb_associa_efeito_desvantagem")
public class AssociaEfeitoDesvantagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_efeito_desvantagem")
	private Integer idAssociaEfeitoDesvantagem;

	@ManyToOne
	@JoinColumn(name = "id_efeito")
	private Efeito efeito;
	
	@ManyToOne
	@JoinColumn(name = "id_desvantagem")
	private Desvantagem desvantagem;

	public Integer getIdAssociaEfeitoDesvantagem() {
		return idAssociaEfeitoDesvantagem;
	}

	public void setIdAssociaEfeitoDesvantagem(Integer idAssociaEfeitoDesvantagem) {
		this.idAssociaEfeitoDesvantagem = idAssociaEfeitoDesvantagem;
	}

	public Efeito getEfeito() {
		return efeito;
	}

	public void setEfeito(Efeito efeito) {
		this.efeito = efeito;
	}

	public Desvantagem getDesvantagem() {
		return desvantagem;
	}

	public void setDesvantagem(Desvantagem desvantagem) {
		this.desvantagem = desvantagem;
	}

}