import java.util.*;

public final class Recipes {
    private String recipeName;
    private double  totalCostAllProducts;
    private Map<Product,Integer> products = new HashMap<>();

    public Recipes(String recipeName) {
        this.recipeName = Utility.checkNull(recipeName,"Default");
    }

    public void addProduct(Product product,Integer i) {
        if (i == null || i <= 0) {
            i = 1;
        }
        
        this.products.put(product,i);
    }

    public Map<Product,Integer> getProducts() {
        return products;
    }

    public double getTotalCostAllProducts() {

        for (Map.Entry<Product, Integer> productIntegerEntry : products.entrySet()) {
            double v = productIntegerEntry.getKey().getPrice() * productIntegerEntry.getValue();
            totalCostAllProducts += v;
        }
        return totalCostAllProducts;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Double.compare(recipes.totalCostAllProducts, totalCostAllProducts) == 0 && Objects.equals(products, recipes.products) && Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, totalCostAllProducts, recipeName);
    }

    @Override
    public String toString() {
        return  recipeName + ": " +
                products +
                "  (Общая стоимость продуктов:" + getTotalCostAllProducts() +
                "рублей.)";
    }
}