package egovframework.sample.egov_common;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

public class EgovMessageSource extends ReloadableResourceBundleMessageSource implements MessageSource {
	
	private ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource;

	public ReloadableResourceBundleMessageSource getReloadableResourceBundleMessageSource() {
		return reloadableResourceBundleMessageSource;
	}

	public void setReloadableResourceBundleMessageSource(ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource) {
		this.reloadableResourceBundleMessageSource = reloadableResourceBundleMessageSource;
	}
	
	public String getMessage(String code) {
		return getMessage(code, null);
	}
	
	public String getMessage(String code, Object[] args) {
		return getReloadableResourceBundleMessageSource().getMessage(code, args, Locale.getDefault());
	}
	
	
	public Map<String, String> getAllMessages() {
		Map<String, String> messageMap = new HashMap<>();
		Set<String> basenameSet = getReloadableResourceBundleMessageSource().getBasenameSet();
		
		basenameSet.forEach(basename -> {
			calculateFilenamesForLocale(basename, Locale.getDefault()).forEach(fileName -> {
				Properties property = getProperties(fileName).getProperties();
				if(property != null) {
					property.keySet().forEach(keySet -> {
						String key = keySet.toString();
						String value = property.getProperty(key);
						messageMap.put(key, value);
					});
				}
			});
		});
		
		return messageMap;
	}

}
