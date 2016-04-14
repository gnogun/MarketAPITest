/**
 * VerTicalItemTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class VerTicalItemTypeCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VerTicalItemTypeCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "1";
    public static final java.lang.String _value2 = "2";
    public static final java.lang.String _value3 = "3";
    public static final java.lang.String _value4 = "4";
    public static final java.lang.String _value5 = "5";
    public static final java.lang.String _value6 = "6";
    public static final java.lang.String _value7 = "7";
    public static final java.lang.String _value8 = "8";
    public static final java.lang.String _value9 = "9";
    public static final java.lang.String _value10 = "10";
    public static final VerTicalItemTypeCode value1 = new VerTicalItemTypeCode(_value1);
    public static final VerTicalItemTypeCode value2 = new VerTicalItemTypeCode(_value2);
    public static final VerTicalItemTypeCode value3 = new VerTicalItemTypeCode(_value3);
    public static final VerTicalItemTypeCode value4 = new VerTicalItemTypeCode(_value4);
    public static final VerTicalItemTypeCode value5 = new VerTicalItemTypeCode(_value5);
    public static final VerTicalItemTypeCode value6 = new VerTicalItemTypeCode(_value6);
    public static final VerTicalItemTypeCode value7 = new VerTicalItemTypeCode(_value7);
    public static final VerTicalItemTypeCode value8 = new VerTicalItemTypeCode(_value8);
    public static final VerTicalItemTypeCode value9 = new VerTicalItemTypeCode(_value9);
    public static final VerTicalItemTypeCode value10 = new VerTicalItemTypeCode(_value10);
    public java.lang.String getValue() { return _value_;}
    public static VerTicalItemTypeCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VerTicalItemTypeCode enumeration = (VerTicalItemTypeCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VerTicalItemTypeCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VerTicalItemTypeCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTicalItemTypeCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
