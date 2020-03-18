package com.example.ERP_IT_Comany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String rang;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;
    @OneToMany(mappedBy = "assignee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Ticket> tickets_assignee;
    @OneToMany(mappedBy = "reporter", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Ticket> tickets_reporters;

    public List<Ticket> getTickets_assignee() {
        return tickets_assignee;
    }

    public void setTickets_assignee(List<Ticket> tickets_assignee) {
        this.tickets_assignee = tickets_assignee;
    }

    public List<Ticket> getTickets_reporters() {
        return tickets_reporters;
    }

    public void setTickets_reporters(List<Ticket> tickets_reporters) {
        this.tickets_reporters = tickets_reporters;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
