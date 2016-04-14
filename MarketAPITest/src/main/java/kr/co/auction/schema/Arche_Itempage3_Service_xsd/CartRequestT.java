/**
 * CartRequestT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Itempage3_Service_xsd;

public class CartRequestT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket;

    private kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestOption;

    private kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartStockTextT[][] requestMessage;

    private kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestProdOption;

    private kr.co.auction.schema.Arche_Service_xsd.RequestCalculationT[] requestOptionCalculation;

    private kr.co.auction.schema.Arche_Itempage3_Service_xsd.RequestShippingT requestShipping;

    private java.lang.String itemID;  // attribute

    private int version;  // attribute

    private boolean transFeePrePaidYN;  // attribute

    private java.lang.String siteID;  // attribute

    private java.lang.String platformType;  // attribute

    private java.lang.String deviceType;  // attribute

    private java.lang.String appType;  // attribute

    private java.lang.String martBranchCode;  // attribute

    private java.lang.String martBranchName;  // attribute

    public CartRequestT() {
    }

    public CartRequestT(
           kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket,
           kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestOption,
           kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartStockTextT[][] requestMessage,
           kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestProdOption,
           kr.co.auction.schema.Arche_Service_xsd.RequestCalculationT[] requestOptionCalculation,
           kr.co.auction.schema.Arche_Itempage3_Service_xsd.RequestShippingT requestShipping,
           java.lang.String itemID,
           int version,
           boolean transFeePrePaidYN,
           java.lang.String siteID,
           java.lang.String platformType,
           java.lang.String deviceType,
           java.lang.String appType,
           java.lang.String martBranchCode,
           java.lang.String martBranchName) {
           this.memberTicket = memberTicket;
           this.requestOption = requestOption;
           this.requestMessage = requestMessage;
           this.requestProdOption = requestProdOption;
           this.requestOptionCalculation = requestOptionCalculation;
           this.requestShipping = requestShipping;
           this.itemID = itemID;
           this.version = version;
           this.transFeePrePaidYN = transFeePrePaidYN;
           this.siteID = siteID;
           this.platformType = platformType;
           this.deviceType = deviceType;
           this.appType = appType;
           this.martBranchCode = martBranchCode;
           this.martBranchName = martBranchName;
    }


    /**
     * Gets the memberTicket value for this CartRequestT.
     * 
     * @return memberTicket
     */
    public kr.co.auction.schema.Arche_Service_xsd.MemberTicketT getMemberTicket() {
        return memberTicket;
    }


    /**
     * Sets the memberTicket value for this CartRequestT.
     * 
     * @param memberTicket
     */
    public void setMemberTicket(kr.co.auction.schema.Arche_Service_xsd.MemberTicketT memberTicket) {
        this.memberTicket = memberTicket;
    }


    /**
     * Gets the requestOption value for this CartRequestT.
     * 
     * @return requestOption
     */
    public kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] getRequestOption() {
        return requestOption;
    }


    /**
     * Sets the requestOption value for this CartRequestT.
     * 
     * @param requestOption
     */
    public void setRequestOption(kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestOption) {
        this.requestOption = requestOption;
    }

    public kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[] getRequestOption(int i) {
        return this.requestOption[i];
    }

    public void setRequestOption(int i, kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[] _value) {
        this.requestOption[i] = _value;
    }


    /**
     * Gets the requestMessage value for this CartRequestT.
     * 
     * @return requestMessage
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartStockTextT[][] getRequestMessage() {
        return requestMessage;
    }


    /**
     * Sets the requestMessage value for this CartRequestT.
     * 
     * @param requestMessage
     */
    public void setRequestMessage(kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartStockTextT[][] requestMessage) {
        this.requestMessage = requestMessage;
    }

    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartStockTextT[] getRequestMessage(int i) {
        return this.requestMessage[i];
    }

    public void setRequestMessage(int i, kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartStockTextT[] _value) {
        this.requestMessage[i] = _value;
    }


    /**
     * Gets the requestProdOption value for this CartRequestT.
     * 
     * @return requestProdOption
     */
    public kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] getRequestProdOption() {
        return requestProdOption;
    }


    /**
     * Sets the requestProdOption value for this CartRequestT.
     * 
     * @param requestProdOption
     */
    public void setRequestProdOption(kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestProdOption) {
        this.requestProdOption = requestProdOption;
    }

    public kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[] getRequestProdOption(int i) {
        return this.requestProdOption[i];
    }

    public void setRequestProdOption(int i, kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[] _value) {
        this.requestProdOption[i] = _value;
    }


    /**
     * Gets the requestOptionCalculation value for this CartRequestT.
     * 
     * @return requestOptionCalculation
     */
    public kr.co.auction.schema.Arche_Service_xsd.RequestCalculationT[] getRequestOptionCalculation() {
        return requestOptionCalculation;
    }


    /**
     * Sets the requestOptionCalculation value for this CartRequestT.
     * 
     * @param requestOptionCalculation
     */
    public void setRequestOptionCalculation(kr.co.auction.schema.Arche_Service_xsd.RequestCalculationT[] requestOptionCalculation) {
        this.requestOptionCalculation = requestOptionCalculation;
    }

    public kr.co.auction.schema.Arche_Service_xsd.RequestCalculationT getRequestOptionCalculation(int i) {
        return this.requestOptionCalculation[i];
    }

    public void setRequestOptionCalculation(int i, kr.co.auction.schema.Arche_Service_xsd.RequestCalculationT _value) {
        this.requestOptionCalculation[i] = _value;
    }


    /**
     * Gets the requestShipping value for this CartRequestT.
     * 
     * @return requestShipping
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.RequestShippingT getRequestShipping() {
        return requestShipping;
    }


    /**
     * Sets the requestShipping value for this CartRequestT.
     * 
     * @param requestShipping
     */
    public void setRequestShipping(kr.co.auction.schema.Arche_Itempage3_Service_xsd.RequestShippingT requestShipping) {
        this.requestShipping = requestShipping;
    }


    /**
     * Gets the itemID value for this CartRequestT.
     * 
     * @return itemID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this CartRequestT.
     * 
     * @param itemID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the version value for this CartRequestT.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this CartRequestT.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the transFeePrePaidYN value for this CartRequestT.
     * 
     * @return transFeePrePaidYN
     */
    public boolean isTransFeePrePaidYN() {
        return transFeePrePaidYN;
    }


    /**
     * Sets the transFeePrePaidYN value for this CartRequestT.
     * 
     * @param transFeePrePaidYN
     */
    public void setTransFeePrePaidYN(boolean transFeePrePaidYN) {
        this.transFeePrePaidYN = transFeePrePaidYN;
    }


    /**
     * Gets the siteID value for this CartRequestT.
     * 
     * @return siteID
     */
    public java.lang.String getSiteID() {
        return siteID;
    }


    /**
     * Sets the siteID value for this CartRequestT.
     * 
     * @param siteID
     */
    public void setSiteID(java.lang.String siteID) {
        this.siteID = siteID;
    }


    /**
     * Gets the platformType value for this CartRequestT.
     * 
     * @return platformType
     */
    public java.lang.String getPlatformType() {
        return platformType;
    }


    /**
     * Sets the platformType value for this CartRequestT.
     * 
     * @param platformType
     */
    public void setPlatformType(java.lang.String platformType) {
        this.platformType = platformType;
    }


    /**
     * Gets the deviceType value for this CartRequestT.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this CartRequestT.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the appType value for this CartRequestT.
     * 
     * @return appType
     */
    public java.lang.String getAppType() {
        return appType;
    }


    /**
     * Sets the appType value for this CartRequestT.
     * 
     * @param appType
     */
    public void setAppType(java.lang.String appType) {
        this.appType = appType;
    }


    /**
     * Gets the martBranchCode value for this CartRequestT.
     * 
     * @return martBranchCode
     */
    public java.lang.String getMartBranchCode() {
        return martBranchCode;
    }


    /**
     * Sets the martBranchCode value for this CartRequestT.
     * 
     * @param martBranchCode
     */
    public void setMartBranchCode(java.lang.String martBranchCode) {
        this.martBranchCode = martBranchCode;
    }


    /**
     * Gets the martBranchName value for this CartRequestT.
     * 
     * @return martBranchName
     */
    public java.lang.String getMartBranchName() {
        return martBranchName;
    }


    /**
     * Sets the martBranchName value for this CartRequestT.
     * 
     * @param martBranchName
     */
    public void setMartBranchName(java.lang.String martBranchName) {
        this.martBranchName = martBranchName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartRequestT)) return false;
        CartRequestT other = (CartRequestT) obj;
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
            ((this.requestOption==null && other.getRequestOption()==null) || 
             (this.requestOption!=null &&
              java.util.Arrays.equals(this.requestOption, other.getRequestOption()))) &&
            ((this.requestMessage==null && other.getRequestMessage()==null) || 
             (this.requestMessage!=null &&
              java.util.Arrays.equals(this.requestMessage, other.getRequestMessage()))) &&
            ((this.requestProdOption==null && other.getRequestProdOption()==null) || 
             (this.requestProdOption!=null &&
              java.util.Arrays.equals(this.requestProdOption, other.getRequestProdOption()))) &&
            ((this.requestOptionCalculation==null && other.getRequestOptionCalculation()==null) || 
             (this.requestOptionCalculation!=null &&
              java.util.Arrays.equals(this.requestOptionCalculation, other.getRequestOptionCalculation()))) &&
            ((this.requestShipping==null && other.getRequestShipping()==null) || 
             (this.requestShipping!=null &&
              this.requestShipping.equals(other.getRequestShipping()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            this.version == other.getVersion() &&
            this.transFeePrePaidYN == other.isTransFeePrePaidYN() &&
            ((this.siteID==null && other.getSiteID()==null) || 
             (this.siteID!=null &&
              this.siteID.equals(other.getSiteID()))) &&
            ((this.platformType==null && other.getPlatformType()==null) || 
             (this.platformType!=null &&
              this.platformType.equals(other.getPlatformType()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.appType==null && other.getAppType()==null) || 
             (this.appType!=null &&
              this.appType.equals(other.getAppType()))) &&
            ((this.martBranchCode==null && other.getMartBranchCode()==null) || 
             (this.martBranchCode!=null &&
              this.martBranchCode.equals(other.getMartBranchCode()))) &&
            ((this.martBranchName==null && other.getMartBranchName()==null) || 
             (this.martBranchName!=null &&
              this.martBranchName.equals(other.getMartBranchName())));
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
        if (getRequestOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestProdOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestProdOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestProdOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestOptionCalculation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestOptionCalculation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestOptionCalculation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestShipping() != null) {
            _hashCode += getRequestShipping().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        _hashCode += getVersion();
        _hashCode += (isTransFeePrePaidYN() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSiteID() != null) {
            _hashCode += getSiteID().hashCode();
        }
        if (getPlatformType() != null) {
            _hashCode += getPlatformType().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getAppType() != null) {
            _hashCode += getAppType().hashCode();
        }
        if (getMartBranchCode() != null) {
            _hashCode += getMartBranchCode().hashCode();
        }
        if (getMartBranchName() != null) {
            _hashCode += getMartBranchName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartRequestT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartRequestT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transFeePrePaidYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TransFeePrePaidYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("siteID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SiteID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("platformType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PlatformType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deviceType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DeviceType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("appType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AppType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("martBranchCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MartBranchCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("martBranchName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MartBranchName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "MemberTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberTicketT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartRequestStockTextT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestProdOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestProdOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestOptionCalculation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestOptionCalculation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RequestCalculationT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "RequestShippingT"));
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
