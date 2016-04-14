/**
 * SellingItemListSearchConditionT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class SellingItemListSearchConditionT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchCode searchType;  // attribute

    private java.lang.String searchValue;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchTermCode searchTermType;  // attribute

    private java.lang.String searchTermFrom;  // attribute

    private java.lang.String searchTermTo;  // attribute

    private java.lang.String categoryCode;  // attribute

    private java.lang.String modelName;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.SellingItemListStatusCode statusCode;  // attribute

    private boolean sellPossibleCondition;  // attribute

    private boolean sellEndingCondition;  // attribute

    private boolean premiumCondition;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.SellingItemListSortCode sortCondition;  // attribute

    private int currentPageNumber;  // attribute

    public SellingItemListSearchConditionT() {
    }

    public SellingItemListSearchConditionT(
           kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchCode searchType,
           java.lang.String searchValue,
           kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchTermCode searchTermType,
           java.lang.String searchTermFrom,
           java.lang.String searchTermTo,
           java.lang.String categoryCode,
           java.lang.String modelName,
           kr.co.auction.schema.Arche_Service_xsd.SellingItemListStatusCode statusCode,
           boolean sellPossibleCondition,
           boolean sellEndingCondition,
           boolean premiumCondition,
           kr.co.auction.schema.Arche_Service_xsd.SellingItemListSortCode sortCondition,
           int currentPageNumber) {
           this.searchType = searchType;
           this.searchValue = searchValue;
           this.searchTermType = searchTermType;
           this.searchTermFrom = searchTermFrom;
           this.searchTermTo = searchTermTo;
           this.categoryCode = categoryCode;
           this.modelName = modelName;
           this.statusCode = statusCode;
           this.sellPossibleCondition = sellPossibleCondition;
           this.sellEndingCondition = sellEndingCondition;
           this.premiumCondition = premiumCondition;
           this.sortCondition = sortCondition;
           this.currentPageNumber = currentPageNumber;
    }


    /**
     * Gets the searchType value for this SellingItemListSearchConditionT.
     * 
     * @return searchType
     */
    public kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchCode getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this SellingItemListSearchConditionT.
     * 
     * @param searchType
     */
    public void setSearchType(kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchCode searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the searchValue value for this SellingItemListSearchConditionT.
     * 
     * @return searchValue
     */
    public java.lang.String getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SellingItemListSearchConditionT.
     * 
     * @param searchValue
     */
    public void setSearchValue(java.lang.String searchValue) {
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchTermType value for this SellingItemListSearchConditionT.
     * 
     * @return searchTermType
     */
    public kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchTermCode getSearchTermType() {
        return searchTermType;
    }


    /**
     * Sets the searchTermType value for this SellingItemListSearchConditionT.
     * 
     * @param searchTermType
     */
    public void setSearchTermType(kr.co.auction.schema.Arche_Service_xsd.SellingItemListSearchTermCode searchTermType) {
        this.searchTermType = searchTermType;
    }


    /**
     * Gets the searchTermFrom value for this SellingItemListSearchConditionT.
     * 
     * @return searchTermFrom
     */
    public java.lang.String getSearchTermFrom() {
        return searchTermFrom;
    }


    /**
     * Sets the searchTermFrom value for this SellingItemListSearchConditionT.
     * 
     * @param searchTermFrom
     */
    public void setSearchTermFrom(java.lang.String searchTermFrom) {
        this.searchTermFrom = searchTermFrom;
    }


    /**
     * Gets the searchTermTo value for this SellingItemListSearchConditionT.
     * 
     * @return searchTermTo
     */
    public java.lang.String getSearchTermTo() {
        return searchTermTo;
    }


    /**
     * Sets the searchTermTo value for this SellingItemListSearchConditionT.
     * 
     * @param searchTermTo
     */
    public void setSearchTermTo(java.lang.String searchTermTo) {
        this.searchTermTo = searchTermTo;
    }


    /**
     * Gets the categoryCode value for this SellingItemListSearchConditionT.
     * 
     * @return categoryCode
     */
    public java.lang.String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this SellingItemListSearchConditionT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(java.lang.String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the modelName value for this SellingItemListSearchConditionT.
     * 
     * @return modelName
     */
    public java.lang.String getModelName() {
        return modelName;
    }


    /**
     * Sets the modelName value for this SellingItemListSearchConditionT.
     * 
     * @param modelName
     */
    public void setModelName(java.lang.String modelName) {
        this.modelName = modelName;
    }


    /**
     * Gets the statusCode value for this SellingItemListSearchConditionT.
     * 
     * @return statusCode
     */
    public kr.co.auction.schema.Arche_Service_xsd.SellingItemListStatusCode getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this SellingItemListSearchConditionT.
     * 
     * @param statusCode
     */
    public void setStatusCode(kr.co.auction.schema.Arche_Service_xsd.SellingItemListStatusCode statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the sellPossibleCondition value for this SellingItemListSearchConditionT.
     * 
     * @return sellPossibleCondition
     */
    public boolean isSellPossibleCondition() {
        return sellPossibleCondition;
    }


    /**
     * Sets the sellPossibleCondition value for this SellingItemListSearchConditionT.
     * 
     * @param sellPossibleCondition
     */
    public void setSellPossibleCondition(boolean sellPossibleCondition) {
        this.sellPossibleCondition = sellPossibleCondition;
    }


    /**
     * Gets the sellEndingCondition value for this SellingItemListSearchConditionT.
     * 
     * @return sellEndingCondition
     */
    public boolean isSellEndingCondition() {
        return sellEndingCondition;
    }


    /**
     * Sets the sellEndingCondition value for this SellingItemListSearchConditionT.
     * 
     * @param sellEndingCondition
     */
    public void setSellEndingCondition(boolean sellEndingCondition) {
        this.sellEndingCondition = sellEndingCondition;
    }


    /**
     * Gets the premiumCondition value for this SellingItemListSearchConditionT.
     * 
     * @return premiumCondition
     */
    public boolean isPremiumCondition() {
        return premiumCondition;
    }


    /**
     * Sets the premiumCondition value for this SellingItemListSearchConditionT.
     * 
     * @param premiumCondition
     */
    public void setPremiumCondition(boolean premiumCondition) {
        this.premiumCondition = premiumCondition;
    }


    /**
     * Gets the sortCondition value for this SellingItemListSearchConditionT.
     * 
     * @return sortCondition
     */
    public kr.co.auction.schema.Arche_Service_xsd.SellingItemListSortCode getSortCondition() {
        return sortCondition;
    }


    /**
     * Sets the sortCondition value for this SellingItemListSearchConditionT.
     * 
     * @param sortCondition
     */
    public void setSortCondition(kr.co.auction.schema.Arche_Service_xsd.SellingItemListSortCode sortCondition) {
        this.sortCondition = sortCondition;
    }


    /**
     * Gets the currentPageNumber value for this SellingItemListSearchConditionT.
     * 
     * @return currentPageNumber
     */
    public int getCurrentPageNumber() {
        return currentPageNumber;
    }


    /**
     * Sets the currentPageNumber value for this SellingItemListSearchConditionT.
     * 
     * @param currentPageNumber
     */
    public void setCurrentPageNumber(int currentPageNumber) {
        this.currentPageNumber = currentPageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellingItemListSearchConditionT)) return false;
        SellingItemListSearchConditionT other = (SellingItemListSearchConditionT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType()))) &&
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              this.searchValue.equals(other.getSearchValue()))) &&
            ((this.searchTermType==null && other.getSearchTermType()==null) || 
             (this.searchTermType!=null &&
              this.searchTermType.equals(other.getSearchTermType()))) &&
            ((this.searchTermFrom==null && other.getSearchTermFrom()==null) || 
             (this.searchTermFrom!=null &&
              this.searchTermFrom.equals(other.getSearchTermFrom()))) &&
            ((this.searchTermTo==null && other.getSearchTermTo()==null) || 
             (this.searchTermTo!=null &&
              this.searchTermTo.equals(other.getSearchTermTo()))) &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            ((this.modelName==null && other.getModelName()==null) || 
             (this.modelName!=null &&
              this.modelName.equals(other.getModelName()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            this.sellPossibleCondition == other.isSellPossibleCondition() &&
            this.sellEndingCondition == other.isSellEndingCondition() &&
            this.premiumCondition == other.isPremiumCondition() &&
            ((this.sortCondition==null && other.getSortCondition()==null) || 
             (this.sortCondition!=null &&
              this.sortCondition.equals(other.getSortCondition()))) &&
            this.currentPageNumber == other.getCurrentPageNumber();
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
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        if (getSearchValue() != null) {
            _hashCode += getSearchValue().hashCode();
        }
        if (getSearchTermType() != null) {
            _hashCode += getSearchTermType().hashCode();
        }
        if (getSearchTermFrom() != null) {
            _hashCode += getSearchTermFrom().hashCode();
        }
        if (getSearchTermTo() != null) {
            _hashCode += getSearchTermTo().hashCode();
        }
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        if (getModelName() != null) {
            _hashCode += getModelName().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        _hashCode += (isSellPossibleCondition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSellEndingCondition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPremiumCondition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSortCondition() != null) {
            _hashCode += getSortCondition().hashCode();
        }
        _hashCode += getCurrentPageNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellingItemListSearchConditionT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSearchConditionT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSearchCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchTermType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchTermType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSearchTermCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchTermFrom");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchTermFrom"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("searchTermTo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SearchTermTo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("modelName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ModelName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("statusCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StatusCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListStatusCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellPossibleCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellPossibleCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellEndingCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellEndingCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("premiumCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PremiumCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sortCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SortCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingItemListSortCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currentPageNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CurrentPageNumber"));
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
