package com.apalya.comments;

import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;

@Test
public class livetv_comments {
      public static keywords key=null;
      public static reusable_functions rf=null;
	public void comments_posting(){
		rf=new reusable_functions();
		key=new keywords();
		rf.normal_myplex_login();
		key.click_native("text=live tv");
		key.waitforelement_native("xpath=(//*[@id='card_preview_image'])[3]", 30000);
	    key.click_native("xpath=(//*[@id='card_preview_image'])[3]");
	    key.waitforelement_native( "partial_text=add a comment", 10000);
	    key.click_native("text=add a comment");
	    key.sleep(1000);
	    key.sent_text("good tv");   
	    key.click_native("text=ok");
	    key.waitforelement_native("partial_text=exampleapalya", 30000);    
	    key.iselement_found_native("text=exampleapalya");
	    key.iselement_found_native("text=good tv");
	    key.sent_text("{ESC}");
	    key.sleep(2000);
	    key.select_elements_from_list("text=logout"); 
	    key.click_native("text=logout");
	    key.app_close(constants.app_id);
	    key.sent_text("{ESC}");
    	key.sent_text("{ESC}");
    	key.sent_text("{ESC}");
	}
}
