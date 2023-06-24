package web.model;

public class Car {

    int id;
    private String model;
    private int series;
    private int power;

    public Car(int id, String model, int series, int power) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.power = power;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", power=" + power +
                '}';
    }
}
