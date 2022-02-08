public class BMI
{
    static final double POUNDTOKG = 0.45359237;
    static final double INCHTOMETER = 0.0254;
    private double weight;
    private double height;
    private String[] category = {"Underweight", "Normal", "Overweight", "Obese"};
    
    public BMI()
    {
    
    }
    
    public BMI(double mass, double height) {
        this.weight = mass;
        this.height = height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight * POUNDTOKG;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height * INCHTOMETER;
    }
    
    public double getIndex()
    {
        double heightSqr = height * height;
        return weight / heightSqr;
    }
    
    public String getCategory()
    {
        double index = getIndex();
        if (index < 18.5)
        {
            return category[0];
        }
        else if (index < 25)
        {
            return category[1];
        }
        else if (index < 30)
        {
            return category[2];
        }
        else
        {
            return category[3];
        }
    }
}
