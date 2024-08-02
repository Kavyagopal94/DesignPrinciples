class Chef {
    public void cook() {
        System.out.println("Cooking food");
    }
}

class Waiter {
    public void serve() {
        System.out.println("Serving food");
    }
}

class RestaurantService {
    private Chef chef = new Chef();
    private Waiter waiter = new Waiter();

    public void operate() {
        chef.cook();
        waiter.serve();
    }
}

public class COI {
    public static void main(String[] args) {

        RestaurantService restaurantService = new RestaurantService();
        restaurantService.operate();
    }
}
