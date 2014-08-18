package com.apalya.favorites;



import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;

import org.testng.annotations.Test;
public class livetv_favorities {   
public static keywords key=null;
public static reusable_functions rf=null;

	    @Test(groups = {"seetest"})
	    public void set_favorites_livetv(){
	    	rf=new reusable_functions();
	    	key=new keywords();
	    	rf.normal_myplex_login();
	    	key.click_native("text=live tv");
	        key.sleep(3000);
	        key.waitforelement_native("partial_text=+", 30000);
	        key.sleep(3000);
	        key.waitforelement_native("partial_text=in fashion", 30000);
	      	key.iselement_found_native("text=in fashion");
	        key.click_native("xpath=//*[@text='+' and @id='card_title_fav' and ../self::*[../*[./*[@text='in fashion']]]]");
	        key.sleep(2000);
	        key.click_native("text=favourites");
	        key.click_native("text=favourites");
	        key.sleep(3000);
	        key.iselement_found_native("text=in fashion");
	        
	    }
	  

		       @Test(groups = {"seetest"})
		       public void unset_favorite_livetv(){
		          key.click_native("text=favourites");
		          key.click_native("text=favourites");
		          key.iselement_found_native( "text=in fashion");
		          key.click_native("xpath=//*[@text='+' and @id='card_title_fav' and ../self::*[../*[./*[@text='in fashion']]]]");
		          key.click_native("text=favourites");
		          key.click_native("text=favourites");
		          key.sleep(3000);
		          key.iselement_not_found_native("text=in fashion");
		          key.sent_text("{ESC}");
		          key.select_elements_from_list("text=logout"); 
		          key.click_native("text=logout");
		          key.app_close(constants.app_id); 
		      	key.sent_text("{ESC}");
		      	key.sent_text("{ESC}");
		      	key.sent_text("{ESC}");
		       }
		      
		   

	   }
	    
	
	


