/**
 * ReviseitemLocationKoreaRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class ReviseitemLocationKoreaRequestT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private java.lang.String locationNo;

    private java.lang.String itemID;

    private java.lang.String latitude;

    private java.lang.String longitude;

    private java.lang.String sido;

    private java.lang.String sigugun;

    private java.lang.String dongmyun;

    private java.lang.String etc;

    private java.lang.String shopName;

    private java.lang.String shopTelNo;

    private java.lang.String areaCode;

    private kr.co.auction.schema.Arche_Sell3_Service_xsd.ItemLocationChangeType changeType;

    public ReviseitemLocationKoreaRequestT() {
    }

    public ReviseitemLocationKoreaRequestT(
           kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           java.lang.String locationNo,
           java.lang.String itemID,
           java.lang.String latitude,
           java.lang.String longitude,
           java.lang.String sido,
           java.lang.String sigugun,
           java.lang.String dongmyun,
           java.lang.String etc,
           java.lang.String shopName,
           java.lang.String shopTelNo,
           java.lang.String areaCode,
           kr.co.auction.schema.Arche_Sell3_Service_xsd.ItemLocationChangeType changeType) {
           this.memberTicket = memberTicket;
           this.locationNo = locationNo;
           this.itemID = itemID;
           this.latitude = latitude;
           this.longitude = longitude;
           this.sido = sido;
           this.sigugun = sigugun;
           this.dongmyun = dongmyun;
           this.etc = etc;
           this.shopName = shopName;
           this.shopTelNo = shopTelNo;
           this.areaCode = areaCode;
           this.changeType = changeType;
    }


    /**
     * Gets the memberTicket value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return memberTicket
     */
    public kr.co.auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the locationNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return locationNo
     */
    public java.lang.String getLocationNo() {
        return locationNo;
    }


    /**
     * Sets the locationNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param locationNo
     */
    public void setLocationNo(java.lang.String locationNo) {
        this.locationNo = locationNo;
    }


    /**
     * Gets the itemID value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return itemID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param itemID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the latitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the sido value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return sido
     */
    public java.lang.String getSido() {
        return sido;
    }


    /**
     * Sets the sido value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param sido
     */
    public void setSido(java.lang.String sido) {
        this.sido = sido;
    }


    /**
     * Gets the sigugun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return sigugun
     */
    public java.lang.String getSigugun() {
        return sigugun;
    }


    /**
     * Sets the sigugun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param sigugun
     */
    public void setSigugun(java.lang.String sigugun) {
        this.sigugun = sigugun;
    }


    /**
     * Gets the dongmyun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return dongmyun
     */
    public java.lang.String getDongmyun() {
        return dongmyun;
    }


    /**
     * Sets the dongmyun value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param dongmyun
     */
    public void setDongmyun(java.lang.String dongmyun) {
        this.dongmyun = dongmyun;
    }


    /**
     * Gets the etc value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return etc
     */
    public java.lang.String getEtc() {
        return etc;
    }


    /**
     * Sets the etc value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param etc
     */
    public void setEtc(java.lang.String etc) {
        this.etc = etc;
    }


    /**
     * Gets the shopName value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return shopName
     */
    public java.lang.String getShopName() {
        return shopName;
    }


    /**
     * Sets the shopName value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param shopName
     */
    public void setShopName(java.lang.String shopName) {
        this.shopName = shopName;
    }


    /**
     * Gets the shopTelNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return shopTelNo
     */
    public java.lang.String getShopTelNo() {
        return shopTelNo;
    }


    /**
     * Sets the shopTelNo value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param shopTelNo
     */
    public void setShopTelNo(java.lang.String shopTelNo) {
        this.shopTelNo = shopTelNo;
    }


    /**
     * Gets the areaCode value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return areaCode
     */
    public java.lang.String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param areaCode
     */
    public void setAreaCode(java.lang.String areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the changeType value for this ReviseitemLocationKoreaRequestT.
     * 
     * @return changeType
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ItemLocationChangeType getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this ReviseitemLocationKoreaRequestT.
     * 
     * @param changeType
     */
    public void setChangeType(kr.co.auction.schema.Arche_Sell3_Service_xsd.ItemLocationChangeType changeType) {
        this.changeType = changeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReviseitemLocationKoreaRequestT)) return false;
        ReviseitemLocationKoreaRequestT other = (ReviseitemLocationKoreaRequestT) obj;
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
            ((this.locationNo==null && other.getLocationNo()==null) || 
             (this.locationNo!=null &&
              this.locationNo.equals(other.getLocationNo()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.sido==null && other.getSido()==null) || 
             (this.sido!=null &&
              this.sido.equals(other.getSido()))) &&
            ((this.sigugun==null && other.getSigugun()==null) || 
             (this.sigugun!=null &&
              this.sigugun.equals(other.getSigugun()))) &&
            ((this.dongmyun==null && other.getDongmyun()==null) || 
             (this.dongmyun!=null &&
              this.dongmyun.equals(other.getDongmyun()))) &&
            ((this.etc==null && other.getEtc()==null) || 
             (this.etc!=null &&
              this.etc.equals(other.getEtc()))) &&
            ((this.shopName==null && other.getShopName()==null) || 
             (this.shopName!=null &&
              this.shopName.equals(other.getShopName()))) &&
            ((this.shopTelNo==null && other.getShopTelNo()==null) || 
             (this.shopTelNo!=null &&
              this.shopTelNo.equals(other.getShopTelNo()))) &&
            ((this.areaCode==null && other.getAreaCode()==null) || 
             (this.areaCode!=null &&
              this.areaCode.equals(other.getAreaCode()))) &&
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
        if (getMemberTicket() != null) {
            _hashCode += getMemberTicket().hashCode();
        }
        if (getLocationNo() != null) {
            _hashCode += getLocationNo().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getSido() != null) {
            _hashCode += getSido().hashCode();
        }
        if (getSigugun() != null) {
            _hashCode += getSigugun().hashCode();
        }
        if (getDongmyun() != null) {
            _hashCode += getDongmyun().hashCode();
        }
        if (getEtc() != null) {
            _hashCode += getEtc().hashCode();
        }
        if (getShopName() != null) {
            _hashCode += getShopName().hashCode();
        }
        if (getShopTelNo() != null) {
            _hashCode += getShopTelNo().hashCode();
        }
        if (getAreaCode() != null) {
            _hashCode += getAreaCode().hashCode();
        }
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviseitemLocationKoreaRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ReviseitemLocationKoreaRequestT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MemberTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberTicketT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "LocationNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Sido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigugun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Sigugun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dongmyun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Dongmyun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Etc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ShopName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopTelNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ShopTelNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "AreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ChangeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemLocationChangeType"));
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
