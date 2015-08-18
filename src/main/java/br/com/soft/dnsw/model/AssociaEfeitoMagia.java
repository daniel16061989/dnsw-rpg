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
@Table(name = "tb_associa_efeito_magia")
public class AssociaEfeitoMagia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_efeito_magia")
	private Integer idAssociaEfeitoMagia;

	@ManyToOne
	@JoinColumn(name = "id_efeito")
	private Efeito efeito;
	
	@ManyToOne
	@JoinColumn(name = "id_magia")
	private Magia magia;

	public Integer getIdAssociaEfeitoMagia() {
		return idAssociaEfeitoMagia;
	}

	public void setIdAssociaEfeitoMagia(Integer idAssociaEfeitoMagia) {
		this.idAssociaEfeitoMagia = idAssociaEfeitoMagia;
	}

	public Efeito getEfeito() {
		return efeito;
	}

	public void setEfeito(Efeito efeito) {
		this.efeito = efeito;
	}

	public Magia getMagia() {
		return magia;
	}

	public void setMagia(Magia magia) {
		this.magia = magia;
	}

}