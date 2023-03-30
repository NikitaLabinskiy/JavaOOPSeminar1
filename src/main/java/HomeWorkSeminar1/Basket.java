//3)Создать класс Basket, содержащий массив купленных товаров.

package HomeWorkSeminar1;

import java.util.Arrays;

public class Basket {
Product[] basketWithProducts;

    public Basket(Product[] basketWithProducts) {
        this.basketWithProducts = basketWithProducts;
    }

    public Product[] getBasketWithProducts() {
        return basketWithProducts;
    }

    public void setBasketWithProducts(Product[] basketWithProducts) {
        this.basketWithProducts = basketWithProducts;
    }

    @Override
    public String toString() {
        return "Basket with products: " + Arrays.toString(basketWithProducts);
    }
}
