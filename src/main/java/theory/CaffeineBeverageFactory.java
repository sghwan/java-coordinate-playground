package theory;

import java.util.HashMap;
import java.util.Map;

public class CaffeineBeverageFactory {
    private static Map<String, CaffeineBeverage> recipe = new HashMap<>();

    public static void makeRecipe() {
        recipe.put("coffee", new Coffee());
        recipe.put("tea", new Tea());
    }

    public static CaffeineBeverage getCaffeineBeverage(String type) {
        if (!recipe.containsKey(type.toLowerCase()))
            throw new IllegalArgumentException("해당 음료는 존재하지 않습니다.");

        return recipe.get(type.toLowerCase());
    }
}
