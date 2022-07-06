public class Task3 {
    /*
    Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
    which should be returning a price of the Vehicle. Create 2 sub classes: Sedan and Truck.
    The Truck class has field as weight and has its own implementation of  calculateSalePrice() method
    in which returned price calculated as following: if weight>2000 then returned price car should include 10% discount
    otherwise 20% discount. The Sedan class has field as length and also does its own implementation
    of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount
    otherwise 10% discount.*/
}
class Vehicle{
    double vehiclePrice;
    double calculateSalePrice(){
        return vehiclePrice;
    }
}
class Sedan extends Vehicle{
    double length;
    @Override
    double calculateSalePrice(){
        if(length>=20){
            return vehiclePrice*0.95;
        }else{
            return vehiclePrice*0.9;
        }
    }
}
class Truck extends Vehicle{
    double weight;

    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return vehiclePrice*0.9;
        }else{
            return vehiclePrice*0.8;
        }
    }
}
