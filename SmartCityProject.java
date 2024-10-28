
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;


class SmartCity{
	void display() {
		
	}
}
class Hotel extends SmartCity{
	String hname="Hotel Benz Park", hname1="Palm Tree",hname2="Hotel Regency";
	int Price=2000,Price1=3000,Price2=4000;
	void displayHotel() {
		System.out.println("HOTEL DETAILS");
		System.out.println("HotelName=" + hname + ", Price=Rs." + Price + " per night");
		System.out.println("HotelName=" + hname1 + ", Price=Rs." + Price1 + " per night");
		System.out.println("HotelName=" + hname2 + ", Price=Rs." + Price2 + " per night\n");
	}
}
class Transportation extends SmartCity{
	String tname="Bus",tname1="Metro Train",tname2="Local Train";
	String troute="Available to all places",troute1="There are Two available lines are Present.They are Blue and Green",troute2="They are available based on timings\n";
	void displayTransportation() {
		//display();
		System.out.println("MODES OF TRANSPORT");
		System.out.println("Mode 1=" + tname + ",Route= " + troute);
		System.out.println("Mode 2=" + tname1 + ",Route= " + troute1);
		System.out.println("Mode 3=" + tname2 + ",Route= " + troute2 );
	}
	
}
class Shopping extends SmartCity{
	String sname="Malls\n",sname1="Stores\n",sname2="Places\n";
	void displayShopping() {
		System.out.println(sname +"1.VR Mall \n2.Express Avenue \n3.Nexus Vijaya Mall \n");
		System.out.println(sname1 +"1.Saravana Stores \n2.Jaya Chandran \n3.Pothys \n");
		System.out.println(sname2 +"1.T.Nagar \n2.Parris Corner \n3.Pondy Bazar \n");
	}
}
class CityNews extends SmartCity{
	void displayCityNews() {
		System.out.println("LATEST CITY NEWS IN CHENNAI");
		System.out.println("1.Heavy Rainfall Alert for 2 days in chennai.");
		System.out.println("2.The Renovated Guindy Park is opening Next Week.");
		System.out.println("3.The Diwali Festival is coming Next Week,so the Crackers Shops are getting increased.\n");
	}
}
class AirLineReservation extends SmartCity{
	void displayAirLineReservation() {
		System.out.println("AIRLINE SERVICES\n ");
		System.out.println("1.AIR INDIA");
		System.out.println("2.AIR ARABIA");
		System.out.println("3.INDIGO");
		System.out.println("4.EMIRATES ");
		System.out.println("5.EXIT\n");
		Scanner scanner1 = new Scanner(System.in);
        int choice1 = scanner1.nextInt();
        switch (choice1) {
        case 1:
            openWebpage("https://www.airindia.com/en-in/book-flights/");
            break;
        case 2:
            openWebpage("https://www.airarabia.com/en?gad_source=1&gclid=CjwKCAjwyfe4BhAWEiwAkIL8sJzHuT_v2qZ1uT2kmDjgdzHX2dI1eWVnNP-f-tfKqEXeuSKFqxJZ5hoCie0QAvD_BwE&gclsrc=aw.ds");
            break;
        case 3:
            openWebpage("https://www.goindigo.in/?cid=Display%7CAffiliate%7CLF%7CLA93%7C66c5edb0068d0b03429a41df_614_401&gad_source=1");
            break;
        case 4:
        	openWebpage("https://www.emirates.com/in/english/book/");
        case 5:
            System.out.println("Exiting...");
            break;
        default:
            System.out.println("Invalid choice. Please select a valid option.");}
    }

   
	private static void openWebpage(String urlString) {
		 
        try {
            URI uri = new URI(urlString); // Convert string to URL
            Desktop desktop = Desktop.getDesktop(); // Get the Desktop instance
            desktop.browse(uri); // Open the URL in the default browser
        } catch (URISyntaxException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Failed to open the URL: " + e.getMessage());
        }
       
        	
        }
    

	}

public class SmartCityProject {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
	
    boolean running = true;

    System.out.println("Welcome to Smart City Tourist Guide in Chennai");

    while (running) {
       
        System.out.println("1. View Hotels");
        System.out.println("2. View Transportation Options");
        System.out.println("3. View Shopping Details");
        System.out.println("4. View City News");
        System.out.println("5. View AirLine");
        System.out.println("6. Exit");
        System.out.println("\nChoose an option:");
       // Hotel h=new Hotel();

        int choice = scanner.nextInt();
        switch (choice) {
        case 1:
		Hotel h=new Hotel();
		h.displayHotel();
		break;
        case 2:
		Transportation t=new Transportation();
		t.displayTransportation();
		break;
        case 3:
		Shopping s=new Shopping();
		s.displayShopping();
		break;
        case 4:
		CityNews c=new CityNews();
		c.displayCityNews();
		break;
        case 5:
		AirLineReservation a=new AirLineReservation();
		a.displayAirLineReservation();
		
		break;
        case 6:
            running = false;
            System.out.println("Thank you for using the Smart City Tourist Guide!");
            break;
        default:
            System.out.println("Invalid choice, please try again.");
        }

	}
    scanner.close();

}
}
