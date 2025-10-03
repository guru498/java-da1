package com.example.complaints.service;

import com.example.complaints.model.Complaint;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComplaintService {

    private final List<Complaint> complaints = new ArrayList<>();

    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
        System.out.println("Complaint added: " + complaint);
    }

    public List<Complaint> getAllComplaints() {
        return new ArrayList<>(complaints);
    }
}
