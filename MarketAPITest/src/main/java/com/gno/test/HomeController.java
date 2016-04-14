package com.gno.test;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT;
import kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT;
import kr.co.auction.schema.Arche_Service_xsd.MemberTicketT;
import kr.co.auction.www.APIv1.ShoppingService.ShoppingService;
import kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoapStub;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		
		try {
			ShoppingServiceSoapStub stub = new ShoppingServiceSoapStub();
			
			String ticket = "d7IcSI6vU7BfWel0zX+rS+gPjfbDwa5iohcCrVVjxpOWWTSZRytzXwlvUw//6Vn6g/FsC1kUyL1cQvgMdEMcfC9kurUcHnmdADYI0cnQgHKooVX0AMc+lG2DBUIHVZ0aEXP2FiNJc2w2b2YzMVZ/nZeyUC2IqAz33RkMvE1pB6Flj+OtiyAmQum2NwfBT89pSIzwMAY9fLrBkgRIxc79ueI=";			
			MemberTicketT memberTicket = new MemberTicketT(ticket);
			
			String itemID = "B319027702";
			
			int version = 1;
			
			boolean excludeMartOnItem = true;
			
			ViewItemRequestT req = new ViewItemRequestT(memberTicket, itemID, version, excludeMartOnItem);
			
			
			
			ViewItemResponseT res = stub.viewItem(req);
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return "home";
	}
	
}
