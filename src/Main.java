public class Main {
    public static void main(String[] args) {


        Product product1 = new Product(1, "Asus", 5.5, "mert");
        Product product2 = new Product(2, "Hp", 5.5, "mert");
        Product product3 = new Product(3, "Sony", 5.5, "mert");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        Category category1=new Category();
        category1.id=1;
        category1.name="Bilgisayar";

        Category category2=new Category();
        category2.id=2;
        category2.name="Ev/Bahçe";




    }
}
