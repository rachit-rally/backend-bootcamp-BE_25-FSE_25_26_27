package com.optum.providers.search.models;

import java.util.*;

public class Provider {

	private int id;
	private String name;
	private String providerType;
	private String speciality;
	private Address address;
    private String phone;
    private Collection<String> labels;
	
	public Provider(int id, String name, String providerType , Address address, String phone, List<String> labels, String speciality) {
		this.id = id;
		this.name = name;
		this.providerType = providerType;
		this.address = address;
		this.phone = phone;
		this.labels = labels;
		this.speciality= speciality;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProviderType() {
		return providerType;
	}
	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Collection<String> getLabels() {
        return labels;
    }
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
	
}
