package Hw10;

public enum Ball {
    BASKETBALL(5, "Basketball", 100, "composite leather" ) ,
    FOOTBALL  (4, "Football", 80 , "polyurethane"),
    VOLLEYBALL(3 ,"volleyball", 50, "artificial leather"),
    TENNISBALL (2, "tennis" , 20,"natural rubber"),
    GOLFBALL(1, "golf", 25, "urethane");

    double size;
    String kindOfSport;
    double price;
    String material;


    Ball(double size, String kindOfSport, double price, String material) {
        this.size = size;
        this.kindOfSport = kindOfSport;
        this.price = price;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", kindOfSport='" + kindOfSport + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
