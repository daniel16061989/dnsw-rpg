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
@Table(name = "tb_associa_personagem_cabecalho_ficha")
public class AssociaPersonagemCabecalhoFicha implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_associa_personagem_cabecalho_ficha")
	private Integer idAssociaPersonagemCabecalhoFicha;

	@ManyToOne
	@JoinColumn(name = "id_personagem")
	private Personagem personagem;

	@ManyToOne
	@JoinColumn(name = "id_cabecalho_ficha")
	private CabecalhoFicha cabecalhoFicha;

	@Column(name = "valor")
	private String valor;

	public Integer getIdAssociaPersonagemCabecalhoFicha() {
		return idAssociaPersonagemCabecalhoFicha;
	}

	public void setIdAssociaPersonagemCabecalhoFicha(
			Integer idAssociaPersonagemCabecalhoFicha) {
		this.idAssociaPersonagemCabecalhoFicha = idAssociaPersonagemCabecalhoFicha;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public CabecalhoFicha getCabecalhoFicha() {
		return cabecalhoFicha;
	}

	public void setCabecalhoFicha(CabecalhoFicha cabecalhoFicha) {
		this.cabecalhoFicha = cabecalhoFicha;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}