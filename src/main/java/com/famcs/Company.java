package com.famcs;

import sun.plugin.com.event.COMEventHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Company {

    private String name;
    private String shortName;
    private Date actualizationDate;
    private String address;
    private Date foundationDate;
    private int employeeNumber;
    private String auditor;
    private String phoneNumber;
    private String email;
    private String branch;
    private String activityType;
    private String webSite;

    Company (String name, String shortName, Date actualizationDate,
             String address, Date foundationDate, int employeeNumber,
             String auditor,String phoneNumber, String email, String branch,
             String activityType, String webSite)                             {

        this.name = name;
        this.shortName = shortName;
        this.actualizationDate = actualizationDate;
        this.address = address;
        this.foundationDate = foundationDate;
        this.employeeNumber = employeeNumber;
        this.auditor = auditor;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.branch = branch;
        this.activityType = activityType;
        this.webSite = webSite;

    }

    Company(String[] aData) throws ParseException, IllegalArgumentException {
        this(   aData[0],
                aData[1],
                dateFormat.parse(aData[2]),
                aData[3],
                dateFormat.parse(aData[4]),
                Integer.parseInt(aData[5]),
                aData[6], aData[7],
                aData[8],
                aData[9],
                aData[10],
                aData[11]   );

        if (aData.length != 12) {
            throw new IllegalArgumentException("Error: wrong number of fields in the argument");
        }

    }

    @Override
    public String toString() {
        return name + ";" + shortName + ";" + actualizationDate.toString() + ";"
                + address + ";" + foundationDate.toString() + ";" + employeeNumber + ";"
                + auditor + ";" + phoneNumber + ";" + email + ";" + branch + ";" + activityType + ";"
                + webSite + ";";
    }

    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setShortName(String shortName) {
        this.shortName = shortName;
    }

    String getShortName() {
        return shortName;
    }

    void setActualizationDate(Date actualizationDate) {
        this.actualizationDate = actualizationDate;
    }

    Date getActualizationDate() {
        return actualizationDate;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    Date getFoundationDate() {
        return foundationDate;
    }

    void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    int getEmployeeNumber() {
        return employeeNumber;
    }

    void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    String getAuditor() {
        return auditor;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getEmail() {
        return email;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }

    String getBranch() {
        return branch;
    }

    void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    String getActivityType() {
        return activityType;
    }

    void setWebSite (String webSite) {
        this.webSite = webSite;
    }

    String getWebSite() {
        return webSite;
    }

}
