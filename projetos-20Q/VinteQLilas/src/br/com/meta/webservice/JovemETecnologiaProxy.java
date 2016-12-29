package br.com.meta.webservice;

public class JovemETecnologiaProxy implements br.com.meta.webservice.JovemETecnologia {
  private String _endpoint = null;
  private br.com.meta.webservice.JovemETecnologia jovemETecnologia = null;
  
  public JovemETecnologiaProxy() {
    _initJovemETecnologiaProxy();
  }
  
  public JovemETecnologiaProxy(String endpoint) {
    _endpoint = endpoint;
    _initJovemETecnologiaProxy();
  }
  
  private void _initJovemETecnologiaProxy() {
    try {
      jovemETecnologia = (new br.com.meta.webservice.JovemETecnologiaServiceLocator()).getJovemETecnologiaPort();
      if (jovemETecnologia != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jovemETecnologia)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jovemETecnologia)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jovemETecnologia != null)
      ((javax.xml.rpc.Stub)jovemETecnologia)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.meta.webservice.JovemETecnologia getJovemETecnologia() {
    if (jovemETecnologia == null)
      _initJovemETecnologiaProxy();
    return jovemETecnologia;
  }
  
  public br.com.meta.webservice.RespostaPerguntar perguntar(java.lang.String sessao) throws java.rmi.RemoteException{
    if (jovemETecnologia == null)
      _initJovemETecnologiaProxy();
    return jovemETecnologia.perguntar(sessao);
  }
  
  public br.com.meta.webservice.RespostaResponder responder(java.lang.String sessao, java.lang.String pergunta, java.lang.String resposta) throws java.rmi.RemoteException{
    if (jovemETecnologia == null)
      _initJovemETecnologiaProxy();
    return jovemETecnologia.responder(sessao, pergunta, resposta);
  }
  
  public br.com.meta.webservice.RespostaIniciar iniciar(java.lang.String nome, int equipe, java.lang.String sexo) throws java.rmi.RemoteException{
    if (jovemETecnologia == null)
      _initJovemETecnologiaProxy();
    return jovemETecnologia.iniciar(nome, equipe, sexo);
  }
  
  
}