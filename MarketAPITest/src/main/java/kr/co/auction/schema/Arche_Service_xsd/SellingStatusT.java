/**
 * SellingStatusT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class SellingStatusT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.PeriodT period;

    private kr.co.auction.schema.Arche_Service_xsd.SellingStatusCode status;  // attribute

    public SellingStatusT() {
    }

    public SellingStatusT(
           kr.co.auction.schema.Arche_Service_xsd.PeriodT period,
           kr.co.auction.schema.Arche_Service_xsd.SellingStatusCode status) {
           this.period = period;
           this.status = status;
    }


    /**
     * Gets the period value for this SellingStatusT.
     * 
     * @return period
     */
    public kr.co.auction.schema.Arche_Service_xsd.PeriodT getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this SellingStatusT.
     * 
     * @param period
     */
    public void setPeriod(kr.co.auction.schema.Arche_Service_xsd.PeriodT period) {
        this.period = period;
    }


    /**
     * Gets the status value for this SellingStatusT.
     * 
     * @return status
     */
    public kr.co.auction.schema.Arche_Service_xsd.SellingStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SellingStatusT.
     * 
     * @param status
     */
    public void setStatus(kr.co.auction.schema.Arche_Service_xsd.SellingStatusCode status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellingStatusT)) return false;
        SellingStatusT other = (SellingStatusT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellingStatusT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingStatusT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingStatusCode"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodT"));
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
