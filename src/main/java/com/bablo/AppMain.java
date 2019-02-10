package com.bablo;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bablo.shareprice.repo.SharePriceRepo;

/**
 * 
 */

/**
 * @author anusharma
 *
 */
public class AppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        SharePriceRepo sharePriceRepo = context.getBean("shareprice", SharePriceRepo.class);
        
        
        System.out.println("Now we are going to call the getter.");
        Map<String, Double> map = sharePriceRepo.getSharePriceVal();
        
        for(Map.Entry<String, Double> entry : map.entrySet()) {
        	System.out.println(entry.getKey() + " has the share price of " + entry.getValue());
        }
        
	}

}
