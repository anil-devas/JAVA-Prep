package Assignments;

//Fruits - Apples, Banana, Guava
//Vegetables - Carrot, Cucumber, Beetroot
//Frozen Items - Paneer, Cheese, French Fries, Nuggets
//Spices - Urad Dal, Toor Dal 
//Snacks - Pringles, Ferro Rocher, 
//Ice Creams - Butterscotch, Black Current

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	
class Vegitable{
	private String Name;
	private double Price;
	
	public Vegitable(String name,double price) {
		this.Name = name;
		this.Price = price;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return Price;
	}
}

class Fruit{
	private String Name;
	private double Price;
	
	public Fruit(String name,double price) {
		this.Name = name;
		this.Price = price;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return Price;
	}
}

class FrozenItem{
	private String Name;
	private double Price;
	
	public FrozenItem(String name,double price) {
		this.Name = name;
		this.Price = price;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return Price;
	}
}

class Spice{
	private String Name;
	private double Price;
	public Spice(String name,double price) {
		this.Name = name;
		this.Price = price;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return Price;
	}
}
class Cosmetic{
	private String Name;
	private double Price;
	public Cosmetic(String name,double price) {
		this.Name = name;
		this.Price = price;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return Price;
	}
}

class IceCream{
	private String Name;
	private double Price;
	public IceCream(String name,double price) {
		this.Name = name;
		this.Price = price;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return Price;
	}
}
public class GroceryAssignment {

	public static void main(String[] args) {

		System.out.println("Welcome to the Grocery Store");
		double totalPrice=0.0;
		
		List<Vegitable> vegitableList = new ArrayList<Vegitable>();
		vegitableList.add(new Vegitable("Carrot",10.0));
		vegitableList.add(new Vegitable("Cucumber",6.0));
		vegitableList.add(new Vegitable("Beetroot",15.0));
		vegitableList.add(new Vegitable("Onion",10.0));
		
		//Fruits - Apples, Banana, Guava, Grape
		List<Fruit> fruitList = new ArrayList<Fruit>();
		fruitList.add(new Fruit("Apple",15.0));
		fruitList.add(new Fruit("Banana",5.0));
		fruitList.add(new Fruit("Guava",3.5));
		fruitList.add(new Fruit("Grape",10.0));

		//Frozen Items - Paneer, Cheese, French Fries, Nuggets
		List<FrozenItem> frozenItemsList = new ArrayList<FrozenItem>();
		frozenItemsList.add(new FrozenItem("Paneer",80.0));
		frozenItemsList.add(new FrozenItem("Cheese",50.0));
		frozenItemsList.add(new FrozenItem("French Fries",70.0));
		frozenItemsList.add(new FrozenItem("Nuggets",100.0));
		
		//Spices - Jeera powder, Chicken Masala, Garam Masala.
		List<Spice> spiceList = new ArrayList<Spice>();
		spiceList.add(new Spice("Jeera powder",25.0));
		spiceList.add(new Spice("Chicken Masala",25.0));
		spiceList.add(new Spice("Garam Masala",25.0));
		
		//Cosmetics - SunScreen, Ponds, Nivea,  
		List<Cosmetic> cosmeticList = new ArrayList<Cosmetic>();
		cosmeticList.add(new Cosmetic("SunScreen",120.0));
		cosmeticList.add(new Cosmetic("Ponds",85.0));
		cosmeticList.add(new Cosmetic("Nivea",55.0));
		
		//Ice Creams - Butterscotch, Black Current, Mango
		List<IceCream> iceCreamList = new ArrayList<IceCream>();
		iceCreamList.add(new IceCream("Butter Scotch",25.0));
		iceCreamList.add(new IceCream("Black Current",30.0));
		iceCreamList.add(new IceCream("Mango",15.0));
		
		Scanner enteredInput = new Scanner(System.in);			

		while(true) {   
				System.out.println("\nPlease select your catagory \n1.Vegetables \n2.Fruits \n3.Frozen Items \n4.Spices \n5.Cosmetics \n6.Ice Creams ");
	
				int groceryCode = enteredInput.nextInt();
				 if (groceryCode == 0) {
		                System.out.println("Exiting...");
		                break; // Exit the loop
		         }
//				 else if (groceryCode <= 6) {
//		        	 System.out.println("continue");
//		        	 continue;
//		         }else {System.out.println("!!!!! Select proper Catagory !!!!!");}
				 
			switch (groceryCode) {
				case 1 -> {
					System.out.println("Please select your Vegitable");
					System.out.println("1.Carrot");
					System.out.println("2.Cucumber");
					System.out.println("3.Beetroot");
					System.out.println("4.Onion");
					
					int itemCode = enteredInput.nextInt();
					System.out.println("Enter quantity");
					int quantity = enteredInput.nextInt();
					  
					totalPrice += quantity*vegitableList.get(itemCode-1).getPrice();
					System.out.println("Total Price is "+totalPrice);
					System.out.println("\nFor proceed to billing press 0 or continue shopping");
				}
				case 2 -> {

					System.out.println("Please select your Fruits");
					System.out.println("1.Apple");
					System.out.println("2.Banana");
					System.out.println("3.Guava");
					System.out.println("4.Grape");
					
					int itemCode = enteredInput.nextInt();
					System.out.println("Enter quantity");
					int quantity = enteredInput.nextInt();
					totalPrice += quantity*fruitList.get(itemCode-1).getPrice();
					System.out.println("Total Price is "+totalPrice);
					System.out.println("\nFor proceed to billing press 0 or continue shopping");

				}
				case 3 -> {
					//Frozen Items - Paneer, Cheese, French Fries, Nuggets

					System.out.println("Please select your Frozen Items");
					System.out.println("1.Paneer");
					System.out.println("2.Cheese");
					System.out.println("3.French Fries");
					System.out.println("4.Nuggets");
					
					int itemCode = enteredInput.nextInt();
					System.out.println("Enter quantity");
					int quantity = enteredInput.nextInt();
					totalPrice += quantity*frozenItemsList.get(itemCode-1).getPrice();
					System.out.println("Total Price is "+totalPrice);
					System.out.println("\nFor proceed to billing press 0 or continue shopping");

					
				}
				case 4 -> {
					//Spices - Jeera powder, Chicken Masala, Garam Masala
					
					System.out.println("Please select Spices");
					System.out.println("1.Jeera powder");
					System.out.println("2.Chicken Masala");
					System.out.println("3.Garam Masala");
					
					int itemCode = enteredInput.nextInt();
					System.out.println("Enter quantity");
					int quantity = enteredInput.nextInt();
					totalPrice += quantity*spiceList.get(itemCode-1).getPrice();
					System.out.println("Total Price is "+totalPrice);
					System.out.println("\nFor proceed to billing press 0 or continue shopping");

					
				}
				case 5 -> {
					//Cosmetics - SunScreen, Ponds, Nivea, 
					
					System.out.println("Please select any Cosmetics");
					System.out.println("1.SunScreen");
					System.out.println("2.Ponds");
					System.out.println("3.Nivea");
					
					int itemCode = enteredInput.nextInt();
					System.out.println("Enter quantity");
					int quantity = enteredInput.nextInt();
					totalPrice += quantity*cosmeticList.get(itemCode-1).getPrice();
					System.out.println("Total Price is "+totalPrice);
					System.out.println("\nFor proceed to billing press 0 or continue shopping");

					
				}
				case 6 -> {
					//Ice Creams - Butterscotch, Black Current, Mango
					
					System.out.println("Please select your Ice Creams");
					System.out.println("1.Butterscotch");
					System.out.println("2.Black Current");
					System.out.println("3.Mango");
					
					int itemCode = enteredInput.nextInt();
					System.out.println("Enter quantity");
					int quantity = enteredInput.nextInt();
					totalPrice += quantity*iceCreamList.get(itemCode-1).getPrice();
					System.out.println("Total Price is "+totalPrice);
					System.out.println("\nFor proceed to billing press 0 or continue shopping");

				}
			}			
		}
		//Total Bill
		System.out.println("Calculating your Total Bill included taxes..........");
		double finalPrice = 0.0;
		double taxes;
		double taxPercentage=0.01;
		taxes = totalPrice*taxPercentage;
		finalPrice = totalPrice + taxes;
		System.out.println("Your shoping bill included taxes is "+ finalPrice);
		enteredInput.close();
		
		//Payment
		System.out.println("Please Select your payment method \n1.Cash \n2.Card \n3.UPI");
		Scanner enteredInput2 = new Scanner(System.in);	
		
		String typeOfPay = enteredInput2.next();
		switch(typeOfPay) {
		case "Cash" ->{
			System.out.println("Please give the cash to the Counter");
		}
		case "Card" ->{
			System.out.println("Please Please Enter the card details");
		}
		case "UPI" ->{
			System.out.println("Please Please Scan teh UPI QR Code");
		}
		}
		enteredInput2.close();
		
		System.out.println("Payment Successfully done");
		System.out.println("Thanks for shopping with us");
		
		
			
}
}
