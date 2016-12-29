package br.com.jt.grupodois;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import br.com.meta.modelo.Sexo;
import br.com.meta.webservice.JovemETecnologiaServiceLocator;
import br.com.meta.webservice.RespostaIniciar;
import br.com.meta.webservice.RespostaPerguntar;
import br.com.meta.webservice.RespostaResponder;

@ManagedBean(name = "Bean")
@ViewScoped
public class Bean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private Integer equipe;
	private Sexo sexo;
	private String pergunta1;
	private RespostaPerguntar perguntar;
	private String opcao;
	private String sessao;
	private Boolean display1 = Boolean.TRUE;
	private Boolean display2 = Boolean.FALSE;
	private Boolean display3 = Boolean.FALSE;
	private String objeto;
	private String imagem;
	
	public void  comecarGame(){
		if(sexo == null || (nome == null || nome.isEmpty())){
			   FacesContext context = FacesContext.getCurrentInstance();
			   context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro !",  "Primeiro preencha todos os dados !"));

	  }else{
		try {
			RespostaIniciar iniciar = null;
			JovemETecnologiaServiceLocator locator = new JovemETecnologiaServiceLocator();
			iniciar = locator.getJovemETecnologiaPort().iniciar(nome, equipe, sexo.getCodigo());
			//	iniciar = locator.getJovemETecnologiaPort().
			System.out.println(iniciar.getSessao());
			sessao = iniciar.getSessao();			
			perguntar = locator.getJovemETecnologiaPort().perguntar(sessao);
			pergunta1 = perguntar.getPergunta();
			setDisplay1(Boolean.FALSE);
			setDisplay2(Boolean.TRUE);
			setDisplay3(Boolean.FALSE);
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	}
	public void metodoProsseguir(){
		try {
		JovemETecnologiaServiceLocator locator = new JovemETecnologiaServiceLocator();
		RespostaResponder responder = locator.getJovemETecnologiaPort().responder(sessao, perguntar.getId().toString(), opcao);
		perguntar = locator.getJovemETecnologiaPort().perguntar(sessao);
		pergunta1 = perguntar.getPergunta();
		objeto = perguntar.getObjeto();
		if(perguntar.getFinalizado() != null && perguntar.getFinalizado()){
			setDisplay1(Boolean.FALSE);
			setDisplay2(Boolean.FALSE);
			setDisplay3(Boolean.TRUE);
			setImagem("frutas/" + objeto + ".jpg");
		}else{
			pergunta1 = perguntar.getPergunta();
		}
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	public Bean(){
		setDisplay1(Boolean.TRUE);
		setDisplay2(Boolean.FALSE);
		setDisplay3(Boolean.FALSE);
	}
	public Boolean Tela1(){
		setDisplay1(Boolean.TRUE);
		setDisplay2(Boolean.FALSE);
		setDisplay3(Boolean.FALSE);
		return display1;
		
	}
	public String refresh() {
		 return "index";
	}
	
	public List<Sexo> getSexos(){
		List<Sexo> sexos = new ArrayList<Sexo>();
		Sexo sexo = new Sexo();
		sexo.setId(1);
		sexo.setGenero("Masculino");
		sexo.setCodigo("m");
		sexos.add(sexo);

		sexo = new Sexo();
		sexo.setId(2);
		sexo.setGenero("Feminino");
		sexo.setCodigo("f");
		sexos.add(sexo);

		return sexos;
	}


	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void responde(){

	}

	public String getSessao() {
		return sessao;
	}
	public void setSessao(String sessao) {
		this.sessao = sessao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getEquipe() {
		return equipe;
	}
	public void setEquipe(Integer equipe) {
		this.equipe = equipe;
	}
	public String getPergunta1() {
		return pergunta1;
	}
	public void setPergunta1(String pergunta1) {
		this.pergunta1 = pergunta1;
	}
	public String getOpcao() {
		return opcao;
	}
	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

	public Boolean getDisplay1() {
		return display1;
	}
	public void setDisplay1(Boolean display1) {
		this.display1 = display1;
	}
	public Boolean getDisplay2() {
		return display2;
	}
	public void setDisplay2(Boolean display2) {
		this.display2 = display2;
	}
	public Boolean getDisplay3() {
		return display3;
	}
	public void setDisplay3(Boolean display3) {
		this.display3 = display3;
	}
	
	public String getObjeto() {
		return objeto;
	}
	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}
