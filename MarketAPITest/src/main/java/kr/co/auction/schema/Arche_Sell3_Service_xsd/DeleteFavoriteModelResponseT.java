/**
 * DeleteFavoriteModelResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class DeleteFavoriteModelResponseT  implements java.io.Serializable {
    private int catalogID;  // attribute

    private java.lang.String result;  // attribute

    private java.lang.String resultMsg;  // attribute

    public DeleteFavoriteModelResponseT() {
    }

    public DeleteFavoriteModelResponseT(
           int catalogID,
           java.lang.String result,
           java.lang.String resultMsg) {
           this.catalogID = catalogID;
           this.result = result;
           this.resultMsg = resultMsg;
    }


    /**
     * Gets the catalogID value for this DeleteFavoriteModelResponseT.
     * 
     * @return catalogID
     */
    public int getCatalogID() {
        return catalogID;
    }


    /**
     * Sets the catalogID value for this DeleteFavoriteModelResponseT.
     * 
     * @param catalogID
     */
    public void setCatalogID(int catalogID) {
        this.catalogID = catalogID;
    }


    /**
     * Gets the result value for this DeleteFavoriteModelResponseT.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this DeleteFavoriteModelResponseT.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the resultMsg value for this DeleteFavoriteModelResponseT.
     * 
     * @return resultMsg
     */
    public java.lang.String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this DeleteFavoriteModelResponseT.
     * 
     * @param resultMsg
     */
    public void setResultMsg(java.lang.String resultMsg) {
        this.resultMsg = resultMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteFavoriteModelResponseT)) return false;
        DeleteFavoriteModelResponseT other = (DeleteFavoriteModelResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.catalogID == other.getCatalogID() &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.resultMsg==null && other.getResultMsg()==null) || 
             (this.resultMsg!=null &&
              this.resultMsg.equals(other.getResultMsg())));
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
        _hashCode += getCatalogID();
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getResultMsg() != null) {
            _hashCode += getResultMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteFavoriteModelResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteModelResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("result");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Result"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultMsg");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResultMsg"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
