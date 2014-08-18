package com.apalya.reviews;

import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;

public class movies_review {
	 public static reusable_functions rf=null;
	   public static keywords key=null;

	    @Test(groups = {"seetest"})
	    public void testreviews_livetv(){
	        rf=new reusable_functions();
	    	rf.normal_myplex_login();
	    	key=new keywords();
	        key.waitforelement_native("partial_text=movies", 30000);
	        key.click_native("text=movies");
	        key.iselement_found_native("text=the lego movie");
	        key.click_native("xpath=(//*[@id='card_preview_image'])[2]"); 
	        key.iselement_found_native("text=reviews");
	        key.click_native("xpath=//*[@text='reviews']");
	        key.click_native("xpath=//*[@text='add a review']");
	        key.sent_text("nice movie");
	        key.sleep(2000); 
	        key.sent_text("{ESC}");
	        key.click_native("xpath=//*[@text='ok']");
	        key.search_element_w_r_t_other_element("TEXT", "exampleapalya", "Down", "TEXT", "nice movie");
	        key.waitforelement_native("partial_text=add a review", 10000);
	        key.click_native("xpath=//*[@text='reviews']");
	        key.click_native("xpath=//*[@text='add a review']");
	        key.sent_text("good movie");
	        key.sent_text("{ESC}");
	        key.click_native("text=ok");
	        key.search_element_w_r_t_other_element("TEXT", "exampleapalya","Down", "TEXT", "good movie");
	        key.sent_text("{ESC}");
	        key.select_elements_from_list("text=logout"); 
	        key.click_native("text=logout");
	        key.app_close("com.apalya.myplex/.LoginActivity");
	        
	        key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.app_clear_data(constants.app_id);
	        //key.app_close("com.apalya.myplex/.LoginActivity");
	       // key.sleep(3000);
	    }
	    
}
