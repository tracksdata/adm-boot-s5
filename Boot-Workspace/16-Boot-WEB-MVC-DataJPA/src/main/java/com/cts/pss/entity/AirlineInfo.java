package com.cts.pss.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class AirlineInfo {

	@Id
	@GeneratedValue
	private int airlineId;
	private String airlineName;
	private String airlineLogo;

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getAirlineLogo() {
		return airlineLogo;
	}

	public void setAirlineLogo(String airlineLogo) {
		this.airlineLogo = airlineLogo;
	}

	@Override
	public String toString() {
		return "AirlineInfo [airlineId=" + airlineId + ", airlineName=" + airlineName + ", airlineLogo=" + airlineLogo
				+ "]";
	}
	
	

}
