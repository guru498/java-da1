package com.example.complaintsystem.controller;

import com.example.complaints.model.Complaint;
import com.example.complaints.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComplaintController {

    private final ComplaintService complaintService;

    @Autowired
    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @GetMapping("/")
    public String showComplaintForm(Model model) {
        model.addAttribute("complaint", new Complaint());
        return "complaintForm";
    }

    @PostMapping("/submitComplaint")
    public String submitComplaint(@ModelAttribute("complaint") Complaint complaint) {
        complaintService.addComplaint(complaint);
        return "redirect:/complaints"; // Redirect to the list view
    }

    @GetMapping("/complaints")
    public String listComplaints(Model model) {
        model.addAttribute("complaints", complaintService.getAllComplaints());
        return "complaintList";
    }
}
