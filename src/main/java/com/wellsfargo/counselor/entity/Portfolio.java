package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

public class Portfolio {
    @Id
    @GeneratedValue
    private Long portfolioID; // Missing field for the primary key

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client; // Client referenced as a foreign key

    @Column(nullable = false)
    private String creationDate;

    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
