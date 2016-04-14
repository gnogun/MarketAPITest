/**
 * CartDetailViewT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Itempage3_Service_xsd;

public class CartDetailViewT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[][] cartDetail;

    private kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestProdOption;

    private java.lang.String buyerID;  // attribute

    public CartDetailViewT() {
    }

    public CartDetailViewT(
           kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[][] cartDetail,
           kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] requestProdOption,
           java.lang.String buyerID) {
           this.cartDetail = cartDetail;
           this.requestProdOption = requestProdOption;
           this.buyerID = buyerID;
    }


    /**
     * Gets the cartDetail value for this CartDetailViewT.
     * 
     * @return cartDetail
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[][] getCartDetail() {
        return cartDetail;
    }


    /**
     * Sets the cartDetail value for this CartDetailViewT.
     * 
     * @param cartDetail
     */
    public void setCartDetail(kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[][] cartDetail) {
        this.cartDetail = cartDetail;
    }

    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[] getCartDetail(int i) {
        return this.cartDetail[i];
    }

    public void setCartDetail(int i, kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailTextT[] _value) {
        this.cartDetail[i] = _value;
    }


    /**
     * Gets the requestProdOption value for this CartDetailViewT.
     * 
     * @return requestProdOption
     */
    public kr.co.auction.schema.Arche_Service_xsd.SkuInfoT[][] getRequestProdOption() {
        return requestProdOption;
    }


    /**
     * Sets the requestProdOption value for this CartDetailViewT.
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
     * Gets the buyerID value for this CartDetailViewT.
     * 
     * @return buyerID
     */
    public java.lang.String getBuyerID() {
        return buyerID;
    }


    /**
     * Sets the buyerID value for this CartDetailViewT.
     * 
     * @param buyerID
     */
    public void setBuyerID(java.lang.String buyerID) {
        this.buyerID = buyerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartDetailViewT)) return false;
        CartDetailViewT other = (CartDetailViewT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartDetail==null && other.getCartDetail()==null) || 
             (this.cartDetail!=null &&
              java.util.Arrays.equals(this.cartDetail, other.getCartDetail()))) &&
            ((this.requestProdOption==null && other.getRequestProdOption()==null) || 
             (this.requestProdOption!=null &&
              java.util.Arrays.equals(this.requestProdOption, other.getRequestProdOption()))) &&
            ((this.buyerID==null && other.getBuyerID()==null) || 
             (this.buyerID!=null &&
              this.buyerID.equals(other.getBuyerID())));
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
        if (getCartDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCartDetail(), i);
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
        if (getBuyerID() != null) {
            _hashCode += getBuyerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartDetailViewT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailViewT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyerID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyerID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Itempage3.Service.xsd", "CartDetailT"));
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
