public class CarData {
    private int madeyear;
    private String model;
    private int price;
    private String color;

    @Override
    public String toString() {
        return "CarData{" +
                "madeyear=" + madeyear +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public int getMadeyear() {
        return madeyear;
    }

    public void setMadeyear(int madeyear) {
        this.madeyear = madeyear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarData(int madeyear, String model, int price, String color) {
        this.madeyear = madeyear;
        this.model = model;
        this.price = price;
        this.color = color;
    }
}
