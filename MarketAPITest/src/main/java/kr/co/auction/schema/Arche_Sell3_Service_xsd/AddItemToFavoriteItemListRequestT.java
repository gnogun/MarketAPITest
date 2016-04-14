/**
 * AddItemToFavoriteItemListRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class AddItemToFavoriteItemListRequestT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListT[] favoriteItemList;

    private int version;  // attribute

    public AddItemToFavoriteItemListRequestT() {
    }

    public AddItemToFavoriteItemListRequestT(
           kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListT[] favoriteItemList,
           int version) {
           this.memberTicket = memberTicket;
           this.favoriteItemList = favoriteItemList;
           this.version = version;
    }


    /**
     * Gets the memberTicket value for this AddItemToFavoriteItemListRequestT.
     * 
     * @return memberTicket
     */
    public kr.co.auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this AddItemToFavoriteItemListRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the favoriteItemList value for this AddItemToFavoriteItemListRequestT.
     * 
     * @return favoriteItemList
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListT[] getFavoriteItemList() {
        return favoriteItemList;
    }


    /**
     * Sets the favoriteItemList value for this AddItemToFavoriteItemListRequestT.
     * 
     * @param favoriteItemList
     */
    public void setFavoriteItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListT[] favoriteItemList) {
        this.favoriteItemList = favoriteItemList;
    }

    public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListT getFavoriteItemList(int i) {
        return this.favoriteItemList[i];
    }

    public void setFavoriteItemList(int i, kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListT _value) {
        this.favoriteItemList[i] = _value;
    }


    /**
     * Gets the version value for this AddItemToFavoriteItemListRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AddItemToFavoriteItemListRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddItemToFavoriteItemListRequestT)) return false;
        AddItemToFavoriteItemListRequestT other = (AddItemToFavoriteItemListRequestT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberTicket==null && other.getMemberTicket()==null) || 
             (this.memberTicket!=null &&
              this.memberTicket.equals(other.getMemberTicket()))) &&
            ((this.favoriteItemList==null && other.getFavoriteItemList()==null) || 
             (this.favoriteItemList!=null &&
              java.util.Arrays.equals(this.favoriteItemList, other.getFavoriteItemList()))) &&
            this.version == other.getVersion();
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
        if (getMemberTicket() != null) {
            _hashCode += getMemberTicket().hashCode();
        }
        if (getFavoriteItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFavoriteItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFavoriteItemList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddItemToFavoriteItemListRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AddItemToFavoriteItemListRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MemberTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberTicketT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoriteItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "FavoriteItemListT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
