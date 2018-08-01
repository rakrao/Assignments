//Program about advanced collection
package com.advancedcollection;

public class Parked_CarOwner_Details {

	private String ownerName;
	private int carModel; // instance member
	private String carNo;
	private long ownerMobileNo;
	private String ownerAddress;

	public Parked_CarOwner_Details(String ownerName, int carModel, String carNo, long ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName; // constructor
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) { // getter and setter
		this.ownerName = ownerName;
	}

	public int getCarModel() {
		return carModel;
	}

	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo // to
																													// string
																													// method
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}

	public boolean FindByCarNo(String string) {
		
		return true;
	}

}
