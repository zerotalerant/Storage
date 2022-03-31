package com.company;

public class Coach {
    private Long id;
    private String sportType;
    private Long idSalary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public Long getIdSalary() {
        return idSalary;
    }

    public void setIdSalary(Long idSalary) {
        this.idSalary = idSalary;
    }

    @Override
    public String toString() {
        return "Coach{" +
               "id=" + id +
               ", sportType='" + sportType + '\'' +
               ", idSalary='" + idSalary + '\'' +
               '}';
    }
}
