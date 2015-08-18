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
@Table(name = "tb_associa_efeito_vantagem")
public class AssociaEfeitoVantagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_efeito_vantagem")
	private Integer idAssociaEfeitoVantagem;

	@ManyToOne
	@JoinColumn(name = "id_efeito")
	private Efeito efeito;
	
	@ManyToOne
	@JoinColumn(name = "id_vantagem")
	private Vantagem vantagem;

	public Integer getIdAssociaEfeitoVantagem() {
		return idAssociaEfeitoVantagem;
	}

	public void setIdAssociaEfeitoVantagem(Integer idAssociaEfeitoVantagem) {
		this.idAssociaEfeitoVantagem = idAssociaEfeitoVantagem;
	}

	public Efeito getEfeito() {
		return efeito;
	}

	public void setEfeito(Efeito efeito) {
		this.efeito = efeito;
	}

	public Vantagem getVantagem() {
		return vantagem;
	}

	public void setVantagem(Vantagem vantagem) {
		this.vantagem = vantagem;
	}

}