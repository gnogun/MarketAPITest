/**
 * SellingStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class SellingStatusCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SellingStatusCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Waiting = "Waiting";
    public static final java.lang.String _OnSale = "OnSale";
    public static final java.lang.String _Stop = "Stop";
    public static final java.lang.String _StopedByStaff = "StopedByStaff";
    public static final java.lang.String _Closed = "Closed";
    public static final SellingStatusCode Waiting = new SellingStatusCode(_Waiting);
    public static final SellingStatusCode OnSale = new SellingStatusCode(_OnSale);
    public static final SellingStatusCode Stop = new SellingStatusCode(_Stop);
    public static final SellingStatusCode StopedByStaff = new SellingStatusCode(_StopedByStaff);
    public static final SellingStatusCode Closed = new SellingStatusCode(_Closed);
    public java.lang.String getValue() { return _value_;}
    public static SellingStatusCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SellingStatusCode enumeration = (SellingStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SellingStatusCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SellingStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "SellingStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
