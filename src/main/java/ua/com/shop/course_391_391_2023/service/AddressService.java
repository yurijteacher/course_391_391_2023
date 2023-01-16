package ua.com.shop.course_391_391_2023.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.shop.course_391_391_2023.entity.Address;
import ua.com.shop.course_391_391_2023.entity.Clients;
import ua.com.shop.course_391_391_2023.repository.AddressRepository;

import java.util.List;

@Service
public class AddressService
{


    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getListAddress(Clients clients){
        return addressRepository.findAllByClientts(clients);
    }
}
