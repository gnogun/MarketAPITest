/**
 * StockTextT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class StockTextT  implements java.io.Serializable {
    private int itemStockTextNo;  // attribute

    private java.lang.String descriptiveText;  // attribute

    private boolean isDisplayable;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.ChangeTypeCode changeType;  // attribute

    public StockTextT() {
    }

    public StockTextT(
           int itemStockTextNo,
           java.lang.String descriptiveText,
           boolean isDisplayable,
           kr.co.auction.schema.Arche_Service_xsd.ChangeTypeCode changeType) {
           this.itemStockTextNo = itemStockTextNo;
           this.descriptiveText = descriptiveText;
           this.isDisplayable = isDisplayable;
           this.changeType = changeType;
    }


    /**
     * Gets the itemStockTextNo value for this StockTextT.
     * 
     * @return itemStockTextNo
     */
    public int getItemStockTextNo() {
        return itemStockTextNo;
    }


    /**
     * Sets the itemStockTextNo value for this StockTextT.
     * 
     * @param itemStockTextNo
     */
    public void setItemStockTextNo(int itemStockTextNo) {
        this.itemStockTextNo = itemStockTextNo;
    }


    /**
     * Gets the descriptiveText value for this StockTextT.
     * 
     * @return descriptiveText
     */
    public java.lang.String getDescriptiveText() {
        return descriptiveText;
    }


    /**
     * Sets the descriptiveText value for this StockTextT.
     * 
     * @param descriptiveText
     */
    public void setDescriptiveText(java.lang.String descriptiveText) {
        this.descriptiveText = descriptiveText;
    }


    /**
     * Gets the isDisplayable value for this StockTextT.
     * 
     * @return isDisplayable
     */
    public boolean isIsDisplayable() {
        return isDisplayable;
    }


    /**
     * Sets the isDisplayable value for this StockTextT.
     * 
     * @param isDisplayable
     */
    public void setIsDisplayable(boolean isDisplayable) {
        this.isDisplayable = isDisplayable;
    }


    /**
     * Gets the changeType value for this StockTextT.
     * 
     * @return changeType
     */
    public kr.co.auction.schema.Arche_Service_xsd.ChangeTypeCode getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this StockTextT.
     * 
     * @param changeType
     */
    public void setChangeType(kr.co.auction.schema.Arche_Service_xsd.ChangeTypeCode changeType) {
        this.changeType = changeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StockTextT)) return false;
        StockTextT other = (StockTextT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemStockTextNo == other.getItemStockTextNo() &&
            ((this.descriptiveText==null && other.getDescriptiveText()==null) || 
             (this.descriptiveText!=null &&
              this.descriptiveText.equals(other.getDescriptiveText()))) &&
            this.isDisplayable == other.isIsDisplayable() &&
            ((this.changeType==null && other.getChangeType()==null) || 
             (this.changeType!=null &&
              this.changeType.equals(other.getChangeType())));
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
        _hashCode += getItemStockTextNo();
        if (getDescriptiveText() != null) {
            _hashCode += getDescriptiveText().hashCode();
        }
        _hashCode += (isIsDisplayable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockTextT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockTextT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemStockTextNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemStockTextNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("descriptiveText");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DescriptiveText"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDisplayable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDisplayable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("changeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ChangeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ChangeTypeCode"));
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
