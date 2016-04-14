/**
 * StockConditionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class StockConditionCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StockConditionCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Empty = "Empty";
    public static final java.lang.String _Exist = "Exist";
    public static final java.lang.String _UnderTen = "UnderTen";
    public static final java.lang.String _UnderFifty = "UnderFifty";
    public static final java.lang.String _UnderOneHundred = "UnderOneHundred";
    public static final StockConditionCode Empty = new StockConditionCode(_Empty);
    public static final StockConditionCode Exist = new StockConditionCode(_Exist);
    public static final StockConditionCode UnderTen = new StockConditionCode(_UnderTen);
    public static final StockConditionCode UnderFifty = new StockConditionCode(_UnderFifty);
    public static final StockConditionCode UnderOneHundred = new StockConditionCode(_UnderOneHundred);
    public java.lang.String getValue() { return _value_;}
    public static StockConditionCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StockConditionCode enumeration = (StockConditionCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StockConditionCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StockConditionCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "StockConditionCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
