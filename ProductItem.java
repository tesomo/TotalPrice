public class ProductItem {
    public String item;
    double price;
    int quantity;

    public double getTotalPrice(){
        double getTotalPrice = quantity*price;
        System.out.println(getTotalPrice);
         return(getTotalPrice);
     }

    public static void main(String[] args){
       ProductItem tartina = new ProductItem();
       tartina.price= 5.8;
       tartina.quantity = 46;
        System.out.println("the total price of all the tartina cans is " + tartina.getTotalPrice());

    }


}


