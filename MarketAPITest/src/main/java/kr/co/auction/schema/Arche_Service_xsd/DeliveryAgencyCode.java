/**
 * DeliveryAgencyCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class DeliveryAgencyCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeliveryAgencyCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _korex = "korex";
    public static final java.lang.String _hyundai = "hyundai";
    public static final java.lang.String _epost = "epost";
    public static final java.lang.String _dongbu = "dongbu";
    public static final java.lang.String _hth = "hth";
    public static final java.lang.String _ajutb = "ajutb";
    public static final java.lang.String _cjgls = "cjgls";
    public static final java.lang.String _kgb = "kgb";
    public static final java.lang.String _yellow = "yellow";
    public static final java.lang.String _hanjin = "hanjin";
    public static final java.lang.String _kgbsl = "kgbsl";
    public static final java.lang.String _kgbls = "kgbls";
    public static final java.lang.String _bellexpress = "bellexpress";
    public static final java.lang.String _hanaro = "hanaro";
    public static final java.lang.String _sagawa = "sagawa";
    public static final java.lang.String _ktlogistics = "ktlogistics";
    public static final java.lang.String _sedex = "sedex";
    public static final java.lang.String _gmgls = "gmgls";
    public static final java.lang.String _nedex = "nedex";
    public static final java.lang.String _etc = "etc";
    public static final java.lang.String _chonil = "chonil";
    public static final java.lang.String _daesin = "daesin";
    public static final java.lang.String _gtx = "gtx";
    public static final java.lang.String _ilyang = "ilyang";
    public static final java.lang.String _innogis = "innogis";
    public static final java.lang.String _kyungdong = "kyungdong";
    public static final java.lang.String _hapdong = "hapdong";
    public static final java.lang.String _winia = "winia";
    public static final DeliveryAgencyCode korex = new DeliveryAgencyCode(_korex);
    public static final DeliveryAgencyCode hyundai = new DeliveryAgencyCode(_hyundai);
    public static final DeliveryAgencyCode epost = new DeliveryAgencyCode(_epost);
    public static final DeliveryAgencyCode dongbu = new DeliveryAgencyCode(_dongbu);
    public static final DeliveryAgencyCode hth = new DeliveryAgencyCode(_hth);
    public static final DeliveryAgencyCode ajutb = new DeliveryAgencyCode(_ajutb);
    public static final DeliveryAgencyCode cjgls = new DeliveryAgencyCode(_cjgls);
    public static final DeliveryAgencyCode kgb = new DeliveryAgencyCode(_kgb);
    public static final DeliveryAgencyCode yellow = new DeliveryAgencyCode(_yellow);
    public static final DeliveryAgencyCode hanjin = new DeliveryAgencyCode(_hanjin);
    public static final DeliveryAgencyCode kgbsl = new DeliveryAgencyCode(_kgbsl);
    public static final DeliveryAgencyCode kgbls = new DeliveryAgencyCode(_kgbls);
    public static final DeliveryAgencyCode bellexpress = new DeliveryAgencyCode(_bellexpress);
    public static final DeliveryAgencyCode hanaro = new DeliveryAgencyCode(_hanaro);
    public static final DeliveryAgencyCode sagawa = new DeliveryAgencyCode(_sagawa);
    public static final DeliveryAgencyCode ktlogistics = new DeliveryAgencyCode(_ktlogistics);
    public static final DeliveryAgencyCode sedex = new DeliveryAgencyCode(_sedex);
    public static final DeliveryAgencyCode gmgls = new DeliveryAgencyCode(_gmgls);
    public static final DeliveryAgencyCode nedex = new DeliveryAgencyCode(_nedex);
    public static final DeliveryAgencyCode etc = new DeliveryAgencyCode(_etc);
    public static final DeliveryAgencyCode chonil = new DeliveryAgencyCode(_chonil);
    public static final DeliveryAgencyCode daesin = new DeliveryAgencyCode(_daesin);
    public static final DeliveryAgencyCode gtx = new DeliveryAgencyCode(_gtx);
    public static final DeliveryAgencyCode ilyang = new DeliveryAgencyCode(_ilyang);
    public static final DeliveryAgencyCode innogis = new DeliveryAgencyCode(_innogis);
    public static final DeliveryAgencyCode kyungdong = new DeliveryAgencyCode(_kyungdong);
    public static final DeliveryAgencyCode hapdong = new DeliveryAgencyCode(_hapdong);
    public static final DeliveryAgencyCode winia = new DeliveryAgencyCode(_winia);
    public java.lang.String getValue() { return _value_;}
    public static DeliveryAgencyCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DeliveryAgencyCode enumeration = (DeliveryAgencyCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeliveryAgencyCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeliveryAgencyCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "DeliveryAgencyCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
