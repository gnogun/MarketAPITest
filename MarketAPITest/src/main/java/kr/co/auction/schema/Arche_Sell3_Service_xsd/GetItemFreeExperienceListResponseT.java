/**
 * GetItemFreeExperienceListResponseT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Sell3_Service_xsd;

public class GetItemFreeExperienceListResponseT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceT[] itemFreeExperience;

    private int totalCount;  // attribute

    public GetItemFreeExperienceListResponseT() {
    }

    public GetItemFreeExperienceListResponseT(
           kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceT[] itemFreeExperience,
           int totalCount) {
           this.itemFreeExperience = itemFreeExperience;
           this.totalCount = totalCount;
    }


    /**
     * Gets the itemFreeExperience value for this GetItemFreeExperienceListResponseT.
     * 
     * @return itemFreeExperience
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceT[] getItemFreeExperience() {
        return itemFreeExperience;
    }


    /**
     * Sets the itemFreeExperience value for this GetItemFreeExperienceListResponseT.
     * 
     * @param itemFreeExperience
     */
    public void setItemFreeExperience(kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceT[] itemFreeExperience) {
        this.itemFreeExperience = itemFreeExperience;
    }


    /**
     * Gets the totalCount value for this GetItemFreeExperienceListResponseT.
     * 
     * @return totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this GetItemFreeExperienceListResponseT.
     * 
     * @param totalCount
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetItemFreeExperienceListResponseT)) return false;
        GetItemFreeExperienceListResponseT other = (GetItemFreeExperienceListResponseT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemFreeExperience==null && other.getItemFreeExperience()==null) || 
             (this.itemFreeExperience!=null &&
              java.util.Arrays.equals(this.itemFreeExperience, other.getItemFreeExperience()))) &&
            this.totalCount == other.getTotalCount();
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
        if (getItemFreeExperience() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemFreeExperience());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemFreeExperience(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItemFreeExperienceListResponseT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "GetItemFreeExperienceListResponseT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("totalCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TotalCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFreeExperience");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Sell3.Service.xsd", "ItemFreeExperience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperience"));
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
