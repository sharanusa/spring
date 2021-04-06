package com.xworkz.fooddelivary.entity;

import com.xworkz.fooddelivary.constants.VendorType;

public class HotelVendorEntity {

	private String name;
	private String location;
	private int rating;
	private long phoneNo;
	private VendorType type;
	private String Adress;
	private String Email;

	public HotelVendorEntity() {
		System.out.println("created  " + this.getClass().getName());
	}

	public HotelVendorEntity(String name, String location, int rating, long phoneNo, VendorType type, String adress,
			String email) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.phoneNo = phoneNo;
		this.type = type;
		Adress = adress;
		Email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Adress == null) ? 0 : Adress.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
		result = prime * result + rating;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		HotelVendorEntity other = (HotelVendorEntity) obj;
		if (Adress == null) {
			if (other.Adress != null)
				return false;
		} else if (!Adress.equals(other.Adress))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		if (rating != other.rating)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public VendorType getType() {
		return type;
	}

	public void setType(VendorType type) {
		this.type = type;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "HotelVendor [name=" + name + ", location=" + location + ", rating=" + rating + ", phoneNo=" + phoneNo
				+ ", type=" + type + ", Adress=" + Adress + ", Email=" + Email + "]";
	}

}
