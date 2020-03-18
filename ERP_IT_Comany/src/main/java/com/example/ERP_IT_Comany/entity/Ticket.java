package com.example.ERP_IT_Comany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ticketName;
    private String description;
    private String priority;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_id")
    private Employer assignee;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "reporter_id")
    private Employer reporter;

    public Employer getAssignee() {
        return assignee;
    }

    public Employer getReporter() {
        return reporter;
    }

    public void setReporter(Employer reporter) {
        this.reporter = reporter;
    }

    public void setAssignee(Employer assignee) {
        this.assignee = assignee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }
}
