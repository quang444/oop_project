package com.home_project.oop_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home_project.oop_project.entity.Shipper;
import com.home_project.oop_project.service.ShipperService;

@Controller
@RequestMapping("/admin/shipper")
public class ShipperController {
    private ShipperService shipperService;

    public ShipperController(ShipperService ShipperService) {
        super();
        this.shipperService = ShipperService;
    }

    // handler method to handle list Shippers and return mode and view
    @GetMapping(value={"","/"})
    public String listShippers(Model model) {
        model.addAttribute("shippers", shipperService.getAllShippers());
        return "admin/adminShipper";
    }

    @GetMapping("/new")
    public String createShipperForm(Model model) {

        // create Shipper object to hold Shipper form data
        Shipper shipper = new Shipper();
        model.addAttribute("shipper", shipper);
        return "admin/addShipper";

    }

    @PostMapping("/add")
    public String saveShipper(@ModelAttribute("shipper") Shipper shipper) {
        shipperService.saveShipper(shipper);
        return "redirect:/admin/shipper";
    }

    @GetMapping("/edit/{id}")
    public String editShipperForm(@PathVariable Long id, Model model) {
        model.addAttribute("shipper", shipperService.getShipperById(id));
        return "admin/editShipper";
    }

    @PostMapping("/update/{id}")
    public String updateShipper(@PathVariable Long id,
                              @ModelAttribute("shipper") Shipper shipper,
                              Model model) {

        // get Shipper from database by id
        Shipper existingShipper = shipperService.getShipperById(id);
        existingShipper.setId(id);
        existingShipper.setName(shipper.getName());
        existingShipper.setPassword(shipper.getPassword());
        existingShipper.setNgaySinh(shipper.getNgaySinh());
        existingShipper.setDiaChi(shipper.getDiaChi());
        existingShipper.setEmail(shipper.getEmail());
        existingShipper.setSdt(shipper.getSdt());
        existingShipper.setCccd(shipper.getCccd());
        // save updated Shipper object
        shipperService.updateShipper(existingShipper);
        return "redirect:/admin/shipper";
    }

    // handler method to handle delete Shipper request

    @GetMapping("delete/{id}")
    public String deleteShipper(@PathVariable Long id) {
        shipperService.deleteShipperById(id);
        return "redirect:/admin/shipper";
    }
}
