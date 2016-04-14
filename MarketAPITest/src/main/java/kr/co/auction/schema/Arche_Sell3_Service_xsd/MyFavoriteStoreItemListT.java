/**
 * MyFavoriteStoreItemListT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class MyFavoriteStoreItemListT  implements java.io.Serializable {
    private java.lang.String image;  // attribute

    private java.lang.String itemName;  // attribute

    private java.lang.String itemNo;  // attribute

    private java.math.BigDecimal sellPrice;  // attribute

    public MyFavoriteStoreItemListT() {
    }

    public MyFavoriteStoreItemListT(
           java.lang.String image,
           java.lang.String itemName,
           java.lang.String itemNo,
           java.math.BigDecimal sellPrice) {
           this.image = image;
           this.itemName = itemName;
           this.itemNo = itemNo;
           this.sellPrice = sellPrice;
    }


    /**
     * Gets the image value for this MyFavoriteStoreItemListT.
     * 
     * @return image
     */
    public java.lang.String getImage() {
        return image;
    }


    /**
     * Sets the image value for this MyFavoriteStoreItemListT.
     * 
     * @param image
     */
    public void setImage(java.lang.String image) {
        this.image = image;
    }


    /**
     * Gets the itemName value for this MyFavoriteStoreItemListT.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this MyFavoriteStoreItemListT.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the itemNo value for this MyFavoriteStoreItemListT.
     * 
     * @return itemNo
     */
    public java.lang.String getItemNo() {
        return itemNo;
    }


    /**
     * Sets the itemNo value for this MyFavoriteStoreItemListT.
     * 
     * @param itemNo
     */
    public void setItemNo(java.lang.String itemNo) {
        this.itemNo = itemNo;
    }


    /**
     * Gets the sellPrice value for this MyFavoriteStoreItemListT.
     * 
     * @return sellPrice
     */
    public java.math.BigDecimal getSellPrice() {
        return sellPrice;
    }


    /**
     * Sets the sellPrice value for this MyFavoriteStoreItemListT.
     * 
     * @param sellPrice
     */
    public void setSellPrice(java.math.BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyFavoriteStoreItemListT)) return false;
        MyFavoriteStoreItemListT other = (MyFavoriteStoreItemListT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.itemNo==null && other.getItemNo()==null) || 
             (this.itemNo!=null &&
              this.itemNo.equals(other.getItemNo()))) &&
            ((this.sellPrice==null && other.getSellPrice()==null) || 
             (this.sellPrice!=null &&
              this.sellPrice.equals(other.getSellPrice())));
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
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getItemNo() != null) {
            _hashCode += getItemNo().hashCode();
        }
        if (getSellPrice() != null) {
            _hashCode += getSellPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyFavoriteStoreItemListT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreItemListT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("image");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Image"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
