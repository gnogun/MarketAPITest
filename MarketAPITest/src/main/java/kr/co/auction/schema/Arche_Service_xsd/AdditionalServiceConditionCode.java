/**
 * AdditionalServiceConditionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class AdditionalServiceConditionCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdditionalServiceConditionCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NotAvailable = "NotAvailable";
    public static final java.lang.String _Application = "Application";
    public static final java.lang.String _WithInThree = "WithInThree";
    public static final java.lang.String _WithInSeven = "WithInSeven";
    public static final AdditionalServiceConditionCode NotAvailable = new AdditionalServiceConditionCode(_NotAvailable);
    public static final AdditionalServiceConditionCode Application = new AdditionalServiceConditionCode(_Application);
    public static final AdditionalServiceConditionCode WithInThree = new AdditionalServiceConditionCode(_WithInThree);
    public static final AdditionalServiceConditionCode WithInSeven = new AdditionalServiceConditionCode(_WithInSeven);
    public java.lang.String getValue() { return _value_;}
    public static AdditionalServiceConditionCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdditionalServiceConditionCode enumeration = (AdditionalServiceConditionCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdditionalServiceConditionCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdditionalServiceConditionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AdditionalServiceConditionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
