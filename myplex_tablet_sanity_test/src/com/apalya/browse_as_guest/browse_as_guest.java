package com.apalya.browse_as_guest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;

public class browse_as_guest {
 
  public static keywords key=null;

  @BeforeTest

  public void before_test(){
	  key=new keywords();
	  key.setup();
  }

  @Test(groups = {"seetest"})
  public void browse_as_a_guest_scenario(){
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.sleep(3000);
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.app_clear_data(constants.app_id);
     
      //test case execution started
      key.open_app("adb:SM-T805","com.apalya.myplex/.LoginActivity");
      key.waitforelement_native("partial_text=browse as guest",120000);
      key.click_native("text=browse as guest");
      key.iselement_found_native("text=sign into myplex");
      key.click_native("text=sign into myplex");
      key.waitforelement_native("partial_text=live tv",30000);
      key.click_native("text=live tv");
      key.waitforelement_native("xpath=(//*[@id='card_preview_image'])[1]", 10000);
      key.click_native("xpath=(//*[@id='card_preview_image'])[1]");
      key.waitforelement_native("id=cardmediasubitemvideo_imagepreview", 10000);
      key.click_native("id=cardmediasubitemvideo_imagepreview");
      key.iselement_found_native("text=login to play");
      key.click_native("text=login to play");
      key.waitforelement_native("partial_text=join myplex", 30000);
      key.click_native("text=join myplex");
      key.sleep(3000);
      key.send_text_native("xpath=//*[@id='editEmail']", "exampleapalya@gmail.com");
      key.waitforelement_native("id=imageView1", 10000);
      key.click_native("id=imageView1");
      key.click_native("hint=password");
      key.send_text_native("hint=password", "apalya01");
      key.waitforelement_native("partial_text=join myplex", 30000);
      key.click_native("text=join myplex");
      key.waitforelement_native("partial_text=Login with myplex", 10000);
      key.click_native("text=Login with myplex");
      key.waitforelement_native( "partial_text=login to myplex", 10000);
      key.click_native("text=login to myplex");
      key.sleep(2000);  
      key.waitforelement_native("hint=e-mail address", 10000);
      key.send_text_native("xpath=//*[@id='loginEmail']", "exampleapalya@gmail.com");
      key.waitforelement_native("hint=password:", 10000);
      key.send_text_native("hint=password:", "apalya01");
      key.waitforelement_native("partial_text=login to myplex", 30000);
      key.click_native("text=login to myplex");
      key.iselement_found_native("text=exampleapalya@gmail.com");
      key.select_elements_from_list("text=logout"); 
      key.click_native("text=logout");  
      key.app_close("com.apalya.myplex/.LoginActivity"); 
    	key.sent_text("{ESC}");
    	key.sent_text("{ESC}");
    	key.sent_text("{ESC}");
    	key.sent_text("{ESC}");
      }
 
}

