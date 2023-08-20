package com.restapi.controller;

import com.restapi.model.CloudVendor;
import com.restapi.services.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    @GetMapping("vendor/{vendorId}")
    public Optional<CloudVendor> getCloudVendorDetails(@PathVariable String vendorId){
        System.out.println(vendorId);
        return cloudVendorService.getCloudVendorById(vendorId);
    }

    @PostMapping("/newvendor")
    public CloudVendor createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        return cloudVendorService.addNewCloudVendor(cloudVendor);
    }

    @PutMapping("/updatevendor")
    public CloudVendor updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        return cloudVendorService.changeCloudVendor(cloudVendor);
    }

    @DeleteMapping("deletevendor/{vendorId}")
    public Optional<CloudVendor> deleteCloudVendorDetails(@PathVariable String vendorId)
    {
        return cloudVendorService.removeCloudVendor(vendorId);
    }

}
