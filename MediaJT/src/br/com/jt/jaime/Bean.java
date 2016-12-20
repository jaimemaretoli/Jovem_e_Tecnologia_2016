package br.com.jt.jaime;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "Bean")
@ViewScoped
public class Bean {
	private int idade1, idade2, idade3, idade4, idade5;
	private float media;
	
	public float calculoMedia(){
		media = (idade1 + idade2 + idade3 + idade4 + idade5) / 5;
		System.out.println("A média da idade é: " + media);
		return media;
	}

	public int getIdade1() {
		return idade1;
	}

	public void setIdade1(int idade1) {
		this.idade1 = idade1;
	}

	public int getIdade2() {
		return idade2;
	}

	public void setIdade2(int idade2) {
		this.idade2 = idade2;
	}

	public int getIdade3() {
		return idade3;
	}

	public void setIdade3(int idade3) {
		this.idade3 = idade3;
	}

	public int getIdade4() {
		return idade4;
	}

	public void setIdade4(int idade4) {
		this.idade4 = idade4;
	}

	public int getIdade5() {
		return idade5;
	}

	public void setIdade5(int idade5) {
		this.idade5 = idade5;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
}
