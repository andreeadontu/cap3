package com.company;

public class HeartRate {
    private String fName;
    private String lName;
    private int bDay, bMonth, bYear;

    public HeartRate(String fName, String lName, int bDay, int bMonth, int bYear){
        setFirstName(fName);
        setLastName(lName);
        setDay(bDay);
        setMonth(bMonth);
        setYear(bYear);
    }
    public void setFirstName(String fName){
        this.fName = fName;
    }
    public void setLastName(String lName){
        this.lName = lName;
    }
    public void setDay(int bDay){
        this.bDay = bDay;
    }
    public void setMonth(int bMonth){
        this.bMonth = bMonth;
    }
    public void setYear(int bYear){
        this.bYear = bYear;
    }
    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    // return person's dob
    public String getDOB(){
        return String.format("%d/%d/%d", bDay, bMonth, bYear);
    }
    public int getAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - bYear;
    }
    public int getMaxHeartRate(){
        // max heartrate in bpm = 220 - age in years.
        return 220 - getAge();
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
}