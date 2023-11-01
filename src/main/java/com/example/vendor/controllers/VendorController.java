package com.example.vendor.controllers;

import com.example.vendor.entities.Vendor;
import com.example.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VendorController {

    @Autowired
    VendorService service;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createVendor";
    }

    @RequestMapping("saveVendor")
    public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
        Vendor vendorSaved = service.saveVendor(vendor);
        String msg = "Vendor saved with id : "+ vendorSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createVendor";
    }

    @RequestMapping("/displayVendors")
    public String displayVendor(ModelMap modelMap) {
        List<Vendor> vendors = service.getAllVendor();
        modelMap.addAttribute("vendors",vendors);
        return "displayVendors";
    }

    @RequestMapping("/deleteVendor")
    public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
        Vendor vendor = new Vendor();
        vendor.setId(id);
        service.deleteVendor(vendor);
        List<Vendor> vendors = service.getAllVendor();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendors";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
        Vendor vendor = service.getVendorById(id);
        modelMap.addAttribute("vendor",vendor);
        return "updateVendor";
    }

    @RequestMapping("/updateVendor")
    public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
        service.updateVendor(vendor);
        List<Vendor> vendors = service.getAllVendor();
        modelMap.addAttribute("vendors",vendors);
        return "displayVendors";
    }


}
