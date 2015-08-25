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
@Table(name = "tb_agendamento_campanha")
public class AgendamentoCampanha implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name = "id_agendamento_campanha")
	private Integer idAgendamentoCampanha;

	@ManyToOne
	@JoinColumn(name = "id_campanha")
	private Campanha campanha;
	
	@Column(name = "data_agendamento")
	private String dataAgendamento;

	public Integer getIdAgendamentoCampanha() {
		return idAgendamentoCampanha;
	}

	public void setIdAgendamentoCampanha(Integer idAgendamentoCampanha) {
		this.idAgendamentoCampanha = idAgendamentoCampanha;
	}

	public Campanha getCampanha() {
		return campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}

	public String getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

}