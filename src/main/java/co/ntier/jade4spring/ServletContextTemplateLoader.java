package co.ntier.jade4spring;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import de.neuland.jade4j.template.TemplateLoader;

public class ServletContextTemplateLoader implements TemplateLoader{

	private ServletContext context;
	private String prefix, suffix;

	@Inject
	public ServletContextTemplateLoader(ServletContext context){
		this(context, "", "");
	}
	
	public ServletContextTemplateLoader(ServletContext context, String prefix, String suffix) {
		super();
		if(context == null){
			throw new NullPointerException("Parameter 'ServletContext' cannot be null");
		}
		this.context = context;
		this.prefix = prefix == null ? "" : prefix;
		this.suffix = suffix == null ? "" : suffix;
	}

	public long getLastModified(String name) throws IOException {
		return 0; // TODO should do this
	}

	public Reader getReader(String name) throws IOException {
		InputStream stream = context.getResourceAsStream(prefix + name + suffix);
		return new InputStreamReader(stream);
	}

	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
}
