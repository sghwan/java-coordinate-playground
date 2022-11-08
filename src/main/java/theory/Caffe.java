package theory;

public class Caffe {
    public static void main(String[] args) {
        CaffeineBeverageFactory.makeRecipe();
        CaffeineBeverage coffee = CaffeineBeverageFactory.getCaffeineBeverage("cofFee");
        CaffeineBeverage tea = CaffeineBeverageFactory.getCaffeineBeverage("TeA");
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
