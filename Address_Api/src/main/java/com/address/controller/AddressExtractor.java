package com.address.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



public class AddressExtractor {

	public static void main(String[] args) {

		List<String> addresses = Arrays.asList(

				"2705 Pierce ST, Wheat Ridge, CO, 80214", "8021 1|2 N NORTH WAY SW, UNIT B, Lakewood, WA, 98498",
				"6751 Brighton BLVD, Commerce City, CO, 80022", 
				"1170 Scranton ST, Aurora, CO, 80011",
				"4697 Independence ST, Wheat Ridge, CO, 80033", 
				"5211 W 4th AVE, UNIT E, Lakewood, CO, 80226",
				"4440 E 68th AVE, Commerce City, CO, 80022", 
				"8300 Emerson ST, Denver, CO, 80229",
				"5640 W 5th AVE, Lakewood, CO, 80226", 
				"4698 Independence ST, Wheat Ridge, CO, 80033",
				"1170 Peoria ST, Aurora, CO, 80011", 
				"7710 Kimberly ST, Commerce City, CO, 80022",
				"4450 E 68th AVE, Commerce City, CO, 80022", 
				"7740 Kimberly ST, BSMT, Commerce City, CO, 80022",
				"4699 Garrison ST, Wheat Ridge, CO, 80033", 
				"5382 W 3rd PL, UNIT 1, Lakewood, CO, 80226",
				"1170 Racine ST, Aurora, CO, 80011",
				"7710 Ladore ST, Commerce City, CO, 80022",
				"4451 Riggi PL, Commerce City, CO, 80022", 
				"7841 Kimberly ST, BSMT, Commerce City, CO, 80022",
				"1171 Troy ST, Aurora, CO, 80011",
				"4699 Independence ST, Wheat Ridge, CO, 80033",
				"2705 N Lamar ST, Wheat Ridge, CO, 80214", 
				"4456 E 68th AVE, Commerce City, CO, 80022",
				"7710 Larkwood ST, Commerce City, CO, 80022", 
				"5641 W 4th AVE, Lakewood, CO, 80226",
				"5562 W 3rd AVE, Lakewood, CO, 80226", 
				"2700 Quay ST, Wheat Ridge, CO, 80033",
				"1155 Troy ST, Aurora, CO, 80011", 
				"4689 Independence ST, Wheat Ridge, CO, 80033",
				"8671 Emerson CT, Denver, CO, 80229", 
				"6770 Albion ST, Commerce City, CO, 80022",
				"5575 W 3rd PL, Lakewood, CO, 80226", 
				"6770 Ash ST, Commerce City, CO, 80022",
				"1156 Troy ST, Aurora, CO, 80011", "4690 Independence ST, Wheat Ridge, CO, 80033",
				"2700 Vance ST, Wheat Ridge, CO, 80033", 
				"4683 Independence ST, Wheat Ridge, CO, 80033",
				"6770 Bellaire ST, Commerce City, CO, 80022", 
				"4690 Garland ST, Wheat Ridge, CO, 80033",
				"1156 Scranton ST, Aurora, CO, 80011", 
				"7710 Kenwood ST, UNIT B, Commerce City, CO, 80022",
				"2700 N Lamar ST, Wheat Ridge", 
				"8672 Emerson CT, Denver, CO, 80229",
				"6770 Birch ST, Commerce City, CO, 80022", 
				"4691 Independence ST, Wheat Ridge, CO, 80033",
				"1156 Peoria ST, Aurora, CO, 80011",
				"7831 Kenwood ST, BSMT, Commerce City, CO, 80022",
				"2701 Reed ST, Wheat Ridge, CO, 80033",
				"810 Essex DR, Denver, CO, 80229",
				"6770 Clermont ST, Commerce City, CO, 80022",
				"1156 Racine ST, Aurora, CO, 80011",
				"4692 Independence ST, Wheat Ridge, CO, 80033",
				"7831 Kenwood ST, Commerce City, CO, 80022",
				"820 Essex DR, Denver, CO, 80229", 
				"6771 Ash ST, Commerce City, CO, 80022",
				"5380 W 3rd PL, UNIT 4, Lakewood, CO, 80226", 
				"4693 Holland ST, Wheat Ridge, CO, 80033",
				"1158 Quari ST, Aurora, CO, 80011", 
				"7831 Kenwood ST, BLDG GARAGE, Commerce City, CO, 80022",
				"4684 Hoyt ST, Wheat Ridge, CO, 80033", 
				"4460 Riggi PL, Commerce City, CO, 80022",
				"921 E 83rd PL, Denver, CO, 80229", 
				"4693 Independence ST, Wheat Ridge, CO, 80033",
				"1159 Tucson ST, Aurora, CO, 80011",
				"840 Essex DR, Denver, CO, 80229",
				"911 E 83rd PL, Denver, CO, 80229", 
				"4460 E 68th AVE, Commerce City, CO, 80022",
				"7730 Kimberly ST, FLR UPSTRS, Commerce City, CO, 80022",
				"4694 Independence ST, Wheat Ridge, CO, 80033", 
				"1159 Quentin ST, Aurora, CO, 80011",
				"4685 Hoyt ST, Wheat Ridge, CO, 80033",
				"941 E 83rd PL, Denver, CO, 80229",
				"4480 Riggi PL, Commerce City, CO, 80022", 
				"5580 W 3rd PL, Lakewood, CO, 80226",
				"4694 Hoyt ST, Wheat Ridge, CO, 80033",
				"1160 Salem ST, Aurora, CO, 80011",
				"7701 Kenwood ST, Commerce City, CO, 80022",
				"2702 Newland ST, Wheat Ridge, CO, 80214",
				"4480 E 68th AVE, Commerce City, CO, 80022",
				"5578 W 4th AVE, Lakewood, CO, 80226",
				"4695 Hoyt ST, Wheat Ridge, CO, 80033", 
				"1160 Ursula ST, Aurora, CO, 80011",
				"7701 Ladore ST, Commerce City, CO, 80022",
				"981 E 83rd PL, Denver, CO, 80229",
				"4481 Riggi PL, Commerce City",
				"4695 Garland ST, Wheat Ridge, CO, 80033",
				"5610 W 5th AVE, Lakewood, CO, 80226",
				"1161 Ursula ST, Aurora, CO, 80011"

		);

		
		List<HashMap<String, String>> results = new ArrayList<>();

		for (String address : addresses) {
			HashMap<String, String> result = getValues(address);
			results.add(result);
		}

		Workbook workbook = new XSSFWorkbook();

		Sheet sheet = workbook.createSheet("Address");

		Row headerRow = sheet.createRow(0);
		// headerRow.createCell(0).setCellValue("Address");
		headerRow.createCell(0).setCellValue("House Number");
		headerRow.createCell(1).setCellValue("Street Suffix");
		headerRow.createCell(2).setCellValue("Street Name");
		headerRow.createCell(3).setCellValue("State");
		headerRow.createCell(5).setCellValue("Zipcode");
		headerRow.createCell(6).setCellValue("Zipcode Plus");
		headerRow.createCell(7).setCellValue("Pre-Direction");
		headerRow.createCell(9).setCellValue("Apt Number");
		headerRow.createCell(4).setCellValue("Post-Direction");
		headerRow.createCell(8).setCellValue("City");
		// headerRow.createCell(10).setCellValue("Country");
		
		

		int rowNumber = 1;
		for (HashMap<String, String> result : results) {
			Row row = sheet.createRow(rowNumber++);
			int cellnum = 0;
			for (Map.Entry<String, String> entry : result.entrySet()) {
				Cell cell = row.createCell(cellnum++);
				cell.setCellValue(entry.getValue());
			}
		}

		try {
			FileOutputStream out = new FileOutputStream(new File("AddressFile.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("Address data written to Excel file successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static HashMap<String, String> getValues(String address) {
		String houseNumberRegex = ("^\\d+$");
		String streetNameRegex = ("^(?!North\\b)[0-9]*[a-zA-Z\\s]+\\w$");
		String streetSuffixRegex = ("(?i)\\b(?:Ave|AVE|Avenue|Blvd|Boulevard|Ct|Court|DR|Dr|Drive|Ln|Lane|Parkway|Pl|Place|Rd|Road|St|ST|Street|Ter|Terrace)\\b");

		String cityRegex = "(?<city>[A-Za-z\\s-]+),\\s*(?<state>[A-Z]{2})";

		String stateRegex = ("^[A-Z]{2}$");
		String zipCodeRegex = ("^(\\d{5})(?:-(\\d{4}))?$");
		String zipCodePlusRegex = ("^(\\d{5})-((\\d{4}))$");
		String predirectionRegex = ("^(?i)(N|North|S|South|E|East|W|West|NE|NW|SE|SW)\\.?(\\s+)?$");

		String postdirectionRegex = ("^(N|S|E|W)\\.?$");

		String aptNumberRegex = "(\\b(?:Apt|Unit|Suite)\\s*[\\w\\d]+\\b)";

		HashMap<String, String> result = new HashMap<>();
		Pattern houseNoPattern = Pattern.compile(houseNumberRegex);
		Pattern streetNamePattern = Pattern.compile(streetNameRegex);
		Pattern streetSuffixPattern = Pattern.compile(streetSuffixRegex);
		Pattern statePattern = Pattern.compile(stateRegex);
		Pattern zipCodePattern = Pattern.compile(zipCodeRegex);
		Pattern zipCodePlusPattern = Pattern.compile(zipCodePlusRegex);
		Pattern preDirectionPattern = Pattern.compile(predirectionRegex);
		Pattern postDirectionPattern = Pattern.compile(postdirectionRegex);
		Pattern cityPattern = Pattern.compile(cityRegex);
		Pattern aptPattern = Pattern.compile(aptNumberRegex);

		String[] arrayList = address.split("[ ,]+");

		ArrayList<String> addressSplit = new ArrayList<>(Arrays.asList(arrayList));

		for (String houseNo : addressSplit) {
			Matcher matcher = houseNoPattern.matcher(houseNo);
			if (matcher.find()) {
				result.put("House Number", houseNo);
				addressSplit.remove(houseNo);
				break;
			} else {
				result.put("House Number", null);
			}
		}
		for (String streetName : addressSplit) {
			Matcher matcher = streetNamePattern.matcher(streetName);
			if (matcher.find()) {
				result.put("Street Name", streetName);
				addressSplit.remove(streetName);

				break;
			} else {
				result.put("Street Name", null);
			}
		}
		for (String streetSuffix : addressSplit) {
			Matcher matcher = streetSuffixPattern.matcher(streetSuffix);
			if (matcher.find()) {
				result.put("Street Suffix", streetSuffix);
				addressSplit.remove(streetSuffix);
				break;
			} else {
				result.put("Street Suffix", null);
			}
		}
		for (String state : addressSplit) {
			Matcher matcher = statePattern.matcher(state);
			if (matcher.find()) {
				result.put("State", state);
				addressSplit.remove(state);
				break;
			} else {
				result.put("State", null);
			}
		}
		for (String zipcode : addressSplit) {
			Matcher matcher = zipCodePattern.matcher(zipcode);
			if (matcher.find()) {
				result.put("Zipcode", matcher.group(1));
				addressSplit.remove(matcher.group(1));

				break;
			} else {
				result.put("Zipcode", null);
			}
		}
		for (String zipcodePlus : addressSplit) {
			Matcher matcher = zipCodePlusPattern.matcher(zipcodePlus);
			if (matcher.find()) {
				result.put("Zipcode Plus", matcher.group(2));
				addressSplit.remove(zipcodePlus);

				break;
			} else {
				result.put("Zipcode Plus", null);
			}
		}
		for (String preDirection : addressSplit) {
			Matcher matcher = preDirectionPattern.matcher(preDirection);

			if (matcher.find()) {
				result.put("Pre-Direction", matcher.group(1));
				addressSplit.remove(preDirection);
				break;
			} else {
				result.put("Pre-Direction", null);
			}
		}

		Matcher aptNoMatcher = aptPattern.matcher(address);
		if (aptNoMatcher.find()) {
			result.put("Apt Number", aptNoMatcher.group(1));
			addressSplit.remove(aptNoMatcher.group(1));
		} else {
			result.put("Apt Number", null);
		}

		for (String postDirection : addressSplit) {
			Matcher matcher = postDirectionPattern.matcher(postDirection);

			if (matcher.find()) {
				result.put("Post-Direction", postDirection);
				addressSplit.remove(postDirection);
				break;
			} else {
				result.put("Post-Direction", null);
			}
		}

		Matcher cityMatcher = cityPattern.matcher(address);
		if (cityMatcher.find()) {
			result.put("City", cityMatcher.group(1));
		} else {
			result.put("City", null);

		}

		System.out.println(result);
		return result;
	}
}
