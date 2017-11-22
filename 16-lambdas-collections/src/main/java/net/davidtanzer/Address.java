package net.davidtanzer;

public class Address {

	private final String street;
	private final String streetNo;

	public Address(String street, String streetNo) {
		this.street = street;
		this.streetNo = streetNo;
	}

	public String getStreet() {
		return street;
	}
	public String getStreetNo() {
		return streetNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((streetNo == null) ? 0 : streetNo.hashCode());
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
		Address other = (Address) obj;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (streetNo == null) {
			if (other.streetNo != null)
				return false;
		} else if (!streetNo.equals(other.streetNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", streetNo=" + streetNo + "]";
	}
	
}
