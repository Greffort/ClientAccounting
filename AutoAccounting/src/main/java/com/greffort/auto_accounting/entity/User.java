package com.greffort.auto_accounting.entity;

import com.greffort.auto_accounting.model.Client;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User {

    @Column(name = "UNAME")
    private String name;

    @Id
    @Column(name = "IDUSER")
    private String uuid;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Client> clients;


}
