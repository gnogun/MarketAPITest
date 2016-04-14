/**
 * ItemImageT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class ItemImageT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.MemberT seller;

    private kr.co.auction.schema.Arche_Service_xsd.ItemRevisePictureT itemPicture;

    private java.lang.String itemID;  // attribute

    public ItemImageT() {
    }

    public ItemImageT(
           kr.co.auction.schema.Arche_Service_xsd.MemberT seller,
           kr.co.auction.schema.Arche_Service_xsd.ItemRevisePictureT itemPicture,
           java.lang.String itemID) {
           this.seller = seller;
           this.itemPicture = itemPicture;
           this.itemID = itemID;
    }


    /**
     * Gets the seller value for this ItemImageT.
     * 
     * @return seller
     */
    public kr.co.auction.schema.Arche_Service_xsd.MemberT getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this ItemImageT.
     * 
     * @param seller
     */
    public void setSeller(kr.co.auction.schema.Arche_Service_xsd.MemberT seller) {
        this.seller = seller;
    }


    /**
     * Gets the itemPicture value for this ItemImageT.
     * 
     * @return itemPicture
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemRevisePictureT getItemPicture() {
        return itemPicture;
    }


    /**
     * Sets the itemPicture value for this ItemImageT.
     * 
     * @param itemPicture
     */
    public void setItemPicture(kr.co.auction.schema.Arche_Service_xsd.ItemRevisePictureT itemPicture) {
        this.itemPicture = itemPicture;
    }


    /**
     * Gets the itemID value for this ItemImageT.
     * 
     * @return itemID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ItemImageT.
     * 
     * @param itemID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemImageT)) return false;
        ItemImageT other = (ItemImageT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seller==null && other.getSeller()==null) || 
             (this.seller!=null &&
              this.seller.equals(other.getSeller()))) &&
            ((this.itemPicture==null && other.getItemPicture()==null) || 
             (this.itemPicture!=null &&
              this.itemPicture.equals(other.getItemPicture()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID())));
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
        if (getSeller() != null) {
            _hashCode += getSeller().hashCode();
        }
        if (getItemPicture() != null) {
            _hashCode += getItemPicture().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemImageT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemImageT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemRevisePictureT"));
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
