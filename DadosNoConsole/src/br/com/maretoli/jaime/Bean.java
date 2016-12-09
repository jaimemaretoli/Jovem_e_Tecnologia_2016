package br.com.maretoli.jaime;

import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "Bean")
@ViewScoped
public class Bean {
	//private static final long serialVersionUID = 1L;
    
    private String nome;
    private String assunto;
    private String texto;

	public void process(){
		if (nome == null && assunto == null && texto == null){
			System.out.println("");
		} else {
			System.out.println("Nome: " + nome);
			System.out.println("Assunto: " + assunto);
			System.out.println("Texto: " + texto);
		}
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