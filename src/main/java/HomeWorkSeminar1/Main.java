//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

package HomeWorkSeminar1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] productsOfMilk = new Product[3];
        productsOfMilk[0] = new Product("Milk", 110.0, 4.48);
        productsOfMilk[1] = new Product("Cheese", 230.0, 4.89);
        productsOfMilk[2] = new Product("Cottage cheese", 140.0, 4.67);
        Product[] productsOfMeet = new Product[3];
        productsOfMeet[0] = new Product("Chicken", 230.0, 4.73);
        productsOfMeet[1] = new Product("Beef", 560.0, 4.83);
        productsOfMeet[2] = new Product("Pork", 340.0, 4.53);
        Category dairyProducts = new Category("Dairy", productsOfMilk);
        Category meetProducts = new Category("Meet", productsOfMeet);
        Product[] allProducts = new Product[6];
        allProducts[0] = productsOfMilk[0];
        allProducts[1] = productsOfMilk[1];
        allProducts[2] = productsOfMilk[2];
        allProducts[3] = productsOfMeet[0];
        allProducts[4] = productsOfMeet[1];
        allProducts[5] = productsOfMeet[2];
        Category productsAll = new Category("All products", allProducts);
        Basket basket = new Basket(allProducts);
        System.out.println(basket);

//        System.out.println(dairyProducts);
//        System.out.println(meetProducts);
//        Product[][] basketWithProducts = new Product[2][3];
//        basketWithProducts[0][0] = productsOfMilk[0];
//        basketWithProducts[0][1] = productsOfMilk[1];
//        basketWithProducts[0][2] = productsOfMilk[2];
//        basketWithProducts[1][0] = productsOfMeet[0];
//        basketWithProducts[1][1] = productsOfMeet[1];
//        basketWithProducts[1][2] = productsOfMeet[2];
//        System.out.println(basketWithProducts);
//        Basket basket = new Basket(basketWithProducts);
//        System.out.println(basketWithProducts);
    }
}
