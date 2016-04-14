/**
 * ItemT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package kr.co.auction.schema.Arche_Service_xsd;

public class ItemT  implements java.io.Serializable {
    private kr.co.auction.schema.Arche_Service_xsd.MemberT seller;

    private kr.co.auction.schema.Arche_Service_xsd.ShippingT shippingFee;

    private kr.co.auction.schema.Arche_Service_xsd.ShippingPlaceT shippingPlace;

    private kr.co.auction.schema.Arche_Service_xsd.ShippingAdditionalT shippingFeeAdditional;

    private kr.co.auction.schema.Arche_Service_xsd.ItemReturnT itemReturn;

    private kr.co.auction.schema.Arche_Service_xsd.ItemContentsHtmlT itemContentsHtml;

    private kr.co.auction.schema.Arche_Service_xsd.ItemAuctionDiscountT itemAuctionDiscount;

    private kr.co.auction.schema.Arche_Service_xsd.CardDiscountT cardDiscount;

    private kr.co.auction.schema.Arche_Service_xsd.ItemPictureT itemPicture;

    private kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT[] categoryAttribute;

    private kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] itemCategoryAttribute;

    private kr.co.auction.schema.Arche_Service_xsd.ItemExtraT itemExtra;

    private java.lang.String min;

    private kr.co.auction.schema.Arche_Service_xsd.ProdCornerT luxuryGoodsCorner;

    private kr.co.auction.schema.Arche_Service_xsd.ItemDiscountT itemDiscount;

    private kr.co.auction.schema.Arche_Service_xsd.TraditionalCornerT traditionalGoodsCorner;

    private kr.co.auction.schema.Arche_Service_xsd.RegionalMarketT regionalMarketCorner;

    private kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceRequestT itemFreeExperience;

    private kr.co.auction.schema.Arche_Service_xsd.ItemCallPlanT[] itemCallPlan;

    private kr.co.auction.schema.Arche_Service_xsd.ShopCatgProdT shopCatgProd;

    private java.lang.String itemID;  // attribute

    private int brandCode;  // attribute

    private java.lang.String brandName;  // attribute

    private java.lang.String userDefineBrandName;  // attribute

    private java.lang.String importNo;  // attribute

    private long catalogCode;  // attribute

    private java.lang.String categoryCode;  // attribute

    private java.lang.String ISBN;  // attribute

    private java.lang.String isbnCodeAllowYn;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.ItemStatusTypeCode itemStatusType;  // attribute

    private java.lang.String name;  // attribute

    private java.lang.String advertiseMessage;  // attribute

    private java.lang.String itemCode;  // attribute

    private java.math.BigDecimal price;  // attribute

    private java.math.BigDecimal discountPrice;  // attribute

    private java.math.BigDecimal auctionDiscount;  // attribute

    private java.math.BigDecimal sellerDiscount;  // attribute

    private java.math.BigDecimal sellerDiscount2;  // attribute

    private java.util.Calendar sellerDiscountFromDate;  // attribute

    private java.util.Calendar sellerDiscountToDate;  // attribute

    private boolean isSellerPointAmnt;  // attribute

    private boolean isSellerPointRate;  // attribute

    private int sellerPointGroupNo;  // attribute

    private int buyableQuantity;  // attribute

    private int buyLimitPeriod;  // attribute

    private java.math.BigDecimal marketPrice;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.OriginTypeCode placeOfOrigin;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.RawMaterialsType rawMaterialsType;  // attribute

    private java.util.Calendar expiry;  // attribute

    private java.util.Calendar productionDate;  // attribute

    private java.lang.String freeGift;  // attribute

    private int sellUnitVolume;  // attribute

    private int sellUnitCode;  // attribute

    private boolean isMultipleSellUnit;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.AreaCode sellingArea;  // attribute

    private boolean isMobile;  // attribute

    private boolean isMobileOnly;  // attribute

    private java.lang.String mobileDescription;  // attribute

    private java.lang.String afterService;  // attribute

    private boolean isPCS;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.VerTypeCode descriptionVerType;  // attribute

    private java.lang.String description;  // attribute

    private boolean isVATFree;  // attribute

    private kr.co.auction.schema.Arche_Service_xsd.BuyLimitTypeCode buyLimitTypeCode;  // attribute

    private int ecouponEffectivePeriod;  // attribute

    private int minBuyQty;  // attribute

    private java.lang.String wishKeyword;  // attribute

    private boolean wishKeywordOptIn;  // attribute

    private boolean isC2C;  // attribute

    private boolean localChain;  // attribute

    private java.lang.String isDonorShopping;  // attribute

    private java.util.Calendar donorShoppingFromDate;  // attribute

    private java.util.Calendar donorShoppingToDate;  // attribute

    private boolean isAdult;  // attribute

    private boolean existRelatedItem;  // attribute

    private boolean enablePCSCoupon;  // attribute

    private boolean isMarton;  // attribute

    private boolean isGeneralCallPlan;  // attribute

    private java.lang.String unit;  // attribute

    private java.math.BigDecimal unitPrice;  // attribute

    private int sellFeeType;  // attribute

    private boolean enableFreePhoneUrl;  // attribute

    private java.lang.String freePhoneApplyUrl;  // attribute

    private boolean isBrandShop;  // attribute

    private java.lang.String brandShopCategoryCode;  // attribute

    private boolean isLease;  // attribute

    private java.lang.String distrType;  // attribute

    private java.lang.String barCode;  // attribute

    private long orderNo;  // attribute

    public ItemT() {
    }

    public ItemT(
           kr.co.auction.schema.Arche_Service_xsd.MemberT seller,
           kr.co.auction.schema.Arche_Service_xsd.ShippingT shippingFee,
           kr.co.auction.schema.Arche_Service_xsd.ShippingPlaceT shippingPlace,
           kr.co.auction.schema.Arche_Service_xsd.ShippingAdditionalT shippingFeeAdditional,
           kr.co.auction.schema.Arche_Service_xsd.ItemReturnT itemReturn,
           kr.co.auction.schema.Arche_Service_xsd.ItemContentsHtmlT itemContentsHtml,
           kr.co.auction.schema.Arche_Service_xsd.ItemAuctionDiscountT itemAuctionDiscount,
           kr.co.auction.schema.Arche_Service_xsd.CardDiscountT cardDiscount,
           kr.co.auction.schema.Arche_Service_xsd.ItemPictureT itemPicture,
           kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT[] categoryAttribute,
           kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] itemCategoryAttribute,
           kr.co.auction.schema.Arche_Service_xsd.ItemExtraT itemExtra,
           java.lang.String min,
           kr.co.auction.schema.Arche_Service_xsd.ProdCornerT luxuryGoodsCorner,
           kr.co.auction.schema.Arche_Service_xsd.ItemDiscountT itemDiscount,
           kr.co.auction.schema.Arche_Service_xsd.TraditionalCornerT traditionalGoodsCorner,
           kr.co.auction.schema.Arche_Service_xsd.RegionalMarketT regionalMarketCorner,
           kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceRequestT itemFreeExperience,
           kr.co.auction.schema.Arche_Service_xsd.ItemCallPlanT[] itemCallPlan,
           kr.co.auction.schema.Arche_Service_xsd.ShopCatgProdT shopCatgProd,
           java.lang.String itemID,
           int brandCode,
           java.lang.String brandName,
           java.lang.String userDefineBrandName,
           java.lang.String importNo,
           long catalogCode,
           java.lang.String categoryCode,
           java.lang.String ISBN,
           java.lang.String isbnCodeAllowYn,
           kr.co.auction.schema.Arche_Service_xsd.ItemStatusTypeCode itemStatusType,
           java.lang.String name,
           java.lang.String advertiseMessage,
           java.lang.String itemCode,
           java.math.BigDecimal price,
           java.math.BigDecimal discountPrice,
           java.math.BigDecimal auctionDiscount,
           java.math.BigDecimal sellerDiscount,
           java.math.BigDecimal sellerDiscount2,
           java.util.Calendar sellerDiscountFromDate,
           java.util.Calendar sellerDiscountToDate,
           boolean isSellerPointAmnt,
           boolean isSellerPointRate,
           int sellerPointGroupNo,
           int buyableQuantity,
           int buyLimitPeriod,
           java.math.BigDecimal marketPrice,
           kr.co.auction.schema.Arche_Service_xsd.OriginTypeCode placeOfOrigin,
           kr.co.auction.schema.Arche_Service_xsd.RawMaterialsType rawMaterialsType,
           java.util.Calendar expiry,
           java.util.Calendar productionDate,
           java.lang.String freeGift,
           int sellUnitVolume,
           int sellUnitCode,
           boolean isMultipleSellUnit,
           kr.co.auction.schema.Arche_Service_xsd.AreaCode sellingArea,
           boolean isMobile,
           boolean isMobileOnly,
           java.lang.String mobileDescription,
           java.lang.String afterService,
           boolean isPCS,
           kr.co.auction.schema.Arche_Service_xsd.VerTypeCode descriptionVerType,
           java.lang.String description,
           boolean isVATFree,
           kr.co.auction.schema.Arche_Service_xsd.BuyLimitTypeCode buyLimitTypeCode,
           int ecouponEffectivePeriod,
           int minBuyQty,
           java.lang.String wishKeyword,
           boolean wishKeywordOptIn,
           boolean isC2C,
           boolean localChain,
           java.lang.String isDonorShopping,
           java.util.Calendar donorShoppingFromDate,
           java.util.Calendar donorShoppingToDate,
           boolean isAdult,
           boolean existRelatedItem,
           boolean enablePCSCoupon,
           boolean isMarton,
           boolean isGeneralCallPlan,
           java.lang.String unit,
           java.math.BigDecimal unitPrice,
           int sellFeeType,
           boolean enableFreePhoneUrl,
           java.lang.String freePhoneApplyUrl,
           boolean isBrandShop,
           java.lang.String brandShopCategoryCode,
           boolean isLease,
           java.lang.String distrType,
           java.lang.String barCode,
           long orderNo) {
           this.seller = seller;
           this.shippingFee = shippingFee;
           this.shippingPlace = shippingPlace;
           this.shippingFeeAdditional = shippingFeeAdditional;
           this.itemReturn = itemReturn;
           this.itemContentsHtml = itemContentsHtml;
           this.itemAuctionDiscount = itemAuctionDiscount;
           this.cardDiscount = cardDiscount;
           this.itemPicture = itemPicture;
           this.categoryAttribute = categoryAttribute;
           this.itemCategoryAttribute = itemCategoryAttribute;
           this.itemExtra = itemExtra;
           this.min = min;
           this.luxuryGoodsCorner = luxuryGoodsCorner;
           this.itemDiscount = itemDiscount;
           this.traditionalGoodsCorner = traditionalGoodsCorner;
           this.regionalMarketCorner = regionalMarketCorner;
           this.itemFreeExperience = itemFreeExperience;
           this.itemCallPlan = itemCallPlan;
           this.shopCatgProd = shopCatgProd;
           this.itemID = itemID;
           this.brandCode = brandCode;
           this.brandName = brandName;
           this.userDefineBrandName = userDefineBrandName;
           this.importNo = importNo;
           this.catalogCode = catalogCode;
           this.categoryCode = categoryCode;
           this.ISBN = ISBN;
           this.isbnCodeAllowYn = isbnCodeAllowYn;
           this.itemStatusType = itemStatusType;
           this.name = name;
           this.advertiseMessage = advertiseMessage;
           this.itemCode = itemCode;
           this.price = price;
           this.discountPrice = discountPrice;
           this.auctionDiscount = auctionDiscount;
           this.sellerDiscount = sellerDiscount;
           this.sellerDiscount2 = sellerDiscount2;
           this.sellerDiscountFromDate = sellerDiscountFromDate;
           this.sellerDiscountToDate = sellerDiscountToDate;
           this.isSellerPointAmnt = isSellerPointAmnt;
           this.isSellerPointRate = isSellerPointRate;
           this.sellerPointGroupNo = sellerPointGroupNo;
           this.buyableQuantity = buyableQuantity;
           this.buyLimitPeriod = buyLimitPeriod;
           this.marketPrice = marketPrice;
           this.placeOfOrigin = placeOfOrigin;
           this.rawMaterialsType = rawMaterialsType;
           this.expiry = expiry;
           this.productionDate = productionDate;
           this.freeGift = freeGift;
           this.sellUnitVolume = sellUnitVolume;
           this.sellUnitCode = sellUnitCode;
           this.isMultipleSellUnit = isMultipleSellUnit;
           this.sellingArea = sellingArea;
           this.isMobile = isMobile;
           this.isMobileOnly = isMobileOnly;
           this.mobileDescription = mobileDescription;
           this.afterService = afterService;
           this.isPCS = isPCS;
           this.descriptionVerType = descriptionVerType;
           this.description = description;
           this.isVATFree = isVATFree;
           this.buyLimitTypeCode = buyLimitTypeCode;
           this.ecouponEffectivePeriod = ecouponEffectivePeriod;
           this.minBuyQty = minBuyQty;
           this.wishKeyword = wishKeyword;
           this.wishKeywordOptIn = wishKeywordOptIn;
           this.isC2C = isC2C;
           this.localChain = localChain;
           this.isDonorShopping = isDonorShopping;
           this.donorShoppingFromDate = donorShoppingFromDate;
           this.donorShoppingToDate = donorShoppingToDate;
           this.isAdult = isAdult;
           this.existRelatedItem = existRelatedItem;
           this.enablePCSCoupon = enablePCSCoupon;
           this.isMarton = isMarton;
           this.isGeneralCallPlan = isGeneralCallPlan;
           this.unit = unit;
           this.unitPrice = unitPrice;
           this.sellFeeType = sellFeeType;
           this.enableFreePhoneUrl = enableFreePhoneUrl;
           this.freePhoneApplyUrl = freePhoneApplyUrl;
           this.isBrandShop = isBrandShop;
           this.brandShopCategoryCode = brandShopCategoryCode;
           this.isLease = isLease;
           this.distrType = distrType;
           this.barCode = barCode;
           this.orderNo = orderNo;
    }


    /**
     * Gets the seller value for this ItemT.
     * 
     * @return seller
     */
    public kr.co.auction.schema.Arche_Service_xsd.MemberT getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this ItemT.
     * 
     * @param seller
     */
    public void setSeller(kr.co.auction.schema.Arche_Service_xsd.MemberT seller) {
        this.seller = seller;
    }


    /**
     * Gets the shippingFee value for this ItemT.
     * 
     * @return shippingFee
     */
    public kr.co.auction.schema.Arche_Service_xsd.ShippingT getShippingFee() {
        return shippingFee;
    }


    /**
     * Sets the shippingFee value for this ItemT.
     * 
     * @param shippingFee
     */
    public void setShippingFee(kr.co.auction.schema.Arche_Service_xsd.ShippingT shippingFee) {
        this.shippingFee = shippingFee;
    }


    /**
     * Gets the shippingPlace value for this ItemT.
     * 
     * @return shippingPlace
     */
    public kr.co.auction.schema.Arche_Service_xsd.ShippingPlaceT getShippingPlace() {
        return shippingPlace;
    }


    /**
     * Sets the shippingPlace value for this ItemT.
     * 
     * @param shippingPlace
     */
    public void setShippingPlace(kr.co.auction.schema.Arche_Service_xsd.ShippingPlaceT shippingPlace) {
        this.shippingPlace = shippingPlace;
    }


    /**
     * Gets the shippingFeeAdditional value for this ItemT.
     * 
     * @return shippingFeeAdditional
     */
    public kr.co.auction.schema.Arche_Service_xsd.ShippingAdditionalT getShippingFeeAdditional() {
        return shippingFeeAdditional;
    }


    /**
     * Sets the shippingFeeAdditional value for this ItemT.
     * 
     * @param shippingFeeAdditional
     */
    public void setShippingFeeAdditional(kr.co.auction.schema.Arche_Service_xsd.ShippingAdditionalT shippingFeeAdditional) {
        this.shippingFeeAdditional = shippingFeeAdditional;
    }


    /**
     * Gets the itemReturn value for this ItemT.
     * 
     * @return itemReturn
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemReturnT getItemReturn() {
        return itemReturn;
    }


    /**
     * Sets the itemReturn value for this ItemT.
     * 
     * @param itemReturn
     */
    public void setItemReturn(kr.co.auction.schema.Arche_Service_xsd.ItemReturnT itemReturn) {
        this.itemReturn = itemReturn;
    }


    /**
     * Gets the itemContentsHtml value for this ItemT.
     * 
     * @return itemContentsHtml
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemContentsHtmlT getItemContentsHtml() {
        return itemContentsHtml;
    }


    /**
     * Sets the itemContentsHtml value for this ItemT.
     * 
     * @param itemContentsHtml
     */
    public void setItemContentsHtml(kr.co.auction.schema.Arche_Service_xsd.ItemContentsHtmlT itemContentsHtml) {
        this.itemContentsHtml = itemContentsHtml;
    }


    /**
     * Gets the itemAuctionDiscount value for this ItemT.
     * 
     * @return itemAuctionDiscount
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemAuctionDiscountT getItemAuctionDiscount() {
        return itemAuctionDiscount;
    }


    /**
     * Sets the itemAuctionDiscount value for this ItemT.
     * 
     * @param itemAuctionDiscount
     */
    public void setItemAuctionDiscount(kr.co.auction.schema.Arche_Service_xsd.ItemAuctionDiscountT itemAuctionDiscount) {
        this.itemAuctionDiscount = itemAuctionDiscount;
    }


    /**
     * Gets the cardDiscount value for this ItemT.
     * 
     * @return cardDiscount
     */
    public kr.co.auction.schema.Arche_Service_xsd.CardDiscountT getCardDiscount() {
        return cardDiscount;
    }


    /**
     * Sets the cardDiscount value for this ItemT.
     * 
     * @param cardDiscount
     */
    public void setCardDiscount(kr.co.auction.schema.Arche_Service_xsd.CardDiscountT cardDiscount) {
        this.cardDiscount = cardDiscount;
    }


    /**
     * Gets the itemPicture value for this ItemT.
     * 
     * @return itemPicture
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemPictureT getItemPicture() {
        return itemPicture;
    }


    /**
     * Sets the itemPicture value for this ItemT.
     * 
     * @param itemPicture
     */
    public void setItemPicture(kr.co.auction.schema.Arche_Service_xsd.ItemPictureT itemPicture) {
        this.itemPicture = itemPicture;
    }


    /**
     * Gets the categoryAttribute value for this ItemT.
     * 
     * @return categoryAttribute
     */
    public kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT[] getCategoryAttribute() {
        return categoryAttribute;
    }


    /**
     * Sets the categoryAttribute value for this ItemT.
     * 
     * @param categoryAttribute
     */
    public void setCategoryAttribute(kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT[] categoryAttribute) {
        this.categoryAttribute = categoryAttribute;
    }

    public kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT getCategoryAttribute(int i) {
        return this.categoryAttribute[i];
    }

    public void setCategoryAttribute(int i, kr.co.auction.schema.Arche_Service_xsd.CategoryAttrT _value) {
        this.categoryAttribute[i] = _value;
    }


    /**
     * Gets the itemCategoryAttribute value for this ItemT.
     * 
     * @return itemCategoryAttribute
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] getItemCategoryAttribute() {
        return itemCategoryAttribute;
    }


    /**
     * Sets the itemCategoryAttribute value for this ItemT.
     * 
     * @param itemCategoryAttribute
     */
    public void setItemCategoryAttribute(kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT[] itemCategoryAttribute) {
        this.itemCategoryAttribute = itemCategoryAttribute;
    }

    public kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT getItemCategoryAttribute(int i) {
        return this.itemCategoryAttribute[i];
    }

    public void setItemCategoryAttribute(int i, kr.co.auction.schema.Arche_Service_xsd.ItemCategoryAttrT _value) {
        this.itemCategoryAttribute[i] = _value;
    }


    /**
     * Gets the itemExtra value for this ItemT.
     * 
     * @return itemExtra
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemExtraT getItemExtra() {
        return itemExtra;
    }


    /**
     * Sets the itemExtra value for this ItemT.
     * 
     * @param itemExtra
     */
    public void setItemExtra(kr.co.auction.schema.Arche_Service_xsd.ItemExtraT itemExtra) {
        this.itemExtra = itemExtra;
    }


    /**
     * Gets the min value for this ItemT.
     * 
     * @return min
     */
    public java.lang.String getMin() {
        return min;
    }


    /**
     * Sets the min value for this ItemT.
     * 
     * @param min
     */
    public void setMin(java.lang.String min) {
        this.min = min;
    }


    /**
     * Gets the luxuryGoodsCorner value for this ItemT.
     * 
     * @return luxuryGoodsCorner
     */
    public kr.co.auction.schema.Arche_Service_xsd.ProdCornerT getLuxuryGoodsCorner() {
        return luxuryGoodsCorner;
    }


    /**
     * Sets the luxuryGoodsCorner value for this ItemT.
     * 
     * @param luxuryGoodsCorner
     */
    public void setLuxuryGoodsCorner(kr.co.auction.schema.Arche_Service_xsd.ProdCornerT luxuryGoodsCorner) {
        this.luxuryGoodsCorner = luxuryGoodsCorner;
    }


    /**
     * Gets the itemDiscount value for this ItemT.
     * 
     * @return itemDiscount
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemDiscountT getItemDiscount() {
        return itemDiscount;
    }


    /**
     * Sets the itemDiscount value for this ItemT.
     * 
     * @param itemDiscount
     */
    public void setItemDiscount(kr.co.auction.schema.Arche_Service_xsd.ItemDiscountT itemDiscount) {
        this.itemDiscount = itemDiscount;
    }


    /**
     * Gets the traditionalGoodsCorner value for this ItemT.
     * 
     * @return traditionalGoodsCorner
     */
    public kr.co.auction.schema.Arche_Service_xsd.TraditionalCornerT getTraditionalGoodsCorner() {
        return traditionalGoodsCorner;
    }


    /**
     * Sets the traditionalGoodsCorner value for this ItemT.
     * 
     * @param traditionalGoodsCorner
     */
    public void setTraditionalGoodsCorner(kr.co.auction.schema.Arche_Service_xsd.TraditionalCornerT traditionalGoodsCorner) {
        this.traditionalGoodsCorner = traditionalGoodsCorner;
    }


    /**
     * Gets the regionalMarketCorner value for this ItemT.
     * 
     * @return regionalMarketCorner
     */
    public kr.co.auction.schema.Arche_Service_xsd.RegionalMarketT getRegionalMarketCorner() {
        return regionalMarketCorner;
    }


    /**
     * Sets the regionalMarketCorner value for this ItemT.
     * 
     * @param regionalMarketCorner
     */
    public void setRegionalMarketCorner(kr.co.auction.schema.Arche_Service_xsd.RegionalMarketT regionalMarketCorner) {
        this.regionalMarketCorner = regionalMarketCorner;
    }


    /**
     * Gets the itemFreeExperience value for this ItemT.
     * 
     * @return itemFreeExperience
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceRequestT getItemFreeExperience() {
        return itemFreeExperience;
    }


    /**
     * Sets the itemFreeExperience value for this ItemT.
     * 
     * @param itemFreeExperience
     */
    public void setItemFreeExperience(kr.co.auction.schema.Arche_Service_xsd.ItemFreeExperienceRequestT itemFreeExperience) {
        this.itemFreeExperience = itemFreeExperience;
    }


    /**
     * Gets the itemCallPlan value for this ItemT.
     * 
     * @return itemCallPlan
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemCallPlanT[] getItemCallPlan() {
        return itemCallPlan;
    }


    /**
     * Sets the itemCallPlan value for this ItemT.
     * 
     * @param itemCallPlan
     */
    public void setItemCallPlan(kr.co.auction.schema.Arche_Service_xsd.ItemCallPlanT[] itemCallPlan) {
        this.itemCallPlan = itemCallPlan;
    }

    public kr.co.auction.schema.Arche_Service_xsd.ItemCallPlanT getItemCallPlan(int i) {
        return this.itemCallPlan[i];
    }

    public void setItemCallPlan(int i, kr.co.auction.schema.Arche_Service_xsd.ItemCallPlanT _value) {
        this.itemCallPlan[i] = _value;
    }


    /**
     * Gets the shopCatgProd value for this ItemT.
     * 
     * @return shopCatgProd
     */
    public kr.co.auction.schema.Arche_Service_xsd.ShopCatgProdT getShopCatgProd() {
        return shopCatgProd;
    }


    /**
     * Sets the shopCatgProd value for this ItemT.
     * 
     * @param shopCatgProd
     */
    public void setShopCatgProd(kr.co.auction.schema.Arche_Service_xsd.ShopCatgProdT shopCatgProd) {
        this.shopCatgProd = shopCatgProd;
    }


    /**
     * Gets the itemID value for this ItemT.
     * 
     * @return itemID
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this ItemT.
     * 
     * @param itemID
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the brandCode value for this ItemT.
     * 
     * @return brandCode
     */
    public int getBrandCode() {
        return brandCode;
    }


    /**
     * Sets the brandCode value for this ItemT.
     * 
     * @param brandCode
     */
    public void setBrandCode(int brandCode) {
        this.brandCode = brandCode;
    }


    /**
     * Gets the brandName value for this ItemT.
     * 
     * @return brandName
     */
    public java.lang.String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this ItemT.
     * 
     * @param brandName
     */
    public void setBrandName(java.lang.String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the userDefineBrandName value for this ItemT.
     * 
     * @return userDefineBrandName
     */
    public java.lang.String getUserDefineBrandName() {
        return userDefineBrandName;
    }


    /**
     * Sets the userDefineBrandName value for this ItemT.
     * 
     * @param userDefineBrandName
     */
    public void setUserDefineBrandName(java.lang.String userDefineBrandName) {
        this.userDefineBrandName = userDefineBrandName;
    }


    /**
     * Gets the importNo value for this ItemT.
     * 
     * @return importNo
     */
    public java.lang.String getImportNo() {
        return importNo;
    }


    /**
     * Sets the importNo value for this ItemT.
     * 
     * @param importNo
     */
    public void setImportNo(java.lang.String importNo) {
        this.importNo = importNo;
    }


    /**
     * Gets the catalogCode value for this ItemT.
     * 
     * @return catalogCode
     */
    public long getCatalogCode() {
        return catalogCode;
    }


    /**
     * Sets the catalogCode value for this ItemT.
     * 
     * @param catalogCode
     */
    public void setCatalogCode(long catalogCode) {
        this.catalogCode = catalogCode;
    }


    /**
     * Gets the categoryCode value for this ItemT.
     * 
     * @return categoryCode
     */
    public java.lang.String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this ItemT.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(java.lang.String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the ISBN value for this ItemT.
     * 
     * @return ISBN
     */
    public java.lang.String getISBN() {
        return ISBN;
    }


    /**
     * Sets the ISBN value for this ItemT.
     * 
     * @param ISBN
     */
    public void setISBN(java.lang.String ISBN) {
        this.ISBN = ISBN;
    }


    /**
     * Gets the isbnCodeAllowYn value for this ItemT.
     * 
     * @return isbnCodeAllowYn
     */
    public java.lang.String getIsbnCodeAllowYn() {
        return isbnCodeAllowYn;
    }


    /**
     * Sets the isbnCodeAllowYn value for this ItemT.
     * 
     * @param isbnCodeAllowYn
     */
    public void setIsbnCodeAllowYn(java.lang.String isbnCodeAllowYn) {
        this.isbnCodeAllowYn = isbnCodeAllowYn;
    }


    /**
     * Gets the itemStatusType value for this ItemT.
     * 
     * @return itemStatusType
     */
    public kr.co.auction.schema.Arche_Service_xsd.ItemStatusTypeCode getItemStatusType() {
        return itemStatusType;
    }


    /**
     * Sets the itemStatusType value for this ItemT.
     * 
     * @param itemStatusType
     */
    public void setItemStatusType(kr.co.auction.schema.Arche_Service_xsd.ItemStatusTypeCode itemStatusType) {
        this.itemStatusType = itemStatusType;
    }


    /**
     * Gets the name value for this ItemT.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ItemT.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the advertiseMessage value for this ItemT.
     * 
     * @return advertiseMessage
     */
    public java.lang.String getAdvertiseMessage() {
        return advertiseMessage;
    }


    /**
     * Sets the advertiseMessage value for this ItemT.
     * 
     * @param advertiseMessage
     */
    public void setAdvertiseMessage(java.lang.String advertiseMessage) {
        this.advertiseMessage = advertiseMessage;
    }


    /**
     * Gets the itemCode value for this ItemT.
     * 
     * @return itemCode
     */
    public java.lang.String getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this ItemT.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.String itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the price value for this ItemT.
     * 
     * @return price
     */
    public java.math.BigDecimal getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ItemT.
     * 
     * @param price
     */
    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }


    /**
     * Gets the discountPrice value for this ItemT.
     * 
     * @return discountPrice
     */
    public java.math.BigDecimal getDiscountPrice() {
        return discountPrice;
    }


    /**
     * Sets the discountPrice value for this ItemT.
     * 
     * @param discountPrice
     */
    public void setDiscountPrice(java.math.BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }


    /**
     * Gets the auctionDiscount value for this ItemT.
     * 
     * @return auctionDiscount
     */
    public java.math.BigDecimal getAuctionDiscount() {
        return auctionDiscount;
    }


    /**
     * Sets the auctionDiscount value for this ItemT.
     * 
     * @param auctionDiscount
     */
    public void setAuctionDiscount(java.math.BigDecimal auctionDiscount) {
        this.auctionDiscount = auctionDiscount;
    }


    /**
     * Gets the sellerDiscount value for this ItemT.
     * 
     * @return sellerDiscount
     */
    public java.math.BigDecimal getSellerDiscount() {
        return sellerDiscount;
    }


    /**
     * Sets the sellerDiscount value for this ItemT.
     * 
     * @param sellerDiscount
     */
    public void setSellerDiscount(java.math.BigDecimal sellerDiscount) {
        this.sellerDiscount = sellerDiscount;
    }


    /**
     * Gets the sellerDiscount2 value for this ItemT.
     * 
     * @return sellerDiscount2
     */
    public java.math.BigDecimal getSellerDiscount2() {
        return sellerDiscount2;
    }


    /**
     * Sets the sellerDiscount2 value for this ItemT.
     * 
     * @param sellerDiscount2
     */
    public void setSellerDiscount2(java.math.BigDecimal sellerDiscount2) {
        this.sellerDiscount2 = sellerDiscount2;
    }


    /**
     * Gets the sellerDiscountFromDate value for this ItemT.
     * 
     * @return sellerDiscountFromDate
     */
    public java.util.Calendar getSellerDiscountFromDate() {
        return sellerDiscountFromDate;
    }


    /**
     * Sets the sellerDiscountFromDate value for this ItemT.
     * 
     * @param sellerDiscountFromDate
     */
    public void setSellerDiscountFromDate(java.util.Calendar sellerDiscountFromDate) {
        this.sellerDiscountFromDate = sellerDiscountFromDate;
    }


    /**
     * Gets the sellerDiscountToDate value for this ItemT.
     * 
     * @return sellerDiscountToDate
     */
    public java.util.Calendar getSellerDiscountToDate() {
        return sellerDiscountToDate;
    }


    /**
     * Sets the sellerDiscountToDate value for this ItemT.
     * 
     * @param sellerDiscountToDate
     */
    public void setSellerDiscountToDate(java.util.Calendar sellerDiscountToDate) {
        this.sellerDiscountToDate = sellerDiscountToDate;
    }


    /**
     * Gets the isSellerPointAmnt value for this ItemT.
     * 
     * @return isSellerPointAmnt
     */
    public boolean isIsSellerPointAmnt() {
        return isSellerPointAmnt;
    }


    /**
     * Sets the isSellerPointAmnt value for this ItemT.
     * 
     * @param isSellerPointAmnt
     */
    public void setIsSellerPointAmnt(boolean isSellerPointAmnt) {
        this.isSellerPointAmnt = isSellerPointAmnt;
    }


    /**
     * Gets the isSellerPointRate value for this ItemT.
     * 
     * @return isSellerPointRate
     */
    public boolean isIsSellerPointRate() {
        return isSellerPointRate;
    }


    /**
     * Sets the isSellerPointRate value for this ItemT.
     * 
     * @param isSellerPointRate
     */
    public void setIsSellerPointRate(boolean isSellerPointRate) {
        this.isSellerPointRate = isSellerPointRate;
    }


    /**
     * Gets the sellerPointGroupNo value for this ItemT.
     * 
     * @return sellerPointGroupNo
     */
    public int getSellerPointGroupNo() {
        return sellerPointGroupNo;
    }


    /**
     * Sets the sellerPointGroupNo value for this ItemT.
     * 
     * @param sellerPointGroupNo
     */
    public void setSellerPointGroupNo(int sellerPointGroupNo) {
        this.sellerPointGroupNo = sellerPointGroupNo;
    }


    /**
     * Gets the buyableQuantity value for this ItemT.
     * 
     * @return buyableQuantity
     */
    public int getBuyableQuantity() {
        return buyableQuantity;
    }


    /**
     * Sets the buyableQuantity value for this ItemT.
     * 
     * @param buyableQuantity
     */
    public void setBuyableQuantity(int buyableQuantity) {
        this.buyableQuantity = buyableQuantity;
    }


    /**
     * Gets the buyLimitPeriod value for this ItemT.
     * 
     * @return buyLimitPeriod
     */
    public int getBuyLimitPeriod() {
        return buyLimitPeriod;
    }


    /**
     * Sets the buyLimitPeriod value for this ItemT.
     * 
     * @param buyLimitPeriod
     */
    public void setBuyLimitPeriod(int buyLimitPeriod) {
        this.buyLimitPeriod = buyLimitPeriod;
    }


    /**
     * Gets the marketPrice value for this ItemT.
     * 
     * @return marketPrice
     */
    public java.math.BigDecimal getMarketPrice() {
        return marketPrice;
    }


    /**
     * Sets the marketPrice value for this ItemT.
     * 
     * @param marketPrice
     */
    public void setMarketPrice(java.math.BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }


    /**
     * Gets the placeOfOrigin value for this ItemT.
     * 
     * @return placeOfOrigin
     */
    public kr.co.auction.schema.Arche_Service_xsd.OriginTypeCode getPlaceOfOrigin() {
        return placeOfOrigin;
    }


    /**
     * Sets the placeOfOrigin value for this ItemT.
     * 
     * @param placeOfOrigin
     */
    public void setPlaceOfOrigin(kr.co.auction.schema.Arche_Service_xsd.OriginTypeCode placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }


    /**
     * Gets the rawMaterialsType value for this ItemT.
     * 
     * @return rawMaterialsType
     */
    public kr.co.auction.schema.Arche_Service_xsd.RawMaterialsType getRawMaterialsType() {
        return rawMaterialsType;
    }


    /**
     * Sets the rawMaterialsType value for this ItemT.
     * 
     * @param rawMaterialsType
     */
    public void setRawMaterialsType(kr.co.auction.schema.Arche_Service_xsd.RawMaterialsType rawMaterialsType) {
        this.rawMaterialsType = rawMaterialsType;
    }


    /**
     * Gets the expiry value for this ItemT.
     * 
     * @return expiry
     */
    public java.util.Calendar getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this ItemT.
     * 
     * @param expiry
     */
    public void setExpiry(java.util.Calendar expiry) {
        this.expiry = expiry;
    }


    /**
     * Gets the productionDate value for this ItemT.
     * 
     * @return productionDate
     */
    public java.util.Calendar getProductionDate() {
        return productionDate;
    }


    /**
     * Sets the productionDate value for this ItemT.
     * 
     * @param productionDate
     */
    public void setProductionDate(java.util.Calendar productionDate) {
        this.productionDate = productionDate;
    }


    /**
     * Gets the freeGift value for this ItemT.
     * 
     * @return freeGift
     */
    public java.lang.String getFreeGift() {
        return freeGift;
    }


    /**
     * Sets the freeGift value for this ItemT.
     * 
     * @param freeGift
     */
    public void setFreeGift(java.lang.String freeGift) {
        this.freeGift = freeGift;
    }


    /**
     * Gets the sellUnitVolume value for this ItemT.
     * 
     * @return sellUnitVolume
     */
    public int getSellUnitVolume() {
        return sellUnitVolume;
    }


    /**
     * Sets the sellUnitVolume value for this ItemT.
     * 
     * @param sellUnitVolume
     */
    public void setSellUnitVolume(int sellUnitVolume) {
        this.sellUnitVolume = sellUnitVolume;
    }


    /**
     * Gets the sellUnitCode value for this ItemT.
     * 
     * @return sellUnitCode
     */
    public int getSellUnitCode() {
        return sellUnitCode;
    }


    /**
     * Sets the sellUnitCode value for this ItemT.
     * 
     * @param sellUnitCode
     */
    public void setSellUnitCode(int sellUnitCode) {
        this.sellUnitCode = sellUnitCode;
    }


    /**
     * Gets the isMultipleSellUnit value for this ItemT.
     * 
     * @return isMultipleSellUnit
     */
    public boolean isIsMultipleSellUnit() {
        return isMultipleSellUnit;
    }


    /**
     * Sets the isMultipleSellUnit value for this ItemT.
     * 
     * @param isMultipleSellUnit
     */
    public void setIsMultipleSellUnit(boolean isMultipleSellUnit) {
        this.isMultipleSellUnit = isMultipleSellUnit;
    }


    /**
     * Gets the sellingArea value for this ItemT.
     * 
     * @return sellingArea
     */
    public kr.co.auction.schema.Arche_Service_xsd.AreaCode getSellingArea() {
        return sellingArea;
    }


    /**
     * Sets the sellingArea value for this ItemT.
     * 
     * @param sellingArea
     */
    public void setSellingArea(kr.co.auction.schema.Arche_Service_xsd.AreaCode sellingArea) {
        this.sellingArea = sellingArea;
    }


    /**
     * Gets the isMobile value for this ItemT.
     * 
     * @return isMobile
     */
    public boolean isIsMobile() {
        return isMobile;
    }


    /**
     * Sets the isMobile value for this ItemT.
     * 
     * @param isMobile
     */
    public void setIsMobile(boolean isMobile) {
        this.isMobile = isMobile;
    }


    /**
     * Gets the isMobileOnly value for this ItemT.
     * 
     * @return isMobileOnly
     */
    public boolean isIsMobileOnly() {
        return isMobileOnly;
    }


    /**
     * Sets the isMobileOnly value for this ItemT.
     * 
     * @param isMobileOnly
     */
    public void setIsMobileOnly(boolean isMobileOnly) {
        this.isMobileOnly = isMobileOnly;
    }


    /**
     * Gets the mobileDescription value for this ItemT.
     * 
     * @return mobileDescription
     */
    public java.lang.String getMobileDescription() {
        return mobileDescription;
    }


    /**
     * Sets the mobileDescription value for this ItemT.
     * 
     * @param mobileDescription
     */
    public void setMobileDescription(java.lang.String mobileDescription) {
        this.mobileDescription = mobileDescription;
    }


    /**
     * Gets the afterService value for this ItemT.
     * 
     * @return afterService
     */
    public java.lang.String getAfterService() {
        return afterService;
    }


    /**
     * Sets the afterService value for this ItemT.
     * 
     * @param afterService
     */
    public void setAfterService(java.lang.String afterService) {
        this.afterService = afterService;
    }


    /**
     * Gets the isPCS value for this ItemT.
     * 
     * @return isPCS
     */
    public boolean isIsPCS() {
        return isPCS;
    }


    /**
     * Sets the isPCS value for this ItemT.
     * 
     * @param isPCS
     */
    public void setIsPCS(boolean isPCS) {
        this.isPCS = isPCS;
    }


    /**
     * Gets the descriptionVerType value for this ItemT.
     * 
     * @return descriptionVerType
     */
    public kr.co.auction.schema.Arche_Service_xsd.VerTypeCode getDescriptionVerType() {
        return descriptionVerType;
    }


    /**
     * Sets the descriptionVerType value for this ItemT.
     * 
     * @param descriptionVerType
     */
    public void setDescriptionVerType(kr.co.auction.schema.Arche_Service_xsd.VerTypeCode descriptionVerType) {
        this.descriptionVerType = descriptionVerType;
    }


    /**
     * Gets the description value for this ItemT.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ItemT.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isVATFree value for this ItemT.
     * 
     * @return isVATFree
     */
    public boolean isIsVATFree() {
        return isVATFree;
    }


    /**
     * Sets the isVATFree value for this ItemT.
     * 
     * @param isVATFree
     */
    public void setIsVATFree(boolean isVATFree) {
        this.isVATFree = isVATFree;
    }


    /**
     * Gets the buyLimitTypeCode value for this ItemT.
     * 
     * @return buyLimitTypeCode
     */
    public kr.co.auction.schema.Arche_Service_xsd.BuyLimitTypeCode getBuyLimitTypeCode() {
        return buyLimitTypeCode;
    }


    /**
     * Sets the buyLimitTypeCode value for this ItemT.
     * 
     * @param buyLimitTypeCode
     */
    public void setBuyLimitTypeCode(kr.co.auction.schema.Arche_Service_xsd.BuyLimitTypeCode buyLimitTypeCode) {
        this.buyLimitTypeCode = buyLimitTypeCode;
    }


    /**
     * Gets the ecouponEffectivePeriod value for this ItemT.
     * 
     * @return ecouponEffectivePeriod
     */
    public int getEcouponEffectivePeriod() {
        return ecouponEffectivePeriod;
    }


    /**
     * Sets the ecouponEffectivePeriod value for this ItemT.
     * 
     * @param ecouponEffectivePeriod
     */
    public void setEcouponEffectivePeriod(int ecouponEffectivePeriod) {
        this.ecouponEffectivePeriod = ecouponEffectivePeriod;
    }


    /**
     * Gets the minBuyQty value for this ItemT.
     * 
     * @return minBuyQty
     */
    public int getMinBuyQty() {
        return minBuyQty;
    }


    /**
     * Sets the minBuyQty value for this ItemT.
     * 
     * @param minBuyQty
     */
    public void setMinBuyQty(int minBuyQty) {
        this.minBuyQty = minBuyQty;
    }


    /**
     * Gets the wishKeyword value for this ItemT.
     * 
     * @return wishKeyword
     */
    public java.lang.String getWishKeyword() {
        return wishKeyword;
    }


    /**
     * Sets the wishKeyword value for this ItemT.
     * 
     * @param wishKeyword
     */
    public void setWishKeyword(java.lang.String wishKeyword) {
        this.wishKeyword = wishKeyword;
    }


    /**
     * Gets the wishKeywordOptIn value for this ItemT.
     * 
     * @return wishKeywordOptIn
     */
    public boolean isWishKeywordOptIn() {
        return wishKeywordOptIn;
    }


    /**
     * Sets the wishKeywordOptIn value for this ItemT.
     * 
     * @param wishKeywordOptIn
     */
    public void setWishKeywordOptIn(boolean wishKeywordOptIn) {
        this.wishKeywordOptIn = wishKeywordOptIn;
    }


    /**
     * Gets the isC2C value for this ItemT.
     * 
     * @return isC2C
     */
    public boolean isIsC2C() {
        return isC2C;
    }


    /**
     * Sets the isC2C value for this ItemT.
     * 
     * @param isC2C
     */
    public void setIsC2C(boolean isC2C) {
        this.isC2C = isC2C;
    }


    /**
     * Gets the localChain value for this ItemT.
     * 
     * @return localChain
     */
    public boolean isLocalChain() {
        return localChain;
    }


    /**
     * Sets the localChain value for this ItemT.
     * 
     * @param localChain
     */
    public void setLocalChain(boolean localChain) {
        this.localChain = localChain;
    }


    /**
     * Gets the isDonorShopping value for this ItemT.
     * 
     * @return isDonorShopping
     */
    public java.lang.String getIsDonorShopping() {
        return isDonorShopping;
    }


    /**
     * Sets the isDonorShopping value for this ItemT.
     * 
     * @param isDonorShopping
     */
    public void setIsDonorShopping(java.lang.String isDonorShopping) {
        this.isDonorShopping = isDonorShopping;
    }


    /**
     * Gets the donorShoppingFromDate value for this ItemT.
     * 
     * @return donorShoppingFromDate
     */
    public java.util.Calendar getDonorShoppingFromDate() {
        return donorShoppingFromDate;
    }


    /**
     * Sets the donorShoppingFromDate value for this ItemT.
     * 
     * @param donorShoppingFromDate
     */
    public void setDonorShoppingFromDate(java.util.Calendar donorShoppingFromDate) {
        this.donorShoppingFromDate = donorShoppingFromDate;
    }


    /**
     * Gets the donorShoppingToDate value for this ItemT.
     * 
     * @return donorShoppingToDate
     */
    public java.util.Calendar getDonorShoppingToDate() {
        return donorShoppingToDate;
    }


    /**
     * Sets the donorShoppingToDate value for this ItemT.
     * 
     * @param donorShoppingToDate
     */
    public void setDonorShoppingToDate(java.util.Calendar donorShoppingToDate) {
        this.donorShoppingToDate = donorShoppingToDate;
    }


    /**
     * Gets the isAdult value for this ItemT.
     * 
     * @return isAdult
     */
    public boolean isIsAdult() {
        return isAdult;
    }


    /**
     * Sets the isAdult value for this ItemT.
     * 
     * @param isAdult
     */
    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }


    /**
     * Gets the existRelatedItem value for this ItemT.
     * 
     * @return existRelatedItem
     */
    public boolean isExistRelatedItem() {
        return existRelatedItem;
    }


    /**
     * Sets the existRelatedItem value for this ItemT.
     * 
     * @param existRelatedItem
     */
    public void setExistRelatedItem(boolean existRelatedItem) {
        this.existRelatedItem = existRelatedItem;
    }


    /**
     * Gets the enablePCSCoupon value for this ItemT.
     * 
     * @return enablePCSCoupon
     */
    public boolean isEnablePCSCoupon() {
        return enablePCSCoupon;
    }


    /**
     * Sets the enablePCSCoupon value for this ItemT.
     * 
     * @param enablePCSCoupon
     */
    public void setEnablePCSCoupon(boolean enablePCSCoupon) {
        this.enablePCSCoupon = enablePCSCoupon;
    }


    /**
     * Gets the isMarton value for this ItemT.
     * 
     * @return isMarton
     */
    public boolean isIsMarton() {
        return isMarton;
    }


    /**
     * Sets the isMarton value for this ItemT.
     * 
     * @param isMarton
     */
    public void setIsMarton(boolean isMarton) {
        this.isMarton = isMarton;
    }


    /**
     * Gets the isGeneralCallPlan value for this ItemT.
     * 
     * @return isGeneralCallPlan
     */
    public boolean isIsGeneralCallPlan() {
        return isGeneralCallPlan;
    }


    /**
     * Sets the isGeneralCallPlan value for this ItemT.
     * 
     * @param isGeneralCallPlan
     */
    public void setIsGeneralCallPlan(boolean isGeneralCallPlan) {
        this.isGeneralCallPlan = isGeneralCallPlan;
    }


    /**
     * Gets the unit value for this ItemT.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ItemT.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the unitPrice value for this ItemT.
     * 
     * @return unitPrice
     */
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ItemT.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the sellFeeType value for this ItemT.
     * 
     * @return sellFeeType
     */
    public int getSellFeeType() {
        return sellFeeType;
    }


    /**
     * Sets the sellFeeType value for this ItemT.
     * 
     * @param sellFeeType
     */
    public void setSellFeeType(int sellFeeType) {
        this.sellFeeType = sellFeeType;
    }


    /**
     * Gets the enableFreePhoneUrl value for this ItemT.
     * 
     * @return enableFreePhoneUrl
     */
    public boolean isEnableFreePhoneUrl() {
        return enableFreePhoneUrl;
    }


    /**
     * Sets the enableFreePhoneUrl value for this ItemT.
     * 
     * @param enableFreePhoneUrl
     */
    public void setEnableFreePhoneUrl(boolean enableFreePhoneUrl) {
        this.enableFreePhoneUrl = enableFreePhoneUrl;
    }


    /**
     * Gets the freePhoneApplyUrl value for this ItemT.
     * 
     * @return freePhoneApplyUrl
     */
    public java.lang.String getFreePhoneApplyUrl() {
        return freePhoneApplyUrl;
    }


    /**
     * Sets the freePhoneApplyUrl value for this ItemT.
     * 
     * @param freePhoneApplyUrl
     */
    public void setFreePhoneApplyUrl(java.lang.String freePhoneApplyUrl) {
        this.freePhoneApplyUrl = freePhoneApplyUrl;
    }


    /**
     * Gets the isBrandShop value for this ItemT.
     * 
     * @return isBrandShop
     */
    public boolean isIsBrandShop() {
        return isBrandShop;
    }


    /**
     * Sets the isBrandShop value for this ItemT.
     * 
     * @param isBrandShop
     */
    public void setIsBrandShop(boolean isBrandShop) {
        this.isBrandShop = isBrandShop;
    }


    /**
     * Gets the brandShopCategoryCode value for this ItemT.
     * 
     * @return brandShopCategoryCode
     */
    public java.lang.String getBrandShopCategoryCode() {
        return brandShopCategoryCode;
    }


    /**
     * Sets the brandShopCategoryCode value for this ItemT.
     * 
     * @param brandShopCategoryCode
     */
    public void setBrandShopCategoryCode(java.lang.String brandShopCategoryCode) {
        this.brandShopCategoryCode = brandShopCategoryCode;
    }


    /**
     * Gets the isLease value for this ItemT.
     * 
     * @return isLease
     */
    public boolean isIsLease() {
        return isLease;
    }


    /**
     * Sets the isLease value for this ItemT.
     * 
     * @param isLease
     */
    public void setIsLease(boolean isLease) {
        this.isLease = isLease;
    }


    /**
     * Gets the distrType value for this ItemT.
     * 
     * @return distrType
     */
    public java.lang.String getDistrType() {
        return distrType;
    }


    /**
     * Sets the distrType value for this ItemT.
     * 
     * @param distrType
     */
    public void setDistrType(java.lang.String distrType) {
        this.distrType = distrType;
    }


    /**
     * Gets the barCode value for this ItemT.
     * 
     * @return barCode
     */
    public java.lang.String getBarCode() {
        return barCode;
    }


    /**
     * Sets the barCode value for this ItemT.
     * 
     * @param barCode
     */
    public void setBarCode(java.lang.String barCode) {
        this.barCode = barCode;
    }


    /**
     * Gets the orderNo value for this ItemT.
     * 
     * @return orderNo
     */
    public long getOrderNo() {
        return orderNo;
    }


    /**
     * Sets the orderNo value for this ItemT.
     * 
     * @param orderNo
     */
    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemT)) return false;
        ItemT other = (ItemT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seller==null && other.getSeller()==null) || 
             (this.seller!=null &&
              this.seller.equals(other.getSeller()))) &&
            ((this.shippingFee==null && other.getShippingFee()==null) || 
             (this.shippingFee!=null &&
              this.shippingFee.equals(other.getShippingFee()))) &&
            ((this.shippingPlace==null && other.getShippingPlace()==null) || 
             (this.shippingPlace!=null &&
              this.shippingPlace.equals(other.getShippingPlace()))) &&
            ((this.shippingFeeAdditional==null && other.getShippingFeeAdditional()==null) || 
             (this.shippingFeeAdditional!=null &&
              this.shippingFeeAdditional.equals(other.getShippingFeeAdditional()))) &&
            ((this.itemReturn==null && other.getItemReturn()==null) || 
             (this.itemReturn!=null &&
              this.itemReturn.equals(other.getItemReturn()))) &&
            ((this.itemContentsHtml==null && other.getItemContentsHtml()==null) || 
             (this.itemContentsHtml!=null &&
              this.itemContentsHtml.equals(other.getItemContentsHtml()))) &&
            ((this.itemAuctionDiscount==null && other.getItemAuctionDiscount()==null) || 
             (this.itemAuctionDiscount!=null &&
              this.itemAuctionDiscount.equals(other.getItemAuctionDiscount()))) &&
            ((this.cardDiscount==null && other.getCardDiscount()==null) || 
             (this.cardDiscount!=null &&
              this.cardDiscount.equals(other.getCardDiscount()))) &&
            ((this.itemPicture==null && other.getItemPicture()==null) || 
             (this.itemPicture!=null &&
              this.itemPicture.equals(other.getItemPicture()))) &&
            ((this.categoryAttribute==null && other.getCategoryAttribute()==null) || 
             (this.categoryAttribute!=null &&
              java.util.Arrays.equals(this.categoryAttribute, other.getCategoryAttribute()))) &&
            ((this.itemCategoryAttribute==null && other.getItemCategoryAttribute()==null) || 
             (this.itemCategoryAttribute!=null &&
              java.util.Arrays.equals(this.itemCategoryAttribute, other.getItemCategoryAttribute()))) &&
            ((this.itemExtra==null && other.getItemExtra()==null) || 
             (this.itemExtra!=null &&
              this.itemExtra.equals(other.getItemExtra()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.luxuryGoodsCorner==null && other.getLuxuryGoodsCorner()==null) || 
             (this.luxuryGoodsCorner!=null &&
              this.luxuryGoodsCorner.equals(other.getLuxuryGoodsCorner()))) &&
            ((this.itemDiscount==null && other.getItemDiscount()==null) || 
             (this.itemDiscount!=null &&
              this.itemDiscount.equals(other.getItemDiscount()))) &&
            ((this.traditionalGoodsCorner==null && other.getTraditionalGoodsCorner()==null) || 
             (this.traditionalGoodsCorner!=null &&
              this.traditionalGoodsCorner.equals(other.getTraditionalGoodsCorner()))) &&
            ((this.regionalMarketCorner==null && other.getRegionalMarketCorner()==null) || 
             (this.regionalMarketCorner!=null &&
              this.regionalMarketCorner.equals(other.getRegionalMarketCorner()))) &&
            ((this.itemFreeExperience==null && other.getItemFreeExperience()==null) || 
             (this.itemFreeExperience!=null &&
              this.itemFreeExperience.equals(other.getItemFreeExperience()))) &&
            ((this.itemCallPlan==null && other.getItemCallPlan()==null) || 
             (this.itemCallPlan!=null &&
              java.util.Arrays.equals(this.itemCallPlan, other.getItemCallPlan()))) &&
            ((this.shopCatgProd==null && other.getShopCatgProd()==null) || 
             (this.shopCatgProd!=null &&
              this.shopCatgProd.equals(other.getShopCatgProd()))) &&
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            this.brandCode == other.getBrandCode() &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.userDefineBrandName==null && other.getUserDefineBrandName()==null) || 
             (this.userDefineBrandName!=null &&
              this.userDefineBrandName.equals(other.getUserDefineBrandName()))) &&
            ((this.importNo==null && other.getImportNo()==null) || 
             (this.importNo!=null &&
              this.importNo.equals(other.getImportNo()))) &&
            this.catalogCode == other.getCatalogCode() &&
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            ((this.ISBN==null && other.getISBN()==null) || 
             (this.ISBN!=null &&
              this.ISBN.equals(other.getISBN()))) &&
            ((this.isbnCodeAllowYn==null && other.getIsbnCodeAllowYn()==null) || 
             (this.isbnCodeAllowYn!=null &&
              this.isbnCodeAllowYn.equals(other.getIsbnCodeAllowYn()))) &&
            ((this.itemStatusType==null && other.getItemStatusType()==null) || 
             (this.itemStatusType!=null &&
              this.itemStatusType.equals(other.getItemStatusType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.advertiseMessage==null && other.getAdvertiseMessage()==null) || 
             (this.advertiseMessage!=null &&
              this.advertiseMessage.equals(other.getAdvertiseMessage()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.discountPrice==null && other.getDiscountPrice()==null) || 
             (this.discountPrice!=null &&
              this.discountPrice.equals(other.getDiscountPrice()))) &&
            ((this.auctionDiscount==null && other.getAuctionDiscount()==null) || 
             (this.auctionDiscount!=null &&
              this.auctionDiscount.equals(other.getAuctionDiscount()))) &&
            ((this.sellerDiscount==null && other.getSellerDiscount()==null) || 
             (this.sellerDiscount!=null &&
              this.sellerDiscount.equals(other.getSellerDiscount()))) &&
            ((this.sellerDiscount2==null && other.getSellerDiscount2()==null) || 
             (this.sellerDiscount2!=null &&
              this.sellerDiscount2.equals(other.getSellerDiscount2()))) &&
            ((this.sellerDiscountFromDate==null && other.getSellerDiscountFromDate()==null) || 
             (this.sellerDiscountFromDate!=null &&
              this.sellerDiscountFromDate.equals(other.getSellerDiscountFromDate()))) &&
            ((this.sellerDiscountToDate==null && other.getSellerDiscountToDate()==null) || 
             (this.sellerDiscountToDate!=null &&
              this.sellerDiscountToDate.equals(other.getSellerDiscountToDate()))) &&
            this.isSellerPointAmnt == other.isIsSellerPointAmnt() &&
            this.isSellerPointRate == other.isIsSellerPointRate() &&
            this.sellerPointGroupNo == other.getSellerPointGroupNo() &&
            this.buyableQuantity == other.getBuyableQuantity() &&
            this.buyLimitPeriod == other.getBuyLimitPeriod() &&
            ((this.marketPrice==null && other.getMarketPrice()==null) || 
             (this.marketPrice!=null &&
              this.marketPrice.equals(other.getMarketPrice()))) &&
            ((this.placeOfOrigin==null && other.getPlaceOfOrigin()==null) || 
             (this.placeOfOrigin!=null &&
              this.placeOfOrigin.equals(other.getPlaceOfOrigin()))) &&
            ((this.rawMaterialsType==null && other.getRawMaterialsType()==null) || 
             (this.rawMaterialsType!=null &&
              this.rawMaterialsType.equals(other.getRawMaterialsType()))) &&
            ((this.expiry==null && other.getExpiry()==null) || 
             (this.expiry!=null &&
              this.expiry.equals(other.getExpiry()))) &&
            ((this.productionDate==null && other.getProductionDate()==null) || 
             (this.productionDate!=null &&
              this.productionDate.equals(other.getProductionDate()))) &&
            ((this.freeGift==null && other.getFreeGift()==null) || 
             (this.freeGift!=null &&
              this.freeGift.equals(other.getFreeGift()))) &&
            this.sellUnitVolume == other.getSellUnitVolume() &&
            this.sellUnitCode == other.getSellUnitCode() &&
            this.isMultipleSellUnit == other.isIsMultipleSellUnit() &&
            ((this.sellingArea==null && other.getSellingArea()==null) || 
             (this.sellingArea!=null &&
              this.sellingArea.equals(other.getSellingArea()))) &&
            this.isMobile == other.isIsMobile() &&
            this.isMobileOnly == other.isIsMobileOnly() &&
            ((this.mobileDescription==null && other.getMobileDescription()==null) || 
             (this.mobileDescription!=null &&
              this.mobileDescription.equals(other.getMobileDescription()))) &&
            ((this.afterService==null && other.getAfterService()==null) || 
             (this.afterService!=null &&
              this.afterService.equals(other.getAfterService()))) &&
            this.isPCS == other.isIsPCS() &&
            ((this.descriptionVerType==null && other.getDescriptionVerType()==null) || 
             (this.descriptionVerType!=null &&
              this.descriptionVerType.equals(other.getDescriptionVerType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.isVATFree == other.isIsVATFree() &&
            ((this.buyLimitTypeCode==null && other.getBuyLimitTypeCode()==null) || 
             (this.buyLimitTypeCode!=null &&
              this.buyLimitTypeCode.equals(other.getBuyLimitTypeCode()))) &&
            this.ecouponEffectivePeriod == other.getEcouponEffectivePeriod() &&
            this.minBuyQty == other.getMinBuyQty() &&
            ((this.wishKeyword==null && other.getWishKeyword()==null) || 
             (this.wishKeyword!=null &&
              this.wishKeyword.equals(other.getWishKeyword()))) &&
            this.wishKeywordOptIn == other.isWishKeywordOptIn() &&
            this.isC2C == other.isIsC2C() &&
            this.localChain == other.isLocalChain() &&
            ((this.isDonorShopping==null && other.getIsDonorShopping()==null) || 
             (this.isDonorShopping!=null &&
              this.isDonorShopping.equals(other.getIsDonorShopping()))) &&
            ((this.donorShoppingFromDate==null && other.getDonorShoppingFromDate()==null) || 
             (this.donorShoppingFromDate!=null &&
              this.donorShoppingFromDate.equals(other.getDonorShoppingFromDate()))) &&
            ((this.donorShoppingToDate==null && other.getDonorShoppingToDate()==null) || 
             (this.donorShoppingToDate!=null &&
              this.donorShoppingToDate.equals(other.getDonorShoppingToDate()))) &&
            this.isAdult == other.isIsAdult() &&
            this.existRelatedItem == other.isExistRelatedItem() &&
            this.enablePCSCoupon == other.isEnablePCSCoupon() &&
            this.isMarton == other.isIsMarton() &&
            this.isGeneralCallPlan == other.isIsGeneralCallPlan() &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            this.sellFeeType == other.getSellFeeType() &&
            this.enableFreePhoneUrl == other.isEnableFreePhoneUrl() &&
            ((this.freePhoneApplyUrl==null && other.getFreePhoneApplyUrl()==null) || 
             (this.freePhoneApplyUrl!=null &&
              this.freePhoneApplyUrl.equals(other.getFreePhoneApplyUrl()))) &&
            this.isBrandShop == other.isIsBrandShop() &&
            ((this.brandShopCategoryCode==null && other.getBrandShopCategoryCode()==null) || 
             (this.brandShopCategoryCode!=null &&
              this.brandShopCategoryCode.equals(other.getBrandShopCategoryCode()))) &&
            this.isLease == other.isIsLease() &&
            ((this.distrType==null && other.getDistrType()==null) || 
             (this.distrType!=null &&
              this.distrType.equals(other.getDistrType()))) &&
            ((this.barCode==null && other.getBarCode()==null) || 
             (this.barCode!=null &&
              this.barCode.equals(other.getBarCode()))) &&
            this.orderNo == other.getOrderNo();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSeller() != null) {
            _hashCode += getSeller().hashCode();
        }
        if (getShippingFee() != null) {
            _hashCode += getShippingFee().hashCode();
        }
        if (getShippingPlace() != null) {
            _hashCode += getShippingPlace().hashCode();
        }
        if (getShippingFeeAdditional() != null) {
            _hashCode += getShippingFeeAdditional().hashCode();
        }
        if (getItemReturn() != null) {
            _hashCode += getItemReturn().hashCode();
        }
        if (getItemContentsHtml() != null) {
            _hashCode += getItemContentsHtml().hashCode();
        }
        if (getItemAuctionDiscount() != null) {
            _hashCode += getItemAuctionDiscount().hashCode();
        }
        if (getCardDiscount() != null) {
            _hashCode += getCardDiscount().hashCode();
        }
        if (getItemPicture() != null) {
            _hashCode += getItemPicture().hashCode();
        }
        if (getCategoryAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemCategoryAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemCategoryAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemCategoryAttribute(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemExtra() != null) {
            _hashCode += getItemExtra().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getLuxuryGoodsCorner() != null) {
            _hashCode += getLuxuryGoodsCorner().hashCode();
        }
        if (getItemDiscount() != null) {
            _hashCode += getItemDiscount().hashCode();
        }
        if (getTraditionalGoodsCorner() != null) {
            _hashCode += getTraditionalGoodsCorner().hashCode();
        }
        if (getRegionalMarketCorner() != null) {
            _hashCode += getRegionalMarketCorner().hashCode();
        }
        if (getItemFreeExperience() != null) {
            _hashCode += getItemFreeExperience().hashCode();
        }
        if (getItemCallPlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemCallPlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemCallPlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShopCatgProd() != null) {
            _hashCode += getShopCatgProd().hashCode();
        }
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        _hashCode += getBrandCode();
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getUserDefineBrandName() != null) {
            _hashCode += getUserDefineBrandName().hashCode();
        }
        if (getImportNo() != null) {
            _hashCode += getImportNo().hashCode();
        }
        _hashCode += new Long(getCatalogCode()).hashCode();
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        if (getISBN() != null) {
            _hashCode += getISBN().hashCode();
        }
        if (getIsbnCodeAllowYn() != null) {
            _hashCode += getIsbnCodeAllowYn().hashCode();
        }
        if (getItemStatusType() != null) {
            _hashCode += getItemStatusType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAdvertiseMessage() != null) {
            _hashCode += getAdvertiseMessage().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getDiscountPrice() != null) {
            _hashCode += getDiscountPrice().hashCode();
        }
        if (getAuctionDiscount() != null) {
            _hashCode += getAuctionDiscount().hashCode();
        }
        if (getSellerDiscount() != null) {
            _hashCode += getSellerDiscount().hashCode();
        }
        if (getSellerDiscount2() != null) {
            _hashCode += getSellerDiscount2().hashCode();
        }
        if (getSellerDiscountFromDate() != null) {
            _hashCode += getSellerDiscountFromDate().hashCode();
        }
        if (getSellerDiscountToDate() != null) {
            _hashCode += getSellerDiscountToDate().hashCode();
        }
        _hashCode += (isIsSellerPointAmnt() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsSellerPointRate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSellerPointGroupNo();
        _hashCode += getBuyableQuantity();
        _hashCode += getBuyLimitPeriod();
        if (getMarketPrice() != null) {
            _hashCode += getMarketPrice().hashCode();
        }
        if (getPlaceOfOrigin() != null) {
            _hashCode += getPlaceOfOrigin().hashCode();
        }
        if (getRawMaterialsType() != null) {
            _hashCode += getRawMaterialsType().hashCode();
        }
        if (getExpiry() != null) {
            _hashCode += getExpiry().hashCode();
        }
        if (getProductionDate() != null) {
            _hashCode += getProductionDate().hashCode();
        }
        if (getFreeGift() != null) {
            _hashCode += getFreeGift().hashCode();
        }
        _hashCode += getSellUnitVolume();
        _hashCode += getSellUnitCode();
        _hashCode += (isIsMultipleSellUnit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSellingArea() != null) {
            _hashCode += getSellingArea().hashCode();
        }
        _hashCode += (isIsMobile() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsMobileOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMobileDescription() != null) {
            _hashCode += getMobileDescription().hashCode();
        }
        if (getAfterService() != null) {
            _hashCode += getAfterService().hashCode();
        }
        _hashCode += (isIsPCS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescriptionVerType() != null) {
            _hashCode += getDescriptionVerType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isIsVATFree() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBuyLimitTypeCode() != null) {
            _hashCode += getBuyLimitTypeCode().hashCode();
        }
        _hashCode += getEcouponEffectivePeriod();
        _hashCode += getMinBuyQty();
        if (getWishKeyword() != null) {
            _hashCode += getWishKeyword().hashCode();
        }
        _hashCode += (isWishKeywordOptIn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsC2C() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLocalChain() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIsDonorShopping() != null) {
            _hashCode += getIsDonorShopping().hashCode();
        }
        if (getDonorShoppingFromDate() != null) {
            _hashCode += getDonorShoppingFromDate().hashCode();
        }
        if (getDonorShoppingToDate() != null) {
            _hashCode += getDonorShoppingToDate().hashCode();
        }
        _hashCode += (isIsAdult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExistRelatedItem() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnablePCSCoupon() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsMarton() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsGeneralCallPlan() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        _hashCode += getSellFeeType();
        _hashCode += (isEnableFreePhoneUrl() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFreePhoneApplyUrl() != null) {
            _hashCode += getFreePhoneApplyUrl().hashCode();
        }
        _hashCode += (isIsBrandShop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBrandShopCategoryCode() != null) {
            _hashCode += getBrandShopCategoryCode().hashCode();
        }
        _hashCode += (isIsLease() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDistrType() != null) {
            _hashCode += getDistrType().hashCode();
        }
        if (getBarCode() != null) {
            _hashCode += getBarCode().hashCode();
        }
        _hashCode += new Long(getOrderNo()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("userDefineBrandName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UserDefineBrandName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("importNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImportNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("catalogCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CatalogCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("categoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ISBN");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ISBN"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isbnCodeAllowYn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsbnCodeAllowYn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemStatusType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemStatusType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemStatusTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("advertiseMessage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdvertiseMessage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itemCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItemCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("price");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("discountPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DiscountPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("auctionDiscount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AuctionDiscount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerDiscount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerDiscount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerDiscount2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerDiscount2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerDiscountFromDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerDiscountFromDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerDiscountToDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerDiscountToDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isSellerPointAmnt");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsSellerPointAmnt"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isSellerPointRate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsSellerPointRate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellerPointGroupNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellerPointGroupNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyableQuantity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyableQuantity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyLimitPeriod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyLimitPeriod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("marketPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarketPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("placeOfOrigin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PlaceOfOrigin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "OriginTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rawMaterialsType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RawMaterialsType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RawMaterialsType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("expiry");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Expiry"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("productionDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ProductionDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("freeGift");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FreeGift"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellUnitVolume");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellUnitVolume"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellUnitCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellUnitCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMultipleSellUnit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMultipleSellUnit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellingArea");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellingArea"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "AreaCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMobile");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMobile"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMobileOnly");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMobileOnly"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mobileDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MobileDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("afterService");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AfterService"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isPCS");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsPCS"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("descriptionVerType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DescriptionVerType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "VerTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isVATFree");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsVATFree"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("buyLimitTypeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BuyLimitTypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "BuyLimitTypeCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ecouponEffectivePeriod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EcouponEffectivePeriod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minBuyQty");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinBuyQty"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("wishKeyword");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WishKeyword"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("wishKeywordOptIn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WishKeywordOptIn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isC2C");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsC2C"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("localChain");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LocalChain"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isDonorShopping");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsDonorShopping"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("donorShoppingFromDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DonorShoppingFromDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("donorShoppingToDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DonorShoppingToDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isAdult");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsAdult"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("existRelatedItem");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExistRelatedItem"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("enablePCSCoupon");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EnablePCSCoupon"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isMarton");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsMarton"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isGeneralCallPlan");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsGeneralCallPlan"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Unit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unitPrice");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UnitPrice"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sellFeeType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SellFeeType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("enableFreePhoneUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EnableFreePhoneUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("freePhoneApplyUrl");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FreePhoneApplyUrl"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isBrandShop");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsBrandShop"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("brandShopCategoryCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BrandShopCategoryCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isLease");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsLease"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("distrType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DistrType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("barCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BarCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("orderNo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OrderNo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "MemberT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPlace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPlace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingPlaceT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingFeeAdditional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingFeeAdditional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShippingAdditionalT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemReturnT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemContentsHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemContentsHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemContentsHtmlT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAuctionDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemAuctionDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemAuctionDiscountT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CardDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CardDiscountT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPicture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPicture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemPictureT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "CategoryAttrT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategoryAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCategoryAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCategoryAttrT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemExtra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemExtra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemExtraT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "Min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("luxuryGoodsCorner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "LuxuryGoodsCorner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ProdCornerT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemDiscountT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traditionalGoodsCorner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "TraditionalGoodsCorner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "TraditionalCornerT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalMarketCorner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RegionalMarketCorner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "RegionalMarketT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFreeExperience");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemFreeExperienceRequestT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCallPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCallPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ItemCallPlanT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopCatgProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShopCatgProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schema.auction.co.kr/Arche.Service.xsd", "ShopCatgProdT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
