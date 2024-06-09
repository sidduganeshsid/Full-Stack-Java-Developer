package in.currency;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceConfiguration{
	private String url;
	private String username;
	private String key;

		public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
			this.url = url;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public void setKey(String key) {
			this.key = key;
		}
	public String getUsername() {
		return username;
	}
	public String getKey() {
		return key;
	}
//		public CurrencyServiceConfiguration(String url, String username, String key) {
//		super();
//		this.url = url;
//		this.username = username;
//		this.key = key;
//	}
//		@Override
//	public String toString() {
//		return "CurrencyServiceConfiguration [url=" + url + ", username=" + username + ", key=" + key + "]";
//	}
	
}