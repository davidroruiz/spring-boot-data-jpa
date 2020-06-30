/**
 * 
 */
package com.pruebaSpring.springbootweb.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author ITenZangetsuB
 *
 */
@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties")
	
})
public class TextosPropertiesConfig {

}
