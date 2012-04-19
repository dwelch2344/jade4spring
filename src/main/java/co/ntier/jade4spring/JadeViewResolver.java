package co.ntier.jade4spring;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import de.neuland.jade4j.JadeConfiguration;


public class JadeViewResolver implements ViewResolver{

	private JadeConfiguration config;

	@Inject
	public JadeViewResolver(JadeConfiguration config) {
		super();
		this.config = config;
	}
	
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		return new JadeView(viewName, config);
	}

}
