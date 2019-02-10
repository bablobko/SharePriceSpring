/**
 * 
 */
package com.bablo.shareprice.repo;

import java.util.Map;

/**
 * @author anusharma
 *
 */
public class SharePriceRepo {

	Map<String, Double> sharePriceVal;

	public SharePriceRepo() {
		super();
		System.out.println("SharePriceRepo default constructor called.");
	}

	public SharePriceRepo(Map<String, Double> shareprice) {
		super();
		this.sharePriceVal = shareprice;
		System.out.println("SharePriceRepo parametrized constructor called.");
	}

	public Map<String, Double> getSharePriceVal() {
		System.out.println("Getter called.");
		return sharePriceVal;
	}

	public void setSharePriceVal(Map<String, Double> sharepriceVal) {
		System.out.println("Entry --- > Setter called.");
		this.sharePriceVal = sharepriceVal;
		System.out.println("Exit ---> Setter called.");
	}

}
