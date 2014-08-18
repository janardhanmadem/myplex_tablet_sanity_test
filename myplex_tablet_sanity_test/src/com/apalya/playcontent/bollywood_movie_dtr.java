package com.apalya.playcontent;

import java.util.Map;

import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.apalya.utils.reusable_functions;
import com.experitest.client.Client;

public class bollywood_movie_dtr {
	public static reusable_functions rf=null;
    public static keywords key=null;
   
    
    @Test
	public void content_play(){
		rf=new reusable_functions();
		
		rf.normal_myplex_login();
		key=new keywords();
		
		key.select_elements_from_list("text=settings");
		key.click_native("text=settings");
		
		key.sleep(2000);
		key.waitforelement_native("xpath=//*[@text='movie rental options: 		always ask']", 10000);
		key.click_native("xpath=//*[@text='movie rental options: 		always ask']");
	       
		key.waitforelement_native("partial_text=always ask", 10000);
		key.click_native("text=always ask");
		key.waitforelement_native("text=continue", 10000);
		key.click_native("text=continue");
		
	      
		key.waitforelement_native("text=movies", 10000);
		key.click_native("text=movies");
		key.swipe_while_not_found("Down","NATIVE", "text=ramayana: the epic", 15, true);
		
	    //key.click_w_r_t_otherelement("NATIVE", "text=ramayana: the epic", "Down", "NATIVE", "id=card_preview_image");
	    if(key.waitforelement_native("xpath=//*[@id='carddetailtablet_videolayout']", 10000)==false){
			  key.click_w_r_t_otherelement("NATIVE", "text=ramayana: the epic", "Down", "NATIVE", "id=card_preview_image");
		  }
		  key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
	    key.sleep(2000);
	    key.iselement_found_native("xpath=//*[@text='ramayana: the epic']");
	    key.iselement_found_native("xpath=//*[contains(@text,'watch now')]");
	    key.waitforelement_native("xpath=//*[@id='carddetailtablet_videolayout']", 10000);
	    key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
	    key.waitforelement_native("xpath=//*[@text='good : stream online']", 10000);
	    key.click_native("id=good_radio_btn");
	    key.waitforelement_native("partial_text=Don't ask again", 30000);
		//key.click_native("text=Don't ask again");
		//key.click_native("text=Don't ask again");
		key.click_native("xpath=//*[@text='continue']");
		key.sleep(40000);
		key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
		key.waitforelement_native("xpath=//*[@id='playpauseimage']", 10000);
		key.iselement_found_native("xpath=//*[@id='playpauseimage']");
        //client.sendText("{ESC}");
        key.sent_text("{ESC}");
        key.sleep(20000);
		    

		   
		     
		       
		   
		}

		
		
	}

