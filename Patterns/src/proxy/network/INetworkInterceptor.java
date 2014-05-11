package proxy.network;

import java.util.Map;

public interface INetworkInterceptor {

	void intercept(String source, String dest, Map<Object, Object> context) throws Exception;

	int order();

}
