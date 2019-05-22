package com.example.retrofit;

public class fields {
    private String Notes;
    private String Name;

    public fields(String notes, String name) {
        Notes = notes;
        Name = name;
    }

    public String getNotes() {
        return Notes;
    }

    public String getName() {
        return Name;
    }
}
