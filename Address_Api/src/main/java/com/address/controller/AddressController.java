package com.address.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@PostMapping("/send")

	public HashMap<String, String> getValues(String address) {

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
