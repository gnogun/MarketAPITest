package com.gno.test;

import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemRequestT;
import kr.co.auction.schema.Arche_Itempage3_Service_xsd.ViewItemResponseT;
import kr.co.auction.schema.Arche_Service_xsd.MemberTicketT;
import kr.co.auction.www.APIv1.ShoppingService.ShoppingService;
import kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceLocator;
import kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoap;
import kr.co.auction.www.APIv1.ShoppingService.ShoppingServiceSoapStub;

import org.apache.axis.AxisFault;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@WebAppConfiguration
public class SoapTest {
	@Test
	public void testt() {
		try {

			ShoppingService service = new ShoppingServiceLocator();
			ShoppingServiceSoap serviceSoap = service.getShoppingServiceSoap();

			String ticket = "d7IcSI6vU7BfWel0zX+rS+gPjfbDwa5iohcCrVVjxpOWWTSZRytzXwlvUw//6Vn6g/FsC1kUyL1cQvgMdEMcfC9kurUcHnmdADYI0cnQgHKooVX0AMc+lG2DBUIHVZ0aEXP2FiNJc2w2b2YzMVZ/nZeyUC2IqAz33RkMvE1pB6Flj+OtiyAmQum2NwfBT89pSIzwMAY9fLrBkgRIxc79ueI=";
			MemberTicketT memberTicket = new MemberTicketT();

			String itemID = "B319027702";

			int version = 1;

			boolean excludeMartOnItem = false;

			ViewItemRequestT req = new ViewItemRequestT(memberTicket, itemID,
					version, excludeMartOnItem);

			ViewItemResponseT res = serviceSoap.viewItem(req);
			System.out.println("!");

		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
