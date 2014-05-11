package proxy.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkManager implements INetwork {

	private List<INetworkInterceptor> interceptors = new ArrayList<>();
	private Map<Object, Object> context = new HashMap<>();
	private NetworkServer server;
	private Sorter sorter;

	class Sorter implements Comparator<INetworkInterceptor> {
		@Override
		public int compare(INetworkInterceptor o1, INetworkInterceptor o2) {
			return o1.order() - o2.order();
		}
	}

	public NetworkManager(NetworkServer server) {
		this.server = server;
		this.sorter = new Sorter();
	}

	@Override
	public void connect(String source, String dest) throws Exception {
		for (INetworkInterceptor ic : interceptors) {
			ic.intercept(source, dest, context);
		}
		server.connect(source, dest);
	}

	public void addInterceptor(INetworkInterceptor interceptor) {
		interceptors.add(interceptor);
		Collections.sort(interceptors, sorter);
	}

}
