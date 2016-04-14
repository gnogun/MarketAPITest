/**
 * MyFavoriteStoreListT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class MyFavoriteStoreListT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreBestItemListT myFavoriteStoreBestItemList;

    private kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreItemListT[] myFavoriteStoreItemList;

    private java.lang.String sellerID;  // attribute

    private java.lang.String nickName;  // attribute

    private int sellingItemCount;  // attribute

    private java.lang.String favoriteCard;  // attribute

    private java.lang.String sohoSellerYN;  // attribute

    public MyFavoriteStoreListT() {
    }

    public MyFavoriteStoreListT(
           kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreBestItemListT myFavoriteStoreBestItemList,
           kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreItemListT[] myFavoriteStoreItemList,
           java.lang.String sellerID,
           java.lang.String nickName,
           int sellingItemCount,
           java.lang.String favoriteCard,
           java.lang.String sohoSellerYN) {
           this.myFavoriteStoreBestItemList = myFavoriteStoreBestItemList;
           this.myFavoriteStoreItemList = myFavoriteStoreItemList;
           this.sellerID = sellerID;
           this.nickName = nickName;
           this.sellingItemCount = sellingItemCount;
           this.favoriteCard = favoriteCard;
           this.sohoSellerYN = sohoSellerYN;
    }


    /**
     * Gets the myFavoriteStoreBestItemList value for this MyFavoriteStoreListT.
     * 
     * @return myFavoriteStoreBestItemList
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreBestItemListT getMyFavoriteStoreBestItemList() {
        return myFavoriteStoreBestItemList;
    }


    /**
     * Sets the myFavoriteStoreBestItemList value for this MyFavoriteStoreListT.
     * 
     * @param myFavoriteStoreBestItemList
     */
    public void setMyFavoriteStoreBestItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreBestItemListT myFavoriteStoreBestItemList) {
        this.myFavoriteStoreBestItemList = myFavoriteStoreBestItemList;
    }


    /**
     * Gets the myFavoriteStoreItemList value for this MyFavoriteStoreListT.
     * 
     * @return myFavoriteStoreItemList
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreItemListT[] getMyFavoriteStoreItemList() {
        return myFavoriteStoreItemList;
    }


    /**
     * Sets the myFavoriteStoreItemList value for this MyFavoriteStoreListT.
     * 
     * @param myFavoriteStoreItemList
     */
    public void setMyFavoriteStoreItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreItemListT[] myFavoriteStoreItemList) {
        this.myFavoriteStoreItemList = myFavoriteStoreItemList;
    }

    public kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreItemListT getMyFavoriteStoreItemList(int i) {
        return this.myFavoriteStoreItemList[i];
    }

    public void setMyFavoriteStoreItemList(int i, kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreItemListT _value) {
        this.myFavoriteStoreItemList[i] = _value;
    }


    /**
     * Gets the sellerID value for this MyFavoriteStoreListT.
     * 
     * @return sellerID
     */
    public java.lang.String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this MyFavoriteStoreListT.
     * 
     * @param sellerID
     */
    public void setSellerID(java.lang.String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the nickName value for this MyFavoriteStoreListT.
     * 
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this MyFavoriteStoreListT.
     * 
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the sellingItemCount value for this MyFavoriteStoreListT.
     * 
     * @return sellingItemCount
     */
    public int getSellingItemCount() {
        return sellingItemCount;
    }


    /**
     * Sets the sellingItemCount value for this MyFavoriteStoreListT.
     * 
     * @param sellingItemCount
     */
    public void setSellingItemCount(int sellingItemCount) {
        this.sellingItemCount = sellingItemCount;
    }


    /**
     * Gets the favoriteCard value for this MyFavoriteStoreListT.
     * 
     * @return favoriteCard
     */
    public java.lang.String getFavoriteCard() {
        return favoriteCard;
    }


    /**
     * Sets the favoriteCard value for this MyFavoriteStoreListT.
     * 
     * @param favoriteCard
     */
    public void setFavoriteCard(java.lang.String favoriteCard) {
        this.favoriteCard = favoriteCard;
    }


    /**
     * Gets the sohoSellerYN value for this MyFavoriteStoreListT.
     * 
     * @return sohoSellerYN
     */
    public java.lang.String getSohoSellerYN() {
        return sohoSellerYN;
    }


    /**
     * Sets the sohoSellerYN value for this MyFavoriteStoreListT.
     * 
     * @param sohoSellerYN
     */
    public void setSohoSellerYN(java.lang.String sohoSellerYN) {
        this.sohoSellerYN = sohoSellerYN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyFavoriteStoreListT)) return false;
        MyFavoriteStoreListT other = (MyFavoriteStoreListT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.myFavoriteStoreBestItemList==null && other.getMyFavoriteStoreBestItemList()==null) || 
             (this.myFavoriteStoreBestItemList!=null &&
              this.myFavoriteStoreBestItemList.equals(other.getMyFavoriteStoreBestItemList()))) &&
            ((this.myFavoriteStoreItemList==null && other.getMyFavoriteStoreItemList()==null) || 
             (this.myFavoriteStoreItemList!=null &&
              java.util.Arrays.equals(this.myFavoriteStoreItemList, other.getMyFavoriteStoreItemList()))) &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            ((this.nickName==null && other.getNickName()==null) || 
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            this.sellingItemCount == other.getSellingItemCount() &&
            ((this.favoriteCard==null && other.getFavoriteCard()==null) || 
             (this.favoriteCard!=null &&
              this.favoriteCard.equals(other.getFavoriteCard()))) &&
            ((this.sohoSellerYN==null && other.getSohoSellerYN()==null) || 
             (this.sohoSellerYN!=null &&
              this.sohoSellerYN.equals(other.getSohoSellerYN())));
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
        if (getMyFavoriteStoreBestItemList() != null) {
            _hashCode += getMyFavoriteStoreBestItemList().hashCode();
        }
        if (getMyFavoriteStoreItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMyFavoriteStoreItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMyFavoriteStoreItemList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        _hashCode += getSellingItemCount();
        if (getFavoriteCard() != null) {
            _hashCode += getFavoriteCard().hashCode();
        }
        if (getSohoSellerYN() != null) {
            _hashCode += getSohoSellerYN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyFavoriteStoreListT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreListT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nickName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NickName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellingItemCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellingItemCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("favoriteCard");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FavoriteCard"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sohoSellerYN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SohoSellerYN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myFavoriteStoreBestItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreBestItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreBestItemListT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myFavoriteStoreItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "MyFavoriteStoreItemListT"));
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
