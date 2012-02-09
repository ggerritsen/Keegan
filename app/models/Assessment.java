package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Assessment extends Model {

    private String scale;
    private int value;
    private double time;

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = Double.valueOf(time);
    }
}