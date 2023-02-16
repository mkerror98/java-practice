package ch7_oop2;

public class TimeTest {
    public static void main(String[] args) {

    }
}

class Time {
    private int hour, minute, second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {  return hour;  }
    public void setHour(int hour) {
        if(hour <0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() {    return minute;   }
    public void setMinute(int hour) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() {    return second;      }
    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
