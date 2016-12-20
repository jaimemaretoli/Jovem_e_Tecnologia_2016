package br.com.jaime.controllers;

import br.com.jaime.models.Pessoa;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import java.util.ArrayList;

@ManagedBean(name="pessoaMB")
@ViewScoped
public class PessoaMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoaLista = new ArrayList<Pessoa>();
	
	/** CRIANDO UMA NOVA INSTANCIA DE PessoaMB */
    public PessoaMB() {
    }

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoaLista() {
		return pessoaLista;
	}

	public void setPessoaLista(List<Pessoa> pessoaLista) {
		this.pessoaLista = pessoaLista;
	}   
	
	/* METODOS */
	 
	public void salvarPessoa() {
		//adicionando pessoas a lista
		pessoaLista.add(pessoa);
		//instanciado uma nova para ser cadastrada
		pessoa = new Pessoa();
	}
	
}
