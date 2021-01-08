package com.training.model;


public class Tour {
	
	private int tourId;
	private String tourName;
	private double duration;
	private double cost;
	public Tour() {
		
	}
	public Tour(int tourId, String tourName, double duration, double cost) {
		super();
		this.tourId = tourId;
		this.tourName = tourName;
		this.duration = duration;
		this.cost = cost;
	}
	public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(duration);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tourId;
		result = prime * result + ((tourName == null) ? 0 : tourName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (Double.doubleToLongBits(duration) != Double.doubleToLongBits(other.duration))
			return false;
		if (tourId != other.tourId)
			return false;
		if (tourName == null) {
			if (other.tourName != null)
				return false;
		} else if (!tourName.equals(other.tourName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tour [tourId=" + tourId + ", tourName=" + tourName + ", duration=" + duration + ", cost=" + cost + "]";
	}
	
	

}
