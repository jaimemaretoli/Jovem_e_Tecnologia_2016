package br.com.jt.jaime;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "Bean")
@ViewScoped
public class Bean {
	private String mensagem, mensagemConsole;
	
	public String enviaMensagem(){
		mensagem = "Olá Mundo!";
		return mensagem;
	}
	
	public String mostraMensagemConsole(){
		mensagemConsole = "Essa mensagem está no Console do Eclipse!";
		System.out.println(mensagemConsole);
		return mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}