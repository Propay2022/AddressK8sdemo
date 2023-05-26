package com.address;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.address.controller.AddressController;

public class AddressApiTest {

    @Test
    public void test1() {
        AddressController controller = new AddressController();

        String address = "2705 Pierce ST,Wheat Ridge, CO, 80214";
        Map<String, String> results = controller.getValues(address);
        
        Assertions.assertEquals("2705", results.get("House Number"));
        Assertions.assertEquals(null, results.get("Pre-Direction"));
        Assertions.assertEquals("Pierce", results.get("Street Name"));
        Assertions.assertEquals("ST", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Wheat Ridge", results.get("City"));
        Assertions.assertEquals("CO", results.get("State"));
        Assertions.assertEquals("80214", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals(null, results.get("Country"));
    }
    //Doubt - unit number
//    @Test
//    public void test2() {
//        AddressController controller = new AddressController();
//
//        String address = "8021 1|2 N NORTHWAY SW, UNIT B,Lakewood, WA, 98498";
//        Map<String, String> results = controller.getValues(address);
//
//        Assertions.assertEquals("8021", results.get("House Number"));
//        Assertions.assertEquals("N", results.get("Pre-Direction"));
//        Assertions.assertEquals("NORTHWAY", results.get("Street Name"));
//        Assertions.assertEquals(null, results.get("Street Suffix"));
//        Assertions.assertEquals(null, results.get("Post-Direction"));
//        Assertions.assertEquals(null, results.get("Apt Number"));
//        Assertions.assertEquals("N NORTHWAY SW", results.get("City"));
//        Assertions.assertEquals("98498", results.get("Zipcode"));
//        Assertions.assertEquals(null, results.get("Zipcode Plus"));
//        Assertions.assertEquals("WA", results.get("State"));
//    }
    @Test
    public void test3() {
        AddressController controller = new AddressController();

        String address = "6751 Brighton BLVD,Commerce City, CO, 80022";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("6751", results.get("House Number"));
        Assertions.assertEquals(null, results.get("Pre-Direction"));
        Assertions.assertEquals("Brighton", results.get("Street Name"));
        Assertions.assertEquals("BLVD", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Commerce City", results.get("City"));
        Assertions.assertEquals("80022", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    @Test
    public void test4() {
        AddressController controller = new AddressController();

        String address = "1170 Scranton ST,Aurora, CO, 80011";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("1170", results.get("House Number"));
        Assertions.assertEquals(null, results.get("Pre-Direction"));
        Assertions.assertEquals("Scranton", results.get("Street Name"));
        Assertions.assertEquals("ST", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Aurora", results.get("City"));
        Assertions.assertEquals("80011", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    public void test5() {
        AddressController controller = new AddressController();

        String address = "4697 Independence ST,Wheat Ridge, CO, 80033";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("4697", results.get("House Number"));
        Assertions.assertEquals(null, results.get("Pre-Direction"));
        Assertions.assertEquals("Independence", results.get("Street Name"));
        Assertions.assertEquals("ST", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Wheat Ridge", results.get("City"));
        Assertions.assertEquals("80033", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    
    public void test6() {
        AddressController controller = new AddressController();

        String address = "5211 W 4th AVE, UNIT E,Lakewood, CO, 80226";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("5211", results.get("House Number"));
        Assertions.assertEquals("W", results.get("Pre-Direction"));
        Assertions.assertEquals("4th", results.get("Street Name"));
        Assertions.assertEquals("AVE", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Lakewood", results.get("City"));
        Assertions.assertEquals("80226", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    public void test7() {
        AddressController controller = new AddressController();

        String address = "4440 E 68th AVE,Commerce City, CO, 80022";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("4440", results.get("House Number"));
        Assertions.assertEquals("E", results.get("Pre-Direction"));
        Assertions.assertEquals("68th", results.get("Street Name"));
        Assertions.assertEquals("AVE", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Commerce City", results.get("City"));
        Assertions.assertEquals("80022", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    
    public void test8() {
        AddressController controller = new AddressController();

        String address = "8300 Emerson ST,Denver, CO, 80229";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("8300", results.get("House Number"));
        Assertions.assertEquals(null, results.get("Pre-Direction"));
        Assertions.assertEquals("Emerson", results.get("Street Name"));
        Assertions.assertEquals("ST", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Denver", results.get("City"));
        Assertions.assertEquals("80229", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    public void test9() {
        AddressController controller = new AddressController();

        String address = "5640 W 5th AVE,Lakewood, CO, 80226";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("5640", results.get("House Number"));
        Assertions.assertEquals("W", results.get("Pre-Direction"));
        Assertions.assertEquals("5th", results.get("Street Name"));
        Assertions.assertEquals("AVE", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Lakewood", results.get("City"));
        Assertions.assertEquals("80226", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    public void test10() {
        AddressController controller = new AddressController();

        String address = "4698 Independence ST,Wheat Ridge, CO, 80033";
        Map<String, String> results = controller.getValues(address);

        Assertions.assertEquals("4698", results.get("House Number"));
        Assertions.assertEquals(null, results.get("Pre-Direction"));
        Assertions.assertEquals("Independence", results.get("Street Name"));
        Assertions.assertEquals("ST", results.get("Street Suffix"));
        Assertions.assertEquals(null, results.get("Post-Direction"));
        Assertions.assertEquals(null, results.get("Apt Number"));
        Assertions.assertEquals("Wheat Ridge", results.get("City"));
        Assertions.assertEquals("80033", results.get("Zipcode"));
        Assertions.assertEquals(null, results.get("Zipcode Plus"));
        Assertions.assertEquals("CO", results.get("State"));
    }
    
    
    
}
