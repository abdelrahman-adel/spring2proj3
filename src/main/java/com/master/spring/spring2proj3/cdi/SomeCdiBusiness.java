package com.master.spring.spring2proj3.cdi;

import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {

	private SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}
