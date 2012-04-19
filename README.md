About
=====
I really like [jade](https://github.com/visionmedia/jade#readme), and finally some awesome guys made [jade4j](https://github.com/neuland/jade4j) to use Jade w/ Java. I just came across the project and wanted to use it, so I created a thin wrapper around it for use with Spring MVC.   

An example of the Spring XML configuration:
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
	
Getting the Source
==================

Similar to the jade4j project, just clone...

	git@github.com:dwelch2344/jade4spring.git

... and build with maven...

	cd jade4spring
	mvn install

... and add it as a dependency...

	<dependency>
		<groupId>co.ntier</groupId>
		<artifactId>jade4spring</artifactId>
		<version>1.0.0</version>
	</dependency>
	
... or use the co.ntier.jade4spring-1.x.x.jar