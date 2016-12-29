/**
 * RespostaResponder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.meta.webservice;

public class RespostaResponder  implements java.io.Serializable {
    private java.lang.String erro;

    private java.lang.Integer resultado;

    private java.lang.String sessao;

    public RespostaResponder() {
    }

    public RespostaResponder(
           java.lang.String erro,
           java.lang.Integer resultado,
           java.lang.String sessao) {
           this.erro = erro;
           this.resultado = resultado;
           this.sessao = sessao;
    }


    /**
     * Gets the erro value for this RespostaResponder.
     * 
     * @return erro
     */
    public java.lang.String getErro() {
        return erro;
    }


    /**
     * Sets the erro value for this RespostaResponder.
     * 
     * @param erro
     */
    public void setErro(java.lang.String erro) {
        this.erro = erro;
    }


    /**
     * Gets the resultado value for this RespostaResponder.
     * 
     * @return resultado
     */
    public java.lang.Integer getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this RespostaResponder.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.Integer resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the sessao value for this RespostaResponder.
     * 
     * @return sessao
     */
    public java.lang.String getSessao() {
        return sessao;
    }


    /**
     * Sets the sessao value for this RespostaResponder.
     * 
     * @param sessao
     */
    public void setSessao(java.lang.String sessao) {
        this.sessao = sessao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespostaResponder)) return false;
        RespostaResponder other = (RespostaResponder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.erro==null && other.getErro()==null) || 
             (this.erro!=null &&
              this.erro.equals(other.getErro()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.sessao==null && other.getSessao()==null) || 
             (this.sessao!=null &&
              this.sessao.equals(other.getSessao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErro() != null) {
            _hashCode += getErro().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getSessao() != null) {
            _hashCode += getSessao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespostaResponder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.meta.com.br/", "respostaResponder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
