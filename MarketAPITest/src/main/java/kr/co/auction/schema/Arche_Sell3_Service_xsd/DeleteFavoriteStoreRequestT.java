/**
 * DeleteFavoriteStoreRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class DeleteFavoriteStoreRequestT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private int groupNo;  // attribute

    private java.lang.String sellerID;  // attribute

    private int version;  // attribute

    public DeleteFavoriteStoreRequestT() {
    }

    public DeleteFavoriteStoreRequestT(
           kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           int groupNo,
           java.lang.String sellerID,
           int version) {
           this.memberTicket = memberTicket;
           this.groupNo = groupNo;
           this.sellerID = sellerID;
           this.version = version;
    }


    /**
     * Gets the memberTicket value for this DeleteFavoriteStoreRequestT.
     * 
     * @return memberTicket
     */
    public kr.co.auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this DeleteFavoriteStoreRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the groupNo value for this DeleteFavoriteStoreRequestT.
     * 
     * @return groupNo
     */
    public int getGroupNo() {
        return groupNo;
    }


    /**
     * Sets the groupNo value for this DeleteFavoriteStoreRequestT.
     * 
     * @param groupNo
     */
    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }


    /**
     * Gets the sellerID value for this DeleteFavoriteStoreRequestT.
     * 
     * @return sellerID
     */
    public java.lang.String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this DeleteFavoriteStoreRequestT.
     * 
     * @param sellerID
     */
    public void setSellerID(java.lang.String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the version value for this DeleteFavoriteStoreRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DeleteFavoriteStoreRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteFavoriteStoreRequestT)) return false;
        DeleteFavoriteStoreRequestT other = (DeleteFavoriteStoreRequestT) obj;
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
            this.groupNo == other.getGroupNo() &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
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
        _hashCode += getGroupNo();
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteFavoriteStoreRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "DeleteFavoriteStoreRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("groupNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GroupNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
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
