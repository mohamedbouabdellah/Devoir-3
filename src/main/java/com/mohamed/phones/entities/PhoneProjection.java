package com.mohamed.phones.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomPhone", types = { Phone.class })
public interface PhoneProjection {
	public String getNomPhone();

}
