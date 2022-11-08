package theory;

public abstract class CaffeineBeverage {
    abstract void brew();

    abstract void addCondiments();

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public void pourInCup() {
        System.out.println("컵에 붓는다.");
    }
}
