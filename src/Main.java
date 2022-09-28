public class Main {
    public static void main(String[] args) {
        System.out.println("oop 1");

        // set işemi

        Product product1 = new Product();
        product1.setName("Delonghi kahve makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("bilmemne1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg kahve makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitInStock(2);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3 = new Product();
        product3.setName("Bosch kahve makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitInStock(4);
        product3.setImageUrl("bilmemne3.jpg");


        Product products[] = {product1,product2,product3};

        for(Product product : products ){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setFirstName("tunahan");
        individualCustomer.setLastName("karabayır");
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("2");
        individualCustomer.setPhone("3");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setTaxNumber("100");
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("3");
        corporateCustomer.setPhone("4");


        Customer customer = new Customer();
        Customer Customer1= new IndividualCustomer();
        Customer Customer2= new CorporateCustomer();

        Customer customers[] = {individualCustomer,corporateCustomer};

    }
}