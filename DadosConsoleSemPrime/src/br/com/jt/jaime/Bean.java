package br.com.jt.jaime;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "Bean")
@ViewScoped
public class Bean {
	private String nome, assunto, texto;

	public void mostraConsole(){
		System.out.println("Nome: " + nome);
		System.out.println("Assunto: " + assunto);
		System.out.println("Texto: " + texto);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}
