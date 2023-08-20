package com.restapi.services;

import com.restapi.model.CloudVendor;

import java.util.Optional;

public interface CloudVendorService {

    Optional<CloudVendor> getCloudVendorById(String vendorId);

    CloudVendor addNewCloudVendor(CloudVendor cloudVendor);

    CloudVendor changeCloudVendor(CloudVendor cloudVendor);

    Optional<CloudVendor> removeCloudVendor(String vendorId);
}
