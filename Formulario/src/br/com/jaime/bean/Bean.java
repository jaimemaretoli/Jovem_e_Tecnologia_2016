package br.com.jaime.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "Bean")
@ViewScoped
public class Bean {
	private String nome;
	private String sobrenome;
	private String msg;
	private List<String> mensagens;
	
	public Bean() {
		mensagens = new ArrayList<>();
	}
	
	public void mensagemOla(){
		msg = "Olá " + nome + " " + sobrenome + "!";
		mensagens.add(msg);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<String> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<String> mensagens) {
		this.mensagens = mensagens;
	}
}