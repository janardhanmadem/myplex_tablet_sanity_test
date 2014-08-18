package com.apalya.signup;

import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;

public class signup {
  

  
public static keywords key=null;
  @Test(groups = {"seetest"})
  public void testsignup_myplex(){
     
      //Client De-registartion
      key=new keywords();
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.sleep(3000);
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.sleep(3000);
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.app_clear_data(constants.app_id);
     //Test case started
      key.setup();
      key.open_app("adb:SM-T805", constants.app_id); 
      key.click_native("text=join myplex");
      String email=Math.random()+"@gmail.com";
      System.out.println("email is :" + email);
      key.send_text_native("xpath=//*[@id='editEmail']", email);
      key.click_native("hint=password");
      key.send_text_native("hint=password", "apalya01");
      key.waitforelement_native( "partial_text=join myplex", 30000);
      key.click_native("text=join myplex");
      key.waitforelement_native("partial_text=ok", 10000);
      key.click_native("text=ok");
     key.sleep(3000); 
     key.iselement_found_native("text="+email);
      
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
  


