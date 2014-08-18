package com.apalya.login;

//package <set your test package>;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
import com.experitest.client.*;
/**
*
*
*/
public class myplex_login_test {
 

public static keywords key=null;
  @Test(groups = {"seetest"})
  public void testmyplex_login_scenario(){
      //drevice de regestration
      key=new keywords();
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.sleep(3000);
      key.client_deregistration("adb:SM-T805",constants.app_id);
      key.app_clear_data(constants.app_id);
      //test case started
      key.setup();
      key.open_app("adb:SM-T805", constants.app_id);
     key.sleep(1000);
     key.waitforelement_native("xpath=//*[@text='login to myplex']", 30000);
     key.click_native("text=login to myplex");
     key.sleep(2000); 
     key.send_text_native("id=loginEmail", "exampleapalya@gmail.com"); 
     key.click_native("hint=password:"); 
     key.click_native("hint=password:"); 
     key.send_text_native("hint=password:", "apalya01"); 
     key.waitforelement_native("text=login to myplex", 30000);
     key.click_native("text=login to myplex");
     key.sleep(5000);
     key.click_native("id=bottom_button_container_layout");
     key.iselement_found_native("text=exampleapalya@gmail.com");
     key.select_elements_from_list("text=logout"); 
     key.click_native("text=logout"); 
     key.sleep(3000);
   //de-regestration for next test cases.
     key.client_deregistration("adb:SM-T805",constants.app_id);
     key.client_deregistration("adb:SM-T805",constants.app_id);
     key.app_close(constants.app_id);
     key.sent_text("{ESC}");
 	key.sent_text("{ESC}");
 	key.sent_text("{ESC}");
 	key.sent_text("{ESC}");
  }
 
}

