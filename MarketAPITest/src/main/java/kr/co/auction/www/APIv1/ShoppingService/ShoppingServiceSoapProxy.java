package kr.co.auction.www.APIv1.ShoppingService;

public class ShoppingServiceSoapProxy implements kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoap {
  private String _endpoint = null;
  private kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoap shoppingServiceSoap = null;
  
  public ShoppingServiceSoapProxy() {
    _initShoppingServiceSoapProxy();
  }
  
  public ShoppingServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initShoppingServiceSoapProxy();
  }
  
  private void _initShoppingServiceSoapProxy() {
    try {
      shoppingServiceSoap = (new kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceLocator()).getShoppingServiceSoap();
      if (shoppingServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shoppingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shoppingServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shoppingServiceSoap != null)
      ((javax.xml.rpc.Stub)shoppingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoap getShoppingServiceSoap() {
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap;
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addItem(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addItem(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT addItemMobile(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemMobileRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addItemMobile(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addUsedItem(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addUsedItem(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItem(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItem(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForUsedMarket(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemForUsedMarketRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemForUsedMarket(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT reviseItemPictures(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemPictures(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForBrandShop(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemForBrandShopRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemForBrandShop(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemVertical(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemVerticalRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemVertical(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT reviseItemStock(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseStockRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemStock(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT reviseItemSelling(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemSelling(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT reviseItemSellingStatus(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseItemSellingStatus(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellingItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getSellingItemList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellPlusItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellPlusItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getSellPlusItemList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT getItemFreeExperienceList(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemFreeExperienceList(req);
  }
  
  public java.lang.String getStorePickUpAddress(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetStorePickupAddressNosRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getStorePickUpAddress(req);
  }
  
  public kr.co.auction.schema.Arche_Service_xsd.SellerAddrT[] getSellerAddresses(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getSellerAddresses(req);
  }
  
  public kr.co.auction.schema.Arche_Code_xsd.NationListT[] getNationCode() throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getNationCode();
  }
  
  public kr.co.auction.schema.Arche_Item3_xsd.ShippingPlaceT[] getShippingPlaceCode(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getShippingPlaceCode(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT viewItemSelling(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemSelling(req);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewItem(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItem(req);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewClosedItem(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewClosedItem(req);
  }
  
  public java.lang.String viewItemStatus(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemStatus(req);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT viewItemForUsedMarket(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemForUsedMarket(req);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT viewItemStock(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemStock(req);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT cart(kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.cart(request);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] carts(kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartRequestT[] requests) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.carts(requests);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartViewT[] viewCart(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewCart(memberTicket);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT viewCartDetail(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewCartDetail(memberTicket, cartNo);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT setCart(long cartNo, kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.setCart(cartNo, request);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT removeCart(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeCart(memberTicket, cartNo);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] removeCarts(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, int[] cartNos) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeCarts(memberTicket, cartNos);
  }
  
  public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] removeCartsByNos(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartNoT[] cartNos) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeCartsByNos(memberTicket, cartNos);
  }
  
  public kr.co.auction.schema.Arche_Service_xsd.FavoriteGroupT[] favoriteGroupList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteGroupList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResultT[] addGroupToFavoriteGroupList(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addGroupToFavoriteGroupList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResultT[] reviseFavoriteGroup(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseFavoriteGroup(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResultT[] removeFavoriteGroup(kr.co.auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.removeFavoriteGroup(req);
  }
  
  public kr.co.auction.schema.Arche_Service_xsd.FavoriteItemT[] favoriteItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteItemList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemResultT[] addItemToFavoriteItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addItemToFavoriteItemList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteItemResultT[] deleteItemFromFavoriteItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.deleteItemFromFavoriteItemList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.SubFavoriteModelT[][] favoriteModelList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteModelList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT doFavoriteModelAdd(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteModelAdd(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT doFavoriteModelDelete(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteModelDelete(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreListT[] favoriteStoreList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteStoreList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT doFavoriteStoreAdd(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreAdd(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT doFavoriteStoreDelete(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreDelete(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT doFavoriteStoreGroupAdd(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreGroupAdd(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT doFavoriteStoreGroupDelete(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.doFavoriteStoreGroupDelete(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupT[] favoriteStoreGroupList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.favoriteStoreGroupList(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT viewItemVertical(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewItemVertical(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT addOfficialNotice(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.addOfficialNotice(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT viewOfficialNotice(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewOfficialNotice(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT getOfficialNoticeInfo(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getOfficialNoticeInfo(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT reviseAttribute(kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseAttribute(req);
  }
  
  public kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] viewAttribute(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewAttribute(req);
  }
  
  public kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT[] viewCategoryAttribute(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.viewCategoryAttribute(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT[] getItemGeocodeKorea(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemGeocodeKorea(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT[] getItemLocationKorea(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemLocationKorea(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT reviseitemLocationkorea(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseitemLocationkorea(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT[] getItemGeocodeBroad(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemGeocodeBroad(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT[] getItemLocationBroad(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.getItemLocationBroad(req);
  }
  
  public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT reviseitemLocationBroad(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.reviseitemLocationBroad(req);
  }
  
  public kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC1(kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.testDTC1(req);
  }
  
  public kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC2(kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.testDTC2(req);
  }
  
  public kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC3(kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException{
    if (shoppingServiceSoap == null)
      _initShoppingServiceSoapProxy();
    return shoppingServiceSoap.testDTC3(req);
  }
  
  
}