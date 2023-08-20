package com.restapi.services;

import com.restapi.model.CloudVendor;
import com.restapi.repository.CloudVendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    @Autowired
    private CloudVendorRepo cloudVendorRepo;


    @Override
    public Optional<CloudVendor> getCloudVendorById(String vendorId) {
        return cloudVendorRepo.findById(vendorId);
    }

    @Override
    public CloudVendor addNewCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorRepo.save(cloudVendor);
    }

    @Override
    public CloudVendor changeCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorRepo.save(cloudVendor);
    }

    @Override
    public Optional<CloudVendor> removeCloudVendor(String vendorId) {
        Optional<CloudVendor> cv = cloudVendorRepo.findById(vendorId);
        cloudVendorRepo.deleteById(vendorId);
       return cv;
    }
}
