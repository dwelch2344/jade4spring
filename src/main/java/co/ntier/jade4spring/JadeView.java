package co.ntier.jade4spring;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

import de.neuland.jade4j.JadeConfiguration;
import de.neuland.jade4j.template.JadeTemplate;

public class JadeView extends AbstractView{

	private String viewName;
	private JadeConfiguration config;

	public JadeView(String viewName, JadeConfiguration config) {
		this.viewName = viewName;
		this.config = config;
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		JadeTemplate template = config.getTemplate(viewName);
		
		
		String html = config.renderTemplate(template, model);
		response.setContentType("text/html");
		response.getWriter().write(html);
	}
	
	

	
}
