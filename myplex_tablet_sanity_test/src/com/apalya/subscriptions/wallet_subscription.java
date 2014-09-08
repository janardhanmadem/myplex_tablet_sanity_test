package com.apalya.subscriptions;

import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;

public class wallet_subscription {
	
	public static keywords key=null;
	 public static reusable_functions rf=null;
	 //make sure exampleapalya@gmail.com having sufficient wallet balance.
	@Test
	public void wallet_purchase(){
		 rf=new reusable_functions();
	    	rf.normal_myplex_login();
	    	key=new keywords();
	        key.waitforelement_native("partial_text=movies", 30000);
	        key.click_native("text=movies");
	        key.click_native("xpath=//*[@id='card_preview_image' and ../*[./*[@text='300: rise of an empire']]]");
	        key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
	        key.click_native("xpath=//*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.LinearLayout' and ./*[@text='Rental']]]");
	        key.click_native("xpath=//*[@text='Debit Card']");
	        key.sleep(20000);
	        key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
	        key.waitforelement_native("xpath=//*[@text='good : stream online']", 10000);
		    key.click_native("id=good_radio_btn");
		    key.waitforelement_native("partial_text=Don't ask again", 30000);
			key.click_native("xpath=//*[@text='continue']");
			key.sleep(60000);
			key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
			key.waitforelement_native("xpath=//*[@id='playpauseimage']", 10000);
			key.iselement_found_native("xpath=//*[@id='playpauseimage']");
	        key.sent_text("{ESC}");
	      
	    
	        
	        
	        
	        
	}

}
