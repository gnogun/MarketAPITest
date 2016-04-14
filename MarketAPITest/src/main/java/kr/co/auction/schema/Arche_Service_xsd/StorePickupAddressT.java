/**
 * StorePickupAddressT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class StorePickupAddressT  implements java.io.Serializable {
    private java.lang.String storeName;  // attribute

    private java.lang.String president;  // attribute

    private java.lang.String officeTel;  // attribute

    private java.lang.String mobileTel;  // attribute

    private java.lang.String postNo;  // attribute

    private java.lang.String addrPost;  // attribute

    private java.lang.String addrDetail;  // attribute

    private java.lang.String mapImagePath;  // attribute

    private java.lang.String mapURL;  // attribute

    private java.lang.String locationExplain;  // attribute

    private int sellerAddrNo;  // attribute

    public StorePickupAddressT() {
    }

    public StorePickupAddressT(
           java.lang.String storeName,
           java.lang.String president,
           java.lang.String officeTel,
           java.lang.String mobileTel,
           java.lang.String postNo,
           java.lang.String addrPost,
           java.lang.String addrDetail,
           java.lang.String mapImagePath,
           java.lang.String mapURL,
           java.lang.String locationExplain,
           int sellerAddrNo) {
           this.storeName = storeName;
           this.president = president;
           this.officeTel = officeTel;
           this.mobileTel = mobileTel;
           this.postNo = postNo;
           this.addrPost = addrPost;
           this.addrDetail = addrDetail;
           this.mapImagePath = mapImagePath;
           this.mapURL = mapURL;
           this.locationExplain = locationExplain;
           this.sellerAddrNo = sellerAddrNo;
    }


    /**
     * Gets the storeName value for this StorePickupAddressT.
     * 
     * @return storeName
     */
    public java.lang.String getStoreName() {
        return storeName;
    }


    /**
     * Sets the storeName value for this StorePickupAddressT.
     * 
     * @param storeName
     */
    public void setStoreName(java.lang.String storeName) {
        this.storeName = storeName;
    }


    /**
     * Gets the president value for this StorePickupAddressT.
     * 
     * @return president
     */
    public java.lang.String getPresident() {
        return president;
    }


    /**
     * Sets the president value for this StorePickupAddressT.
     * 
     * @param president
     */
    public void setPresident(java.lang.String president) {
        this.president = president;
    }


    /**
     * Gets the officeTel value for this StorePickupAddressT.
     * 
     * @return officeTel
     */
    public java.lang.String getOfficeTel() {
        return officeTel;
    }


    /**
     * Sets the officeTel value for this StorePickupAddressT.
     * 
     * @param officeTel
     */
    public void setOfficeTel(java.lang.String officeTel) {
        this.officeTel = officeTel;
    }


    /**
     * Gets the mobileTel value for this StorePickupAddressT.
     * 
     * @return mobileTel
     */
    public java.lang.String getMobileTel() {
        return mobileTel;
    }


    /**
     * Sets the mobileTel value for this StorePickupAddressT.
     * 
     * @param mobileTel
     */
    public void setMobileTel(java.lang.String mobileTel) {
        this.mobileTel = mobileTel;
    }


    /**
     * Gets the postNo value for this StorePickupAddressT.
     * 
     * @return postNo
     */
    public java.lang.String getPostNo() {
        return postNo;
    }


    /**
     * Sets the postNo value for this StorePickupAddressT.
     * 
     * @param postNo
     */
    public void setPostNo(java.lang.String postNo) {
        this.postNo = postNo;
    }


    /**
     * Gets the addrPost value for this StorePickupAddressT.
     * 
     * @return addrPost
     */
    public java.lang.String getAddrPost() {
        return addrPost;
    }


    /**
     * Sets the addrPost value for this StorePickupAddressT.
     * 
     * @param addrPost
     */
    public void setAddrPost(java.lang.String addrPost) {
        this.addrPost = addrPost;
    }


    /**
     * Gets the addrDetail value for this StorePickupAddressT.
     * 
     * @return addrDetail
     */
    public java.lang.String getAddrDetail() {
        return addrDetail;
    }


    /**
     * Sets the addrDetail value for this StorePickupAddressT.
     * 
     * @param addrDetail
     */
    public void setAddrDetail(java.lang.String addrDetail) {
        this.addrDetail = addrDetail;
    }


    /**
     * Gets the mapImagePath value for this StorePickupAddressT.
     * 
     * @return mapImagePath
     */
    public java.lang.String getMapImagePath() {
        return mapImagePath;
    }


    /**
     * Sets the mapImagePath value for this StorePickupAddressT.
     * 
     * @param mapImagePath
     */
    public void setMapImagePath(java.lang.String mapImagePath) {
        this.mapImagePath = mapImagePath;
    }


    /**
     * Gets the mapURL value for this StorePickupAddressT.
     * 
     * @return mapURL
     */
    public java.lang.String getMapURL() {
        return mapURL;
    }


    /**
     * Sets the mapURL value for this StorePickupAddressT.
     * 
     * @param mapURL
     */
    public void setMapURL(java.lang.String mapURL) {
        this.mapURL = mapURL;
    }


    /**
     * Gets the locationExplain value for this StorePickupAddressT.
     * 
     * @return locationExplain
     */
    public java.lang.String getLocationExplain() {
        return locationExplain;
    }


    /**
     * Sets the locationExplain value for this StorePickupAddressT.
     * 
     * @param locationExplain
     */
    public void setLocationExplain(java.lang.String locationExplain) {
        this.locationExplain = locationExplain;
    }


    /**
     * Gets the sellerAddrNo value for this StorePickupAddressT.
     * 
     * @return sellerAddrNo
     */
    public int getSellerAddrNo() {
        return sellerAddrNo;
    }


    /**
     * Sets the sellerAddrNo value for this StorePickupAddressT.
     * 
     * @param sellerAddrNo
     */
    public void setSellerAddrNo(int sellerAddrNo) {
        this.sellerAddrNo = sellerAddrNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorePickupAddressT)) return false;
        StorePickupAddressT other = (StorePickupAddressT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storeName==null && other.getStoreName()==null) || 
             (this.storeName!=null &&
              this.storeName.equals(other.getStoreName()))) &&
            ((this.president==null && other.getPresident()==null) || 
             (this.president!=null &&
              this.president.equals(other.getPresident()))) &&
            ((this.officeTel==null && other.getOfficeTel()==null) || 
             (this.officeTel!=null &&
              this.officeTel.equals(other.getOfficeTel()))) &&
            ((this.mobileTel==null && other.getMobileTel()==null) || 
             (this.mobileTel!=null &&
              this.mobileTel.equals(other.getMobileTel()))) &&
            ((this.postNo==null && other.getPostNo()==null) || 
             (this.postNo!=null &&
              this.postNo.equals(other.getPostNo()))) &&
            ((this.addrPost==null && other.getAddrPost()==null) || 
             (this.addrPost!=null &&
              this.addrPost.equals(other.getAddrPost()))) &&
            ((this.addrDetail==null && other.getAddrDetail()==null) || 
             (this.addrDetail!=null &&
              this.addrDetail.equals(other.getAddrDetail()))) &&
            ((this.mapImagePath==null && other.getMapImagePath()==null) || 
             (this.mapImagePath!=null &&
              this.mapImagePath.equals(other.getMapImagePath()))) &&
            ((this.mapURL==null && other.getMapURL()==null) || 
             (this.mapURL!=null &&
              this.mapURL.equals(other.getMapURL()))) &&
            ((this.locationExplain==null && other.getLocationExplain()==null) || 
             (this.locationExplain!=null &&
              this.locationExplain.equals(other.getLocationExplain()))) &&
            this.sellerAddrNo == other.getSellerAddrNo();
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
        if (getStoreName() != null) {
            _hashCode += getStoreName().hashCode();
        }
        if (getPresident() != null) {
            _hashCode += getPresident().hashCode();
        }
        if (getOfficeTel() != null) {
            _hashCode += getOfficeTel().hashCode();
        }
        if (getMobileTel() != null) {
            _hashCode += getMobileTel().hashCode();
        }
        if (getPostNo() != null) {
            _hashCode += getPostNo().hashCode();
        }
        if (getAddrPost() != null) {
            _hashCode += getAddrPost().hashCode();
        }
        if (getAddrDetail() != null) {
            _hashCode += getAddrDetail().hashCode();
        }
        if (getMapImagePath() != null) {
            _hashCode += getMapImagePath().hashCode();
        }
        if (getMapURL() != null) {
            _hashCode += getMapURL().hashCode();
        }
        if (getLocationExplain() != null) {
            _hashCode += getLocationExplain().hashCode();
        }
        _hashCode += getSellerAddrNo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorePickupAddressT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StorePickupAddressT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("storeName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StoreName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("president");
        attrField.setXmlName(new javax.xml.namespace.QName("", "President"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("officeTel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OfficeTel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mobileTel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MobileTel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("postNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PostNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addrPost");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddrPost"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("addrDetail");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AddrDetail"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mapImagePath");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MapImagePath"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mapURL");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MapURL"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("locationExplain");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LocationExplain"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerAddrNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerAddrNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
