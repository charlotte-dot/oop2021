package com.company;

public enum Country {
    POLAND("Polish", "PL",5000654000.0), ITALY("Italian","IT",80000000.0),
    SPAIN("Spanish","ES", 45102154151541.0), ENGLAND("English", "UK",45152102154.0),
    GERMANY("German", "DE",44411551154.0);


    private String language;
    private String code;
    private double gdpInUsd;


    Country(String language, String code, double gdpInUsd) {
        this.language = language;
        this.code = code;
        this.gdpInUsd = gdpInUsd;
    }

    public String getLanguage() {
        return language;
    }

    public String getCode() {
        return code;
    }

    public double getGdpInUsd() {
        return gdpInUsd;
    }

    public double getGdpInPln(){
        return this.getGdpInUsd()*4.00;
    }
}
