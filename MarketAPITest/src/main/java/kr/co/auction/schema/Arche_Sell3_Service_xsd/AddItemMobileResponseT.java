/**
 * AddItemMobileResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class AddItemMobileResponseT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.ItemStockT itemStock;

    private java.lang.String itemID;  // attribute

    private int fee;  // attribute

    public AddItemMobileResponseT() {
    }

    public AddItemMobileResponseT(
           kr.co.auction.schema.Arche_Service_xsd.ItemStockT itemStock,
           java.lang.String itemID,
           int fee) {
           this.itemStock = itemStock;
           this.itemID = itemID;
           this.fee = fee;
    }


    /**
     * Gets the itemStock value for this AddItemMobileResponseT.
     * 
     * @return itemStock
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemStockT getItemStock() {
        return itemStock;
    }


    /**
     * Sets the itemStock value for this AddItemMobileResponseT.
     * 
     * @param itemStock
     */
    public void setItemStock(kr.co.auction.schema.Arche_Service_xsd.ItemStockT itemStock) {
        this.itemStock = itemStock;
    }


    /**
     * Gets the itemID value for this AddItemMobileResponseT.
     * 
     * @return itemID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this AddItemMobileResponseT.
     * 
     * @param itemID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the fee value for this AddItemMobileResponseT.
     * 
     * @return fee
     */
    public int getFee() {
        return fee;
    }


    /**
     * Sets the fee value for this AddItemMobileResponseT.
     * 
     * @param fee
     */
    public void setFee(int fee) {
        this.fee = fee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddItemMobileResponseT)) return false;
        AddItemMobileResponseT other = (AddItemMobileResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemStock==null && other.getItemStock()==null) || 
             (this.itemStock!=null &&
              this.itemStock.equals(other.getItemStock()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            this.fee == other.getFee();
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
        if (getItemStock() != null) {
            _hashCode += getItemStock().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        _hashCode += getFee();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddItemMobileResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemMobileResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fee");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Fee"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemStock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStockT"));
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
