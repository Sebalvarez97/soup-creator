package com.sitrack.soupcreator;


import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperOrikaConfig extends ConfigurableMapper {

    protected void configure(MapperFactory factory) {
    }


}
