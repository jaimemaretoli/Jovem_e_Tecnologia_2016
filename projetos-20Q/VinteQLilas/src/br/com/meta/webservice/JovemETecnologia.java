/**
 * JovemETecnologia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.meta.webservice;

public interface JovemETecnologia extends java.rmi.Remote {
    public br.com.meta.webservice.RespostaPerguntar perguntar(java.lang.String sessao) throws java.rmi.RemoteException;
    public br.com.meta.webservice.RespostaResponder responder(java.lang.String sessao, java.lang.String pergunta, java.lang.String resposta) throws java.rmi.RemoteException;
    public br.com.meta.webservice.RespostaIniciar iniciar(java.lang.String nome, int equipe, java.lang.String sexo) throws java.rmi.RemoteException;
}
