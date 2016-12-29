/**
 * RespostaPerguntar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.meta.webservice;

public class RespostaPerguntar  implements java.io.Serializable {
    private java.math.BigDecimal codigo;

    private java.lang.String erro;

    private java.lang.Boolean finalizado;

    private java.math.BigInteger id;

    private java.lang.String objeto;

    private java.lang.String pergunta;

    private java.lang.String sessao;

    public RespostaPerguntar() {
    }

    public RespostaPerguntar(
           java.math.BigDecimal codigo,
           java.lang.String erro,
           java.lang.Boolean finalizado,
           java.math.BigInteger id,
           java.lang.String objeto,
           java.lang.String pergunta,
           java.lang.String sessao) {
           this.codigo = codigo;
           this.erro = erro;
           this.finalizado = finalizado;
           this.id = id;
           this.objeto = objeto;
           this.pergunta = pergunta;
           this.sessao = sessao;
    }


    /**
     * Gets the codigo value for this RespostaPerguntar.
     * 
     * @return codigo
     */
    public java.math.BigDecimal getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this RespostaPerguntar.
     * 
     * @param codigo
     */
    public void setCodigo(java.math.BigDecimal codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the erro value for this RespostaPerguntar.
     * 
     * @return erro
     */
    public java.lang.String getErro() {
        return erro;
    }


    /**
     * Sets the erro value for this RespostaPerguntar.
     * 
     * @param erro
     */
    public void setErro(java.lang.String erro) {
        this.erro = erro;
    }


    /**
     * Gets the finalizado value for this RespostaPerguntar.
     * 
     * @return finalizado
     */
    public java.lang.Boolean getFinalizado() {
        return finalizado;
    }


    /**
     * Sets the finalizado value for this RespostaPerguntar.
     * 
     * @param finalizado
     */
    public void setFinalizado(java.lang.Boolean finalizado) {
        this.finalizado = finalizado;
    }


    /**
     * Gets the id value for this RespostaPerguntar.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this RespostaPerguntar.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the objeto value for this RespostaPerguntar.
     * 
     * @return objeto
     */
    public java.lang.String getObjeto() {
        return objeto;
    }


    /**
     * Sets the objeto value for this RespostaPerguntar.
     * 
     * @param objeto
     */
    public void setObjeto(java.lang.String objeto) {
        this.objeto = objeto;
    }


    /**
     * Gets the pergunta value for this RespostaPerguntar.
     * 
     * @return pergunta
     */
    public java.lang.String getPergunta() {
        return pergunta;
    }


    /**
     * Sets the pergunta value for this RespostaPerguntar.
     * 
     * @param pergunta
     */
    public void setPergunta(java.lang.String pergunta) {
        this.pergunta = pergunta;
    }


    /**
     * Gets the sessao value for this RespostaPerguntar.
     * 
     * @return sessao
     */
    public java.lang.String getSessao() {
        return sessao;
    }


    /**
     * Sets the sessao value for this RespostaPerguntar.
     * 
     * @param sessao
     */
    public void setSessao(java.lang.String sessao) {
        this.sessao = sessao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespostaPerguntar)) return false;
        RespostaPerguntar other = (RespostaPerguntar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.erro==null && other.getErro()==null) || 
             (this.erro!=null &&
              this.erro.equals(other.getErro()))) &&
            ((this.finalizado==null && other.getFinalizado()==null) || 
             (this.finalizado!=null &&
              this.finalizado.equals(other.getFinalizado()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.objeto==null && other.getObjeto()==null) || 
             (this.objeto!=null &&
              this.objeto.equals(other.getObjeto()))) &&
            ((this.pergunta==null && other.getPergunta()==null) || 
             (this.pergunta!=null &&
              this.pergunta.equals(other.getPergunta()))) &&
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getErro() != null) {
            _hashCode += getErro().hashCode();
        }
        if (getFinalizado() != null) {
            _hashCode += getFinalizado().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getObjeto() != null) {
            _hashCode += getObjeto().hashCode();
        }
        if (getPergunta() != null) {
            _hashCode += getPergunta().hashCode();
        }
        if (getSessao() != null) {
            _hashCode += getSessao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespostaPerguntar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.meta.com.br/", "respostaPerguntar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalizado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pergunta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pergunta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
