package test;

import org.junit.Test;

import com.amazonservices.mws.sellers.MarketplaceWebServiceSellersClient;
import com.amazonservices.mws.sellers.model.GetServiceStatusRequest;
import com.amazonservices.mws.sellers.samples.GetServiceStatusSample;
import com.amazonservices.mws.sellers.samples.MarketplaceWebServiceSellersSampleConfig;

public class AmazonAddTest {

	@Test
	public void add() {
		MarketplaceWebServiceSellersClient client = MarketplaceWebServiceSellersSampleConfig.getClient();

		// Create a request.
		GetServiceStatusRequest request = new GetServiceStatusRequest();
		String sellerId = "example";
		request.setSellerId(sellerId);
		String mwsAuthToken = "example";
		request.setMWSAuthToken(mwsAuthToken);

		// Make the call.
		GetServiceStatusSample.invokeGetServiceStatus(client, request);
	}

}
