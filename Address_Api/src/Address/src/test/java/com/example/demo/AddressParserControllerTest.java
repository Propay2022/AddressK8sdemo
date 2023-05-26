package com.example.demo;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressParserControllerTest {

	
	

	    @Test
	    public void Test21() {
	        AddressController controller = new AddressController();

	        String address = "4699 Independence ST,Wheat Ridge, CO, 80033";
	        Map<String, String> results = controller.getValues(address);
	        
//	        System.out.println(results);

	        Assertions.assertEquals("4699", results.get("House Number"));
	        Assertions.assertEquals(null, results.get("Pre-Direction"));
	        Assertions.assertEquals("Independence", results.get("Street Name"));
	        Assertions.assertEquals("ST", results.get("Street Suffix"));
	        Assertions.assertEquals(null, results.get("Post-Direction"));
	        Assertions.assertEquals(null, results.get("Apt Number"));
	        Assertions.assertEquals("Wheat Ridge", results.get("City"));
	        Assertions.assertEquals("CO", results.get("State"));
	        Assertions.assertEquals("80033", results.get("Zipcode"));
	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
	        Assertions.assertEquals(null, results.get("Country"));
	    }
	   
	   	 @Test
	   	    public void Test22() {
	   	        AddressController controller = new AddressController();

	   	        String address = "2705 N Lamar ST,Wheat Ridge, CO, 80214";
	   	        Map<String, String> results = controller.getValues(address);
	   	        
//	   	        System.out.println(results);

	   	        Assertions.assertEquals("2705", results.get("House Number"));
	   	        Assertions.assertEquals("N", results.get("Pre-Direction"));
	   	        Assertions.assertEquals("Lamar", results.get("Street Name"));
	   	        Assertions.assertEquals("ST", results.get("Street Suffix"));
	   	        Assertions.assertEquals(null, results.get("Post-Direction"));
	   	        Assertions.assertEquals(null, results.get("Apt Number"));
	   	        Assertions.assertEquals("Wheat Ridge", results.get("City"));
	   	        Assertions.assertEquals("CO", results.get("State"));
	   	        Assertions.assertEquals("80214", results.get("Zipcode"));
	   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
	   	        Assertions.assertEquals(null, results.get("Country"));
	   	    }
	
	    
		   	 @Test
		   	    public void Test23() {
		   	        AddressController controller = new AddressController();

		   	        String address = "4456 E 68th AVE,Commerce City, CO, 80022";
		   	        Map<String, String> results = controller.getValues(address);
		   	        
//		   	        System.out.println(results);

		   	        Assertions.assertEquals("4456", results.get("House Number"));
		   	        Assertions.assertEquals("E", results.get("Pre-Direction"));
		   	        Assertions.assertEquals("68th", results.get("Street Name"));
		   	        Assertions.assertEquals("AVE", results.get("Street Suffix"));
		   	        Assertions.assertEquals(null, results.get("Post-Direction"));
		   	        Assertions.assertEquals(null, results.get("Apt Number"));
		   	        Assertions.assertEquals("Commerce City", results.get("City"));
		   	        Assertions.assertEquals("CO", results.get("State"));
		   	        Assertions.assertEquals("80022", results.get("Zipcode"));
		   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
		   	        Assertions.assertEquals(null, results.get("Country"));
		   	    }
		
	    
		   	 @Test
		   	    public void Test24() {
		   	        AddressController controller = new AddressController();

		   	        String address = "7710 Larkwood ST,Commerce City, CO, 80022";
		   	        Map<String, String> results = controller.getValues(address);
		   	        
//		   	        System.out.println(results);

		   	        Assertions.assertEquals("7710", results.get("House Number"));
		   	        Assertions.assertEquals(null, results.get("Pre-Direction"));
		   	        Assertions.assertEquals("Larkwood", results.get("Street Name"));
		   	        Assertions.assertEquals("ST", results.get("Street Suffix"));
		   	        Assertions.assertEquals(null, results.get("Post-Direction"));
		   	        Assertions.assertEquals(null, results.get("Apt Number"));
		   	        Assertions.assertEquals("Commerce City", results.get("City"));
		   	        Assertions.assertEquals("CO", results.get("State"));
		   	        Assertions.assertEquals("80022", results.get("Zipcode"));
		   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
		   	        Assertions.assertEquals(null, results.get("Country"));
		   	    }
		
	  
		   	 @Test
		   	    public void Test25() {
		   	        AddressController controller = new AddressController();

		   	        String address = "5641 W 4th AVE,Lakewood, CO, 80226";
		   	        Map<String, String> results = controller.getValues(address);
		   	        
//		   	        System.out.println(results);

		   	        Assertions.assertEquals("5641", results.get("House Number"));
		   	        Assertions.assertEquals("W", results.get("Pre-Direction"));
		   	        Assertions.assertEquals("4th", results.get("Street Name"));
		   	        Assertions.assertEquals("AVE", results.get("Street Suffix"));
		   	        Assertions.assertEquals(null, results.get("Post-Direction"));
		   	        Assertions.assertEquals(null, results.get("Apt Number"));
		   	        Assertions.assertEquals("Lakewood", results.get("City"));
		   	        Assertions.assertEquals("CO", results.get("State"));
		   	        Assertions.assertEquals("80226", results.get("Zipcode"));
		   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
		   	        Assertions.assertEquals(null, results.get("Country"));
		   	    }
		
		   	 @Test
		   	    public void Test26() {
		   	        AddressController controller = new AddressController();

		   	        String address = "5562 W 3rd AVE,Lakewood, CO, 80226";
		   	        Map<String, String> results = controller.getValues(address);
		   	        
//		   	        System.out.println(results);

		   	        Assertions.assertEquals("5562", results.get("House Number"));
		   	        Assertions.assertEquals("W", results.get("Pre-Direction"));
		   	        Assertions.assertEquals("3rd", results.get("Street Name"));
		   	        Assertions.assertEquals("AVE", results.get("Street Suffix"));
		   	        Assertions.assertEquals(null, results.get("Post-Direction"));
		   	        Assertions.assertEquals(null, results.get("Apt Number"));
		   	        Assertions.assertEquals("Lakewood", results.get("City"));
		   	        Assertions.assertEquals("CO", results.get("State"));
		   	        Assertions.assertEquals("80226", results.get("Zipcode"));
		   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
		   	        Assertions.assertEquals(null, results.get("Country"));
		   	    }
		
	   
		   	 @Test
		   	    public void Test27() {
		   	        AddressController controller = new AddressController();

		   	        String address = "2700 Quay ST,Wheat Ridge, CO, 80033";
		   	        Map<String, String> results = controller.getValues(address);
		   	        
//		   	        System.out.println(results);

		   	        Assertions.assertEquals("2700", results.get("House Number"));
		   	        Assertions.assertEquals(null, results.get("Pre-Direction"));
		   	        Assertions.assertEquals("Quay", results.get("Street Name"));
		   	        Assertions.assertEquals("ST", results.get("Street Suffix"));
		   	        Assertions.assertEquals(null, results.get("Post-Direction"));
		   	        Assertions.assertEquals(null, results.get("Apt Number"));
		   	        Assertions.assertEquals("Wheat Ridge", results.get("City"));
		   	        Assertions.assertEquals("CO", results.get("State"));
		   	        Assertions.assertEquals("80033", results.get("Zipcode"));
		   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
		   	        Assertions.assertEquals(null, results.get("Country"));
		   	    }
		
		   	 @Test
		   	    public void Test28() {
		   	        AddressController controller = new AddressController();

		   	        String address = "1155 Troy ST,Aurora, CO, 80011";
		   	        Map<String, String> results = controller.getValues(address);
		   	        
//		   	        System.out.println(results);

		   	        Assertions.assertEquals("1155", results.get("House Number"));
		   	        Assertions.assertEquals(null, results.get("Pre-Direction"));
		   	        Assertions.assertEquals("Troy", results.get("Street Name"));
		   	        Assertions.assertEquals("ST", results.get("Street Suffix"));
		   	        Assertions.assertEquals(null, results.get("Post-Direction"));
		   	        Assertions.assertEquals(null, results.get("Apt Number"));
		   	        Assertions.assertEquals("Aurora", results.get("City"));
		   	        Assertions.assertEquals("CO", results.get("State"));
		   	        Assertions.assertEquals("80011", results.get("Zipcode"));
		   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
		   	        Assertions.assertEquals(null, results.get("Country"));
		   	    }
	
		   	 @Test
		   	    public void Test29() {
		   	        AddressController controller = new AddressController();

		   	        String address = "4689 Independence ST,Wheat Ridge, CO, 80033";
		   	        Map<String, String> results = controller.getValues(address);
		   	        
//		   	        System.out.println(results);

		   	        Assertions.assertEquals("4689", results.get("House Number"));
		   	        Assertions.assertEquals(null, results.get("Pre-Direction"));
		   	        Assertions.assertEquals("Independence", results.get("Street Name"));
		   	        Assertions.assertEquals("ST", results.get("Street Suffix"));
		   	        Assertions.assertEquals(null, results.get("Post-Direction"));
		   	        Assertions.assertEquals(null, results.get("Apt Number"));
		   	        Assertions.assertEquals("Wheat Ridge", results.get("City"));
		   	        Assertions.assertEquals("CO", results.get("State"));
		   	        Assertions.assertEquals("80033", results.get("Zipcode"));
		   	        Assertions.assertEquals(null, results.get("Zipcode Plus"));
		   	        Assertions.assertEquals(null, results.get("Country"));
		   	    }
}


		   	 
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 
		   	 
	    


