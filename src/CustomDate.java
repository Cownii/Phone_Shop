
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class CustomDate {
    private int day, month, year;
    
    public CustomDate(){
        LocalDate ld = LocalDate.now();
        this.day = ld.getDayOfMonth();
        this.month = ld.getMonthValue();
        this.year = ld.getYear();
    }

    public CustomDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean isLeapYear(){
        if(this.year%400 == 0)
            return true;
        if(this.year%4 == 0)
            return true;
        return false;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
