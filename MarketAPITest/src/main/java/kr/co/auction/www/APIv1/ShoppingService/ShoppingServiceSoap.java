/**
 * ShoppingServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.www.APIv1.ShoppingService;

public interface ShoppingServiceSoap extends java.rmi.Remote {

    /**
     * [물품 정보 등록]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addItem(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 등록(모바일 전용)]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemMobileResponseT addItemMobile(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemMobileRequestT req) throws java.rmi.RemoteException;

    /**
     * [중고물품 고정가등록]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemResponseT addUsedItem(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 변경]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItem(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [중고장터 고정가 물품 정보 간편수정]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForUsedMarket(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemForUsedMarketRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 변경 (이미지 전용)]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesResponseT reviseItemPictures(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemPicturesRequestT req) throws java.rmi.RemoteException;

    /**
     * [브랜드관 물품 정보 변경]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemForBrandShop(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemForBrandShopRequestT req) throws java.rmi.RemoteException;

    /**
     * [Vertical 상품 정보 변경]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemResponseT reviseItemVertical(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemVerticalRequestT req) throws java.rmi.RemoteException;

    /**
     * [재고 정보 등록]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseStockResponseT reviseItemStock(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseStockRequestT req) throws java.rmi.RemoteException;

    /**
     * [재고 정보 등록]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingResponseT reviseItemSelling(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingRequestT req) throws java.rmi.RemoteException;

    /**
     * [판매 상태 변경]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusResponseT reviseItemSellingStatus(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseItemSellingStatusRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품목록조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellingItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [SellPlus목록조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellingItemListResponseT getSellPlusItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellPlusItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [공짜체험단 물품 목록조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceListResponseT getItemFreeExperienceList(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemFreeExperienceRequestT req) throws java.rmi.RemoteException;

    /**
     * [방문수령지 주소록 조회]
     */
    public java.lang.String getStorePickUpAddress(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetStorePickupAddressNosRequestT req) throws java.rmi.RemoteException;

    /**
     * [판매자 주소록 조회]
     */
    public kr.co.auction.schema.Arche_Service_xsd.SellerAddrT[] getSellerAddresses(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetSellerAddressRequestT req) throws java.rmi.RemoteException;

    /**
     * [원산지코드조회]
     */
    public kr.co.auction.schema.Arche_Code_xsd.NationListT[] getNationCode() throws java.rmi.RemoteException;

    /**
     * [판매자묶음배송비출하지조회]
     */
    public kr.co.auction.schema.Arche_Item3_xsd.ShippingPlaceT[] getShippingPlaceCode(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [ViewItemSelling 설명요]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusResponseT viewItemSelling(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewSellingStatusRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 정보 조회]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewItem(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [종료된 물품 정보 조회]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT viewClosedItem(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [물품 종료 여부 조회]
     */
    public java.lang.String viewItemStatus(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [중고장터 고정가 물품 정보 간편 조회]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemFroUsedMarketResponseT viewItemForUsedMarket(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT req) throws java.rmi.RemoteException;

    /**
     * [재고 정보 조회
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockResponseT viewItemStock(kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemStockRequestT req) throws java.rmi.RemoteException;

    /**
     * [장바구니 담기]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT cart(kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException;

    /**
     * [장바구니 일괄담기]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] carts(kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartRequestT[] requests) throws java.rmi.RemoteException;

    /**
     * [장바구니 보기]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartViewT[] viewCart(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket) throws java.rmi.RemoteException;

    /**
     * [장바구니 상세정보보기]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartDetailViewT viewCartDetail(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException;

    /**
     * [장바구니 변경]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT setCart(long cartNo, kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartRequestT request) throws java.rmi.RemoteException;

    /**
     * [장바구니 삭제]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT removeCart(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, long cartNo) throws java.rmi.RemoteException;

    /**
     * [n개의 장바구니 삭제]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] removeCarts(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, int[] cartNos) throws java.rmi.RemoteException;

    /**
     * [n개의 장바구니 삭제]
     */
    public kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartResponseT[] removeCartsByNos(kr.co.auction.schema.Arche_APISvc_xsd.MemberTicketT memberTicket, kr.co.auction.schema.Arche_Itempage3_Service_xsd.CartNoT[] cartNos) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록]
     */
    public kr.co.auction.schema.Arche_Service_xsd.FavoriteGroupT[] favoriteGroupList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록 추가(개별,일괄)]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResultT[] addGroupToFavoriteGroupList(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddGroupToFavoriteGroupListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록 수정(개별,일괄]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResultT[] reviseFavoriteGroup(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseFavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품 분류목록 삭제(개별,일괄]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteGroupResultT[] removeFavoriteGroup(kr.co.auction.schema.Arche_Sell3_Service_xsd.RemoveFavoriteGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품목록]
     */
    public kr.co.auction.schema.Arche_Service_xsd.FavoriteItemT[] favoriteItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품목록에 추가]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteItemResultT[] addItemToFavoriteItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddItemToFavoriteItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심물품목록에서 삭제]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteItemResultT[] deleteItemFromFavoriteItemList(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteItemFromFavoriteItemListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심모델목록]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.SubFavoriteModelT[][] favoriteModelList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionModelListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심모델에 등록]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelResponseT doFavoriteModelAdd(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteModelRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심모델에 삭제]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelResponseT doFavoriteModelDelete(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteModelRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.MyFavoriteStoreListT[] favoriteStoreList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreListRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심판매자 추가]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreResponseT doFavoriteStoreAdd(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreRequestT req) throws java.rmi.RemoteException;

    /**
     * [나의 관심판매자 삭제]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreResponseT doFavoriteStoreDelete(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 분류목록 추가]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupResponseT doFavoriteStoreGroupAdd(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 분류목록 삭제]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupResponseT doFavoriteStoreGroupDelete(kr.co.auction.schema.Arche_Sell3_Service_xsd.DeleteFavoriteStoreGroupRequestT req) throws java.rmi.RemoteException;

    /**
     * [관심판매자 분류목록 조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupT[] favoriteStoreGroupList(kr.co.auction.schema.Arche_Sell3_Service_xsd.FavoriteAuctionStoreGroupListRequestT req) throws java.rmi.RemoteException;

    /**
     * [Vertical 상품 정보 조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalResponseT viewItemVertical(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewItemVerticalRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 상세 고시 정보 입력]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeResponseT addOfficialNotice(kr.co.auction.schema.Arche_Sell3_Service_xsd.AddOfficialNoticeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 상세 고시 정보 조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeResponseT viewOfficialNotice(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewOfficialNoticeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 상세 고시 정보 항목 조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoResponseT getOfficialNoticeInfo(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetOfficialNoticeInfoRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 속성 추가]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseAttributeResponseT reviseAttribute(kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] req) throws java.rmi.RemoteException;

    /**
     * [상품 속성 조회]
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] viewAttribute(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewItemAttributeRequestT req) throws java.rmi.RemoteException;

    /**
     * [카테고리 속성 조회]
     */
    public kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT[] viewCategoryAttribute(kr.co.auction.schema.Arche_Sell3_Service_xsd.ViewCategoryAttributeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 GEOCODE로 변환]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeKoreaResponseT[] getItemGeocodeKorea(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 조회]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaResponseT[] getItemLocationKorea(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationKoreaRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 변경]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaResponseT reviseitemLocationkorea(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationKoreaRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 GEOCODE로 변환(해외)]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeBroadResponseT[] getItemGeocodeBroad(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemGeocodeRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 조회(해외)]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadResponseT[] getItemLocationBroad(kr.co.auction.schema.Arche_Sell3_Service_xsd.GetItemLocationBroadRequestT req) throws java.rmi.RemoteException;

    /**
     * [상품 위치 정보 변경(해외)]
     */
    public kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadResponseT reviseitemLocationBroad(kr.co.auction.schema.Arche_Sell3_Service_xsd.ReviseitemLocationBroadRequestT req) throws java.rmi.RemoteException;

    /**
     * [DTC 테스트용]
     */
    public kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC1(kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException;

    /**
     * [DTC 테스트용]
     */
    public kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC2(kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException;

    /**
     * [DTC 테스트용]
     */
    public kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTResponseT testDTC3(kr.co.auction.schema.IAC_Buy_API_xsd.TestDTCTRequestT req) throws java.rmi.RemoteException;
}
