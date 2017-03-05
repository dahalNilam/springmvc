package com.nilam.service;

import java.util.List;

import com.nilam.domain.Address;

public interface AddressService {

	public void save(Address address);
	public Address getAddressById(long id);
	public List<Address> getAllAddresses();
	public void update(Address address);
	public void delete(Address address);
	public void delete(long id);

}
