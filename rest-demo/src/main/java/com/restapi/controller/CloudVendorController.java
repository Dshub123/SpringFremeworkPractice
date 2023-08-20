package com.restapi.controller;

import com.restapi.model.CloudVendor;
import com.restapi.services.CloudVendorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    @GetMapping("vendors/{vendorId}")
    @ApiOperation(value = "cloud vendor id",notes = "provide cloud vendor details",response = Optional.class)
    public Optional<CloudVendor> getCloudVendorDetails(@PathVariable String vendorId){
        System.out.println(vendorId);
        return cloudVendorService.getCloudVendorById(vendorId);
    }

    @PostMapping("vendors/newvendor")
    public CloudVendor createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        return cloudVendorService.addNewCloudVendor(cloudVendor);
    }

    @PutMapping("vendors/updatevendor")
    public CloudVendor updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        return cloudVendorService.changeCloudVendor(cloudVendor);
    }

    @DeleteMapping("vendors/{vendorId}")
    public Optional<CloudVendor> deleteCloudVendorDetails(@PathVariable String vendorId)
    {
        return cloudVendorService.removeCloudVendor(vendorId);
    }

}
