/**
 * GetSellerAddressRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class GetSellerAddressRequestT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private int version;  // attribute

    private int sellerAddrNo;  // attribute

    private java.lang.String sellerAddrName;  // attribute

    public GetSellerAddressRequestT() {
    }

    public GetSellerAddressRequestT(
           kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           int version,
           int sellerAddrNo,
           java.lang.String sellerAddrName) {
           this.memberTicket = memberTicket;
           this.version = version;
           this.sellerAddrNo = sellerAddrNo;
           this.sellerAddrName = sellerAddrName;
    }


    /**
     * Gets the memberTicket value for this GetSellerAddressRequestT.
     * 
     * @return memberTicket
     */
    public kr.co.auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this GetSellerAddressRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the version value for this GetSellerAddressRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this GetSellerAddressRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the sellerAddrNo value for this GetSellerAddressRequestT.
     * 
     * @return sellerAddrNo
     */
    public int getSellerAddrNo() {
        return sellerAddrNo;
    }


    /**
     * Sets the sellerAddrNo value for this GetSellerAddressRequestT.
     * 
     * @param sellerAddrNo
     */
    public void setSellerAddrNo(int sellerAddrNo) {
        this.sellerAddrNo = sellerAddrNo;
    }


    /**
     * Gets the sellerAddrName value for this GetSellerAddressRequestT.
     * 
     * @return sellerAddrName
     */
    public java.lang.String getSellerAddrName() {
        return sellerAddrName;
    }


    /**
     * Sets the sellerAddrName value for this GetSellerAddressRequestT.
     * 
     * @param sellerAddrName
     */
    public void setSellerAddrName(java.lang.String sellerAddrName) {
        this.sellerAddrName = sellerAddrName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSellerAddressRequestT)) return false;
        GetSellerAddressRequestT other = (GetSellerAddressRequestT) obj;
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
            this.version == other.getVersion() &&
            this.sellerAddrNo == other.getSellerAddrNo() &&
            ((this.sellerAddrName==null && other.getSellerAddrName()==null) || 
             (this.sellerAddrName!=null &&
              this.sellerAddrName.equals(other.getSellerAddrName())));
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
        _hashCode += getVersion();
        _hashCode += getSellerAddrNo();
        if (getSellerAddrName() != null) {
            _hashCode += getSellerAddrName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSellerAddressRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetSellerAddressRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerAddrNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerAddrName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
