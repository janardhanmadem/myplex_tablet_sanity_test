package com.apalya.favorites;


import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;

import org.testng.annotations.Test;
public class hollywood_movies_favorities {   
public static keywords key=null;
public static reusable_functions rf=null;

	    @Test(groups = {"seetest"})
	    public void set_favorites_movies(){
	    	rf=new reusable_functions();
	    	key=new keywords();
	    	rf.normal_myplex_login();
	    	key.waitforelement_native("partial_text=movies", 30000);
	    	key.click_native("text=movies");
	        key.sleep(3000);
	        key.waitforelement_native("partial_text=+", 30000);
	        key.sleep(3000);
	        key.waitforelement_native("partial_text=the lego movie", 30000);
	        //key.iselement_found_native("partial_text=the lego movie");
	      	key.iselement_found_native("text=the lego movie");
	        key.click_native("xpath=//*[@text='+' and @id='card_title_fav' and ../self::*[../*[./*[@text='the lego movie']]]]");
	        key.sleep(2000);
	        key.click_native("text=favourites");
	        key.click_native("text=favourites");
	        key.sleep(3000);
	        key.iselement_found_native("text=the lego movie");
	        
	    }
	  

		       @Test(groups = {"seetest"})
		       public void unset_favorite_movie(){
		          key.click_native("text=favourites");
		          key.click_native("text=favourites");
		          key.iselement_found_native( "text=the lego movie");
		          key.click_native("xpath=//*[@text='+' and @id='card_title_fav' and ../self::*[../*[./*[@text='the lego movie']]]]");
		          key.click_native("text=favourites");
		          key.click_native("text=favourites");
		          key.sleep(3000);
		          key.iselement_not_found_native("text=the lego movie");
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
	    
	
	


