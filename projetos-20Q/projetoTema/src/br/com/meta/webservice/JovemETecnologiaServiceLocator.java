/**
 * JovemETecnologiaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.meta.webservice;

public class JovemETecnologiaServiceLocator extends org.apache.axis.client.Service implements br.com.meta.webservice.JovemETecnologiaService {

    public JovemETecnologiaServiceLocator() {
    }


    public JovemETecnologiaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JovemETecnologiaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JovemETecnologiaPort
    private java.lang.String JovemETecnologiaPort_address = "http://jovemtecnologia.meta.com.br:80/WebApi/jovemTecnologia";

    public java.lang.String getJovemETecnologiaPortAddress() {
        return JovemETecnologiaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JovemETecnologiaPortWSDDServiceName = "JovemETecnologiaPort";

    public java.lang.String getJovemETecnologiaPortWSDDServiceName() {
        return JovemETecnologiaPortWSDDServiceName;
    }

    public void setJovemETecnologiaPortWSDDServiceName(java.lang.String name) {
        JovemETecnologiaPortWSDDServiceName = name;
    }

    public br.com.meta.webservice.JovemETecnologia getJovemETecnologiaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JovemETecnologiaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJovemETecnologiaPort(endpoint);
    }

    public br.com.meta.webservice.JovemETecnologia getJovemETecnologiaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.meta.webservice.JovemETecnologiaPortBindingStub _stub = new br.com.meta.webservice.JovemETecnologiaPortBindingStub(portAddress, this);
            _stub.setPortName(getJovemETecnologiaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJovemETecnologiaPortEndpointAddress(java.lang.String address) {
        JovemETecnologiaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.meta.webservice.JovemETecnologia.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.meta.webservice.JovemETecnologiaPortBindingStub _stub = new br.com.meta.webservice.JovemETecnologiaPortBindingStub(new java.net.URL(JovemETecnologiaPort_address), this);
                _stub.setPortName(getJovemETecnologiaPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("JovemETecnologiaPort".equals(inputPortName)) {
            return getJovemETecnologiaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.meta.com.br/", "JovemETecnologiaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.meta.com.br/", "JovemETecnologiaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JovemETecnologiaPort".equals(portName)) {
            setJovemETecnologiaPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
