package com.apalya.playcontent;

import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;

public class tvshow_play_dtr {
	public static reusable_functions rf=null;
    public static keywords key=null;
   
    
    @Test
	
	public void tv_show_play(){
	
			key=new keywords();
			key.setup();
			key.open_app("adb:SM-T805","com.apalya.myplex/.LoginActivity");
			key.select_elements_from_list("text=settings");
			key.click_native("text=settings");
			key.sleep(2000);
			key.waitforelement_native("xpath=//*[@text='movie rental options: 		always ask']", 10000);
			key.click_native("xpath=//*[@text='movie rental options: 		always ask']");   
			key.waitforelement_native("partial_text=always ask", 10000);
			key.click_native("text=always ask");
			key.waitforelement_native("text=continue", 10000);
			key.click_native("text=continue");
			key.waitforelement_native("text=tv shows", 10000);
			key.click_native("text=tv shows");
			key.swipe_while_not_found("Down","NATIVE", "text=the big bang theory", 15, true);
		    key.click_w_r_t_otherelement("NATIVE", "text=the big bang theory", "Down", "NATIVE", "id=card_preview_image");
		    //key.iselement_found_native("text=the one where no one proposes");
		    if(key.iselement_found_native("xpath=//*[contains(@text,'watch now')]")==true){
		    	key.waitforelement_native("id=cardmediasubitemvideo_imagepreview", 10000);
			    key.click_native("id=cardmediasubitemvideo_imagepreview");
			    
				//key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
				key.waitforelement_native("text=good : stream online", 10000);
			    key.click_native("text=good : stream online");
				key.waitforelement_native("partial_text=Don't ask again", 30000);
				key.click_native("text=Don't ask again");
				key.click_native("text=Don't ask again");
				key.waitforelement_native("partial_text=continue", 30000);
				key.click_native("text=continue");
				key.sleep(50000);
				key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
				key.waitforelement_native("xpath=//*[@id='playpauseimage']", 10000);
				key.iselement_found_native("xpath=//*[@id='playpauseimage']");
				key.sent_text("{ESC}");
		    }else{
		    	key.waitforelement_native("xpath=//*[@text='starts from ₹ 349.0']", 10000);
			    key.click_native("xpath=//*[@text='starts from ₹ 349.0']");
			    key.waitforelement_native("xpath=//*[@id='purchasepackItem1_quality']", 10000);
			    key.click_native("xpath=//*[@id='purchasepackItem1_quality']");
			   key.waitforelement_native("xpath=//*[@text='Debit Card']", 10000);
			    key.click_native("xpath=//*[@text='Debit Card']");
			    String s=key.get_text("NATIVE","xpath=//*[@id='message']");
			    if(s.equalsIgnoreCase("Success")){
			    	System.out.println("subscription success with wallet account");
			    	key.waitforelement_native("id=cardmediasubitemvideo_imagepreview", 10000);
				    key.click_native("id=cardmediasubitemvideo_imagepreview");
				    key.waitforelement_native("text=good : stream online", 10000);
				    key.click_native("text=good : stream online");
				    
			        
					key.waitforelement_native("partial_text=Don't ask again", 30000);
					key.click_native("text=Don't ask again");
					//key.click_native("text=Don't ask again");
					key.click_native("text=continue");
					key.sleep(40000);
					key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
					key.waitforelement_native("xpath=//*[@id='playpauseimage']", 10000);
					key.iselement_found_native("xpath=//*[@id='playpauseimage']");
					 //client.sendText("{ESC}");
			        key.sent_text("{ESC}");
			    }else{
			    	System.out.println("Subscription is failed with wallet account");
			    	System.out.println("Unable to play content");
			    	key.sent_text("{ESC}");
			    }
			    
			    
		    }
		    
		    key.sleep(2000);
		    key.select_elements_from_list("text=logout"); 
		    key.click_native("text=logout");
		    key.app_close(constants.app_id);
		    key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
}
}