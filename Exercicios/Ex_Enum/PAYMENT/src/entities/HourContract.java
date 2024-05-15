package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private double valuePerHour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(Date dt, Double vph, Integer h) {
        this.setDate(dt);
        this.setValuePerHour(vph);
        this.setHours(h);

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

}
