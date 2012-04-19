An example XML configuration:
=============================
	<bean class="co.ntier.jade4spring.JadeViewResolver">
		<constructor-arg ref="jadeConfig" />
	</bean>
	
	<bean id="jadeConfig" class="de.neuland.jade4j.JadeConfiguration">
		<property name="templateLoader" ref="templateLoader"/>
		<property name="prettyPrint" value="true"/>
	</bean>
	
	<bean id="templateLoader" class="co.ntier.jade4spring.ServletContextTemplateLoader">
		<property name="prefix" value="/WEB-INF/views/" />
		<property name="suffix" value=".jade" />
	</bean>