/**
 * GetItemGeocodeKoreaResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class GetItemGeocodeKoreaResponseT  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String latitude;

    private java.lang.String longitude;

    private java.lang.String sido;

    private java.lang.String sigugun;

    private java.lang.String dongmyun;

    private java.lang.String etc;

    private boolean status;  // attribute

    private java.lang.String resultMsg;  // attribute

    public GetItemGeocodeKoreaResponseT() {
    }

    public GetItemGeocodeKoreaResponseT(
           java.lang.String address,
           java.lang.String latitude,
           java.lang.String longitude,
           java.lang.String sido,
           java.lang.String sigugun,
           java.lang.String dongmyun,
           java.lang.String etc,
           boolean status,
           java.lang.String resultMsg) {
           this.address = address;
           this.latitude = latitude;
           this.longitude = longitude;
           this.sido = sido;
           this.sigugun = sigugun;
           this.dongmyun = dongmyun;
           this.etc = etc;
           this.status = status;
           this.resultMsg = resultMsg;
    }


    /**
     * Gets the address value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the latitude value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the sido value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return sido
     */
    public java.lang.String getSido() {
        return sido;
    }


    /**
     * Sets the sido value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param sido
     */
    public void setSido(java.lang.String sido) {
        this.sido = sido;
    }


    /**
     * Gets the sigugun value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return sigugun
     */
    public java.lang.String getSigugun() {
        return sigugun;
    }


    /**
     * Sets the sigugun value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param sigugun
     */
    public void setSigugun(java.lang.String sigugun) {
        this.sigugun = sigugun;
    }


    /**
     * Gets the dongmyun value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return dongmyun
     */
    public java.lang.String getDongmyun() {
        return dongmyun;
    }


    /**
     * Sets the dongmyun value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param dongmyun
     */
    public void setDongmyun(java.lang.String dongmyun) {
        this.dongmyun = dongmyun;
    }


    /**
     * Gets the etc value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return etc
     */
    public java.lang.String getEtc() {
        return etc;
    }


    /**
     * Sets the etc value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param etc
     */
    public void setEtc(java.lang.String etc) {
        this.etc = etc;
    }


    /**
     * Gets the status value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


    /**
     * Gets the resultMsg value for this GetItemGeocodeKoreaResponseT.
     * 
     * @return resultMsg
     */
    public java.lang.String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this GetItemGeocodeKoreaResponseT.
     * 
     * @param resultMsg
     */
    public void setResultMsg(java.lang.String resultMsg) {
        this.resultMsg = resultMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetItemGeocodeKoreaResponseT)) return false;
        GetItemGeocodeKoreaResponseT other = (GetItemGeocodeKoreaResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
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
            this.status == other.isStatus() &&
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
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
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResultMsg() != null) {
            _hashCode += getResultMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItemGeocodeKoreaResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemGeocodeKoreaResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resultMsg");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResultMsg"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "Address"));
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
