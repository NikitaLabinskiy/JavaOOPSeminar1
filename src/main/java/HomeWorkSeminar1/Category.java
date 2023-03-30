//2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.

package HomeWorkSeminar1;

import java.util.ArrayList;
import java.util.Arrays;

public class Category{
    String name;
    Product[] arrayOfProducts;

    public Category(String name, Product[] arrayOfProducts) {
        this.name = name;
        this.arrayOfProducts = arrayOfProducts;
    }

    public Product[] getArrayOfProducts() {
        return arrayOfProducts;
    }

    public void setArrayOfProducts(Product[] arrayOfProducts) {
        this.arrayOfProducts = arrayOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category: "+  name  +
                "\nProducts: " + Arrays.toString(arrayOfProducts);
    }
}
