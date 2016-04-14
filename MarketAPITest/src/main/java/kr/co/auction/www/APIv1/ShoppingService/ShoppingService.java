/**
 * ShoppingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.www.APIv1.ShoppingService;

public interface ShoppingService extends javax.xml.rpc.Service {

/**
 * Auction에서 제공되는 Open API에 대한 WSDL입니다.
 */
    public java.lang.String getShoppingServiceSoapAddress();

    public kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoap getShoppingServiceSoap() throws javax.xml.rpc.ServiceException;

    public kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoap getShoppingServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
