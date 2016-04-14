/**
 * RawMaterialsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class RawMaterialsType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RawMaterialsType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Inside = "Inside";
    public static final java.lang.String _ProcessedProduct = "ProcessedProduct";
    public static final java.lang.String _FarmProduct = "FarmProduct";
    public static final java.lang.String _MarineProduct = "MarineProduct";
    public static final RawMaterialsType None = new RawMaterialsType(_None);
    public static final RawMaterialsType Inside = new RawMaterialsType(_Inside);
    public static final RawMaterialsType ProcessedProduct = new RawMaterialsType(_ProcessedProduct);
    public static final RawMaterialsType FarmProduct = new RawMaterialsType(_FarmProduct);
    public static final RawMaterialsType MarineProduct = new RawMaterialsType(_MarineProduct);
    public java.lang.String getValue() { return _value_;}
    public static RawMaterialsType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RawMaterialsType enumeration = (RawMaterialsType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RawMaterialsType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RawMaterialsType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RawMaterialsType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
