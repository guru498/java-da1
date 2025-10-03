package com.example.complaints.web;

import com.example.complaints.model.Complaint;
import com.example.complaints.service.ComplaintService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComplaintController {

    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @GetMapping({"/","/complaints"})
    public String listComplaints(Model model) {
        model.addAttribute("complaints", complaintService.getAllComplaints());
        return "complaints/list";
    }

    @GetMapping("/complaints/new")
    public String newComplaintForm(Model model) {
        model.addAttribute("complaint", new Complaint());
        return "complaints/new";
    }

    @PostMapping("/complaints")
    public String createComplaint(@ModelAttribute Complaint complaint) {
        complaintService.addComplaint(complaint);
        return "redirect:/complaints";
    }
}
