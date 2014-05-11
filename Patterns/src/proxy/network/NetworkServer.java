package proxy.network;

public class NetworkServer implements INetwork {

	class Network {
		public void doConnect(String source, String dest) throws Exception {
			// Do network connection
		}
	}

	private Network network = new Network();

	public NetworkServer() {
	}

	@Override
	public void connect(String source, String dest) throws Exception {
		network.doConnect(source, dest);
	}

}
