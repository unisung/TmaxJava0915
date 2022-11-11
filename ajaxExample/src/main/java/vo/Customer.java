package vo;

public class Customer {
private String customerid;
private String companyName;
private String contactName;
private String address;
private String city;
private String postcode;
private String country;



public Customer() {}

public Customer(String customerid, String companyName, String contactName, String address, String city, String postcode,
		String country) {
	this.customerid = customerid;
	this.companyName = companyName;
	this.contactName = contactName;
	this.address = address;
	this.city = city;
	this.postcode = postcode;
	this.country = country;
}


public String getCustomerid() {
	return customerid;
}
public void setCustomerid(String customerid) {
	this.customerid = customerid;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getContactName() {
	return contactName;
}
public void setContactName(String contactName) {
	this.contactName = contactName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPostcode() {
	return postcode;
}
public void setPostcode(String postcode) {
	this.postcode = postcode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}



}
