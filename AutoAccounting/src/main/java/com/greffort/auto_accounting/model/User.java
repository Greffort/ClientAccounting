package com.greffort.auto_accounting.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Log4j
public class User {
    private static final String FILL_DEFAULT = "not specified";
    private static final List<Client> FILL_DEFAULT_CLIENT = new ArrayList<>();

    private String name;
    private String password;
    private List<Client> clients;
    private UUID uuid;

    //public User() {
    //    this(FILL_DEFAULT, FILL_DEFAULT);
    //}

    public User(String name, String password) {
        this(FILL_DEFAULT, FILL_DEFAULT, FILL_DEFAULT_CLIENT, UUID.randomUUID());
    }

    public User(String name, String password, List<Client> clients, UUID uuid) {
        this.name = name;
        this.password = password;
        this.clients = clients;
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(uuid, user.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, uuid);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}

