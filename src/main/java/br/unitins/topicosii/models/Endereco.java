package br.unitins.topicosii.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;



@Entity
public class Endereco extends DefaultEntity{
	@NotNull
	private String cep;
	@NotNull
	private String bairro;
	@NotNull
	private String rua;
	@NotNull
	private String numero;
	@NotNull
	private String complemento;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Cidade cidade;
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Cidade getCidade() {
		if(this.cidade==null)
			this.cidade=new Cidade();
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
}
