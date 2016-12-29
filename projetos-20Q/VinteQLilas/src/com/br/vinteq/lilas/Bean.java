package com.br.vinteq.lilas;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIViewRoot;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import java.io.Serializable;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import br.com.meta.modelo.Sexo;
import br.com.meta.webservice.*;
import br.com.vinteq.pergunta_resposta.pergunta_resposta;



@ManagedBean(name = "bean")
@ViewScoped
public class Bean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private int equipe = 6;
	private Sexo sexo;
	private String pergunta1;
	private String opcao;
	private boolean display1;
	private boolean display2;
	private boolean display3;
	private String sessao;
	private int i = 1;
	private BigInteger idpergunta;
	RespostaPerguntar resposta;
	RespostaResponder resposta2;
	JovemETecnologiaServiceLocator locator = new JovemETecnologiaServiceLocator();
	private String resultado;
	private String imagem ;
	private String resultadostr;
	private String opcaostr;
	private pergunta_resposta perres;
	private List<pergunta_resposta> listaper_e_resps= new ArrayList<pergunta_resposta>();

	public List<pergunta_resposta> getListaper_e_resps() {
		return listaper_e_resps;
	}

	public void setListaper_e_resps(List<pergunta_resposta> listaper_e_resps) {
		this.listaper_e_resps = listaper_e_resps;
	}

	public Bean(){
		this.display1 = Boolean.TRUE;
		this.display2 = Boolean.FALSE;
		this.display3 = Boolean.FALSE;
	}

	public void comecarGame(){
		if(sexo == null || nome == null){
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro !",  "Primeiro preencha todos os dados !"));

		}else{
			try{
				RespostaIniciar iniciar = null;
				iniciar = locator.getJovemETecnologiaPort().iniciar(nome, equipe, sexo.getCodigo());
				//iniciar = locator.getJovemETecnologiaPort();
				System.out.println(iniciar.getSessao());
				sessao = iniciar.getSessao();
				setDisplay1(Boolean.FALSE);
				setDisplay2(Boolean.TRUE);
				setDisplay3(Boolean.FALSE);
				resposta = locator.getJovemETecnologiaPort().perguntar(iniciar.getSessao());
				setPergunta1(resposta.getPergunta());
				setIdpergunta(resposta.getId());
			} catch (AxisFault e){
				e.printStackTrace();
			} catch (RemoteException e){
				e.printStackTrace();
			} catch (ServiceException e){
				e.printStackTrace();
			}

		}
	}

	public void responde(){

		String idperguntastr = "" + idpergunta;

		try {
			perres = new pergunta_resposta();
			perres.setPergunta(i + ". " + pergunta1);
			i++;
			resposta2 = locator.getJovemETecnologiaPort().responder(sessao, idperguntastr, opcao);
			resposta = locator.getJovemETecnologiaPort().perguntar(sessao);
			setPergunta1(resposta.getPergunta());
			idpergunta = resposta.getId();
			perres.setResposta(opcao);
			opcaostr = perres.getResposta();
			opcaostr = opcaostr.replace("1","Sim").replace("2","Não").replace("3","Talvez");
			perres.setResposta(opcaostr);
			listaper_e_resps.add(perres);
			if(resposta.getFinalizado() == null || resposta.getFinalizado() == false){

			}else{
				setDisplay1(Boolean.FALSE);
				setDisplay2(Boolean.FALSE);
				setDisplay3(Boolean.TRUE);

				setResultado(resposta.getObjeto());
				resultadostr = removerAcentos(resultado);
				setImagem("imagens/finalimgs/"+ resultadostr +".jpg");
				
			}

		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
		}

	}
	public String refresh() {
		return "Index";
	}
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
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

	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setDisplay1(boolean display1) {
		this.display1 = display1;
	}

	public void setDisplay2(boolean display2) {
		this.display2 = display2;
	}

	public void setDisplay3(boolean display3) {
		this.display3 = display3;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getEquipe() {
		return equipe;
	}

	public void setEquipe(int equipe) {
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

	public Sexo getSexo() {
		return sexo;
	}

	public boolean isDisplay1() {
		return display1;
	}

	public boolean isDisplay2() {
		return display2;
	}

	public boolean isDisplay3() {
		return display3;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public BigInteger getIdpergunta() {
		return idpergunta;
	}

	public void setIdpergunta(BigInteger idpergunta) {
		this.idpergunta = idpergunta;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}

