package com.company.commons;

import com.company.commons.config.CoreDefaultConfig;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@ComponentScan(
        basePackages = "com.company.commons",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
@Import({
        CoreDefaultConfig.class
})
@AutoConfigurationPackage
public class CommonsAutoConfiguration {
}
