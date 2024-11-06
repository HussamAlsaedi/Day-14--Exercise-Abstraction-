public class Movie extends Product {
    private String director;

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public Movie(String name, double price) {
        super(name, price);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double price = getPrice();
        double discount = 10;
        if(discount > price){
            return price;
        }
        return price =- discount;
    }
}