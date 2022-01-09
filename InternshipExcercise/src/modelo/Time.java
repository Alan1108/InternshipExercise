/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alan Bermudez
 */
public class Time {
    private String time;
    private String day;
    private int hour;
    private int minute;

    public Time( int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time(String time) {
        this.time = time;
        this.day = time.substring(0,2);
        String aux[] = time.split(":");
        this.hour = Integer.parseInt(aux[0].substring(2));
        this.minute = Integer.parseInt(aux[1]);
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Time:" + "\ntime: " + time + ",\nday: " + day + ",\nhour: " + hour + ",\nminute:" + minute;
    }
    
    
    
}
