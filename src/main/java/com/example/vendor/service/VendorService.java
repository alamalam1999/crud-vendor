package com.example.vendor.service;

import com.example.vendor.entities.Vendor;

import java.util.List;

public interface VendorService {
    Vendor saveVendor(Vendor vendor);
    Vendor updateVendor(Vendor vendor);
    void deleteVendor(Vendor vendor);
    Vendor getVendorById(int id);
    List<Vendor> getAllVendor();
}
