package br.com.jt.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.jt.models.Bean;

@ManagedBean(name = "BeanMB")
@ViewScoped
public class BeanMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Bean bean = new Bean();
	private List<Bean> dadosTabela = new ArrayList<Bean>();
	
	public void addTabela() {
		//adicionando pessoas a lista
		dadosTabela.add(bean);
		//instanciado uma nova para ser cadastrada
		bean = new Bean();
	}
	
	/** CRIANDO UMA NOVA INSTANCIA DE BeanMB */
    public BeanMB() {
    }

	public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}

	public List<Bean> getDadosTabela() {
		return dadosTabela;
	}

	public void setDadosTabela(List<Bean> dadosTabela) {
		this.dadosTabela = dadosTabela;
	}   
}