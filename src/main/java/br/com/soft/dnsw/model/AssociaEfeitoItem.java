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
@Table(name = "tb_associa_efeito_item")
public class AssociaEfeitoItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_associa_efeito_item")
	private Integer idAssociaEfeitoItem;

	@ManyToOne
	@JoinColumn(name = "id_efeito")
	private Efeito efeito;
	
	@ManyToOne
	@JoinColumn(name = "id_item")
	private Item item;

	public Integer getIdAssociaEfeitoItem() {
		return idAssociaEfeitoItem;
	}

	public void setIdAssociaEfeitoItem(Integer idAssociaEfeitoItem) {
		this.idAssociaEfeitoItem = idAssociaEfeitoItem;
	}

	public Efeito getEfeito() {
		return efeito;
	}

	public void setEfeito(Efeito efeito) {
		this.efeito = efeito;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}