/**
 * AreaCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class AreaCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AreaCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Nationwide = "Nationwide";
    public static final java.lang.String _NationwidExceptIslands = "NationwidExceptIslands";
    public static final java.lang.String _Seoul = "Seoul";
    public static final java.lang.String _Busan = "Busan";
    public static final java.lang.String _Inchon = "Inchon";
    public static final java.lang.String _Gwangju = "Gwangju";
    public static final java.lang.String _Daegu = "Daegu";
    public static final java.lang.String _Daejeon = "Daejeon";
    public static final java.lang.String _Ulsan = "Ulsan";
    public static final java.lang.String _Gyeonggi = "Gyeonggi";
    public static final java.lang.String _Gangwon = "Gangwon";
    public static final java.lang.String _Chungnam = "Chungnam";
    public static final java.lang.String _Chungbuk = "Chungbuk";
    public static final java.lang.String _Gyeongnam = "Gyeongnam";
    public static final java.lang.String _Gyeongbuk = "Gyeongbuk";
    public static final java.lang.String _Jeonnam = "Jeonnam";
    public static final java.lang.String _Jeonbuk = "Jeonbuk";
    public static final java.lang.String _Jeju = "Jeju";
    public static final java.lang.String _SeoulGyeonggi = "SeoulGyeonggi";
    public static final java.lang.String _SeoulGyeonggiDaejeon = "SeoulGyeonggiDaejeon";
    public static final java.lang.String _ChungCheong = "ChungCheong";
    public static final java.lang.String _Gyeongsang = "Gyeongsang";
    public static final java.lang.String _Jeolla = "Jeolla";
    public static final java.lang.String _BusanUlsan = "BusanUlsan";
    public static final AreaCode Nationwide = new AreaCode(_Nationwide);
    public static final AreaCode NationwidExceptIslands = new AreaCode(_NationwidExceptIslands);
    public static final AreaCode Seoul = new AreaCode(_Seoul);
    public static final AreaCode Busan = new AreaCode(_Busan);
    public static final AreaCode Inchon = new AreaCode(_Inchon);
    public static final AreaCode Gwangju = new AreaCode(_Gwangju);
    public static final AreaCode Daegu = new AreaCode(_Daegu);
    public static final AreaCode Daejeon = new AreaCode(_Daejeon);
    public static final AreaCode Ulsan = new AreaCode(_Ulsan);
    public static final AreaCode Gyeonggi = new AreaCode(_Gyeonggi);
    public static final AreaCode Gangwon = new AreaCode(_Gangwon);
    public static final AreaCode Chungnam = new AreaCode(_Chungnam);
    public static final AreaCode Chungbuk = new AreaCode(_Chungbuk);
    public static final AreaCode Gyeongnam = new AreaCode(_Gyeongnam);
    public static final AreaCode Gyeongbuk = new AreaCode(_Gyeongbuk);
    public static final AreaCode Jeonnam = new AreaCode(_Jeonnam);
    public static final AreaCode Jeonbuk = new AreaCode(_Jeonbuk);
    public static final AreaCode Jeju = new AreaCode(_Jeju);
    public static final AreaCode SeoulGyeonggi = new AreaCode(_SeoulGyeonggi);
    public static final AreaCode SeoulGyeonggiDaejeon = new AreaCode(_SeoulGyeonggiDaejeon);
    public static final AreaCode ChungCheong = new AreaCode(_ChungCheong);
    public static final AreaCode Gyeongsang = new AreaCode(_Gyeongsang);
    public static final AreaCode Jeolla = new AreaCode(_Jeolla);
    public static final AreaCode BusanUlsan = new AreaCode(_BusanUlsan);
    public java.lang.String getValue() { return _value_;}
    public static AreaCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AreaCode enumeration = (AreaCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AreaCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AreaCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AreaCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
