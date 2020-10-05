package com.company.dataTypes;

import java.util.Objects;

public class Intern {

    private String name;
    private int age;
    private String stream;

    public Intern(String name, int age, String stream) {
        this.name = name;
        this.age = age;
        this.stream = stream;
    }

    public Intern(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intern intern = (Intern) o;
        return age == intern.age &&
                Objects.equals(stream, intern.stream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, stream);
    }
}
