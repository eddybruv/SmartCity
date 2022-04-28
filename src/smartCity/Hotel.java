package smartCity;

public class Hotel {
    public String name;
    public String town;
    public int evaluation;
    public int recommendation;
    public double price;

    Hotel(String name, double price, String town, int evaluation) {
        this.name = name;
        this.price = price;
        this.town = town;
        this.evaluation = evaluation;
    }

    void incrementEvaluation () {
        if (this.recommendation  == 100) {
                this.evaluation ++;
                this.recommendation =0;
        }
    }
}
