/**
 * PeriodCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class PeriodCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PeriodCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Day3 = "Day3";
    public static final java.lang.String _Day5 = "Day5";
    public static final java.lang.String _Day7 = "Day7";
    public static final java.lang.String _Day15 = "Day15";
    public static final java.lang.String _Day30 = "Day30";
    public static final java.lang.String _Day60 = "Day60";
    public static final java.lang.String _Day90 = "Day90";
    public static final PeriodCode Day3 = new PeriodCode(_Day3);
    public static final PeriodCode Day5 = new PeriodCode(_Day5);
    public static final PeriodCode Day7 = new PeriodCode(_Day7);
    public static final PeriodCode Day15 = new PeriodCode(_Day15);
    public static final PeriodCode Day30 = new PeriodCode(_Day30);
    public static final PeriodCode Day60 = new PeriodCode(_Day60);
    public static final PeriodCode Day90 = new PeriodCode(_Day90);
    public java.lang.String getValue() { return _value_;}
    public static PeriodCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PeriodCode enumeration = (PeriodCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PeriodCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PeriodCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "PeriodCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
