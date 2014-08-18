package com.apalya.search;
import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;

public class normal_search_tags {

    public static keywords key=null;
    public static reusable_functions rf=null;
	@Test(groups = {"seetest"})
	    public void testnormal_search(){
	    	rf = new reusable_functions();
	    	key = new keywords();
	    	rf.normal_myplex_login();
	    	key.waitforelement_native("text=search …", 10000);
	        key.click_native("text=search …");
	    	key.search_element_w_r_t_other_element("TEXT", "trending", "Down", "TEXT", "the lego movie");
	       	key.click_native("text=the lego movie");
	        key.sleep(5000);
	        key.iselement_found_native("xpath=//*[@id='card_title_layout' and ./*[@text='the lego movie']]");
	      	key.click_native("id=tablayoutchanger");
	    	key.sleep(4000);
	       	key.waitforelement_native("partial_text=movies", 10000);
	     	key.click_native("text=movies");
	     	
		    key.select_elements_from_list("text=logout"); 
		    key.click_native("text=logout");
		    key.app_close(constants.app_id);
		    key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.sent_text("{ESC}");
	    	key.app_clear_data(constants.app_id);
}
	       
	    }
	   
	


