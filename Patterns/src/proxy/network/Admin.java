package proxy.network;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Admin {

	List<String> allowedIps = new ArrayList<String>();
	List<String> restrictedIps = new ArrayList<String>();

	public Admin() {
	}

	public void addAllowedIp(String ip) {
		allowedIps.add(ip);
	}

	public void addRestrictedIp(String ip) {
		restrictedIps.add(ip);
	}

	public static void main(String[] args) throws Exception {

		final Admin admin = new Admin();
		NetworkManager networkManager = new NetworkManager(new NetworkServer());
		//

		INetworkInterceptor logger = new INetworkInterceptor() {
			@Override
			public int order() {
				return 1;
			}

			@Override
			public void intercept(String source, String dest, Map<Object, Object> context) throws Exception {
				System.out.println("Ip [" + source + "] Connecting to [" + dest + "] ...");
			}
		};

		INetworkInterceptor authenticator = new INetworkInterceptor() {
			@Override
			public int order() {
				return 0;
			}

			@Override
			public void intercept(String source, String dest, Map<Object, Object> context) throws Exception {
				if (!admin.allowedIps.contains(source) || admin.restrictedIps.contains(dest)) {
					throw new Exception("[" + source + "] is not allowed to connect to [" + dest + "] !");
				}
				System.out.println("It's ok dude, welcome !");
			}
		};
		String myIp = "192.168.1.223";
		// Admin
		networkManager.addInterceptor(authenticator);
		networkManager.addInterceptor(logger);
		//
		admin.addAllowedIp(myIp);
		admin.addRestrictedIp("www.twitter.com");
		// Client
		networkManager.connect(myIp, "www.twitter.com");
	}
}
