public class ProductItem {
    public String tartina; double price; int quantity;
    public double totalPrice(int quantity,double price){
        double totalPrice = quantity*price;
        System.out.println(totalPrice);
         return(totalPrice);
     }

     public static void main(String[] args){
        int quantity = 5; double price= 7.52;
        ProductItem tartina = new ProductItem();
        tartina.totalPrice(quantity,price);
         System.out.println("the total price of all the tartina cans is " + tartina.totalPrice(5,7.52));

     }

}


