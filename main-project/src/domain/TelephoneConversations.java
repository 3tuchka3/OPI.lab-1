package domain;


import java.time.LocalDate;
import java.time.LocalTime;

public class TelephoneConversations {
    private String number;
    private LocalDate date;
    private LocalTime time;
    private LocalTime duration;
    private String rate;
    private double price;

    public String getNumber() {
        return number;
    }

    ;

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    ;

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    ;

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalTime getDuration() {
        return duration;
    }

    ;

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getRate() {
        return rate;
    }

    ;

    public void setRate(String  rate) {
        this.rate = rate;
    }
    public Double getPrice() {
        return price;
    }

    ;

    public void setPrice(Double  price) {
        this.price = price;
    }

    public TelephoneConversations() {

    }

    @Override
    public String toString() {
        return ("number = " + number + " date = " + date + " time = " + time + " duraction = " + duration + " rate = " + rate + " price = " + price);
    }
}
