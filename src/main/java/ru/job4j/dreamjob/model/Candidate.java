package ru.job4j.dreamjob.model;

import java.util.Objects;

public class Candidate {

    private int id;

    private String name;

    private String memo;

    public Candidate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Candidate(String name, String memo) {
        this.name = name;
        this.memo = memo;
    }

    public Candidate(int id, String name, String memo) {
        this.id = id;
        this.name = name;
        this.memo = memo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Candidate candidate = (Candidate) o;
        return id == candidate.id && Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}