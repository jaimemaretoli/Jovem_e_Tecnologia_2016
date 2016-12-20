package br.com.jt.jaime;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "Bean")
@ViewScoped
public final class Bean {
	private String mensagem;
	
	public String enviarMensagem(){
		mensagem = "Olá Mundo!";
		return mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
