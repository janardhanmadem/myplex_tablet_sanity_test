package com.apalya.login;

import org.testng.annotations.Test;

import com.apalya.utils.constants;
import com.apalya.utils.keywords;
/**
*
*
*/
public class facebook_login {
 
 public static keywords key=null;
  @Test(groups = {"seetest"})
  public void testfacebook_login_scenario(){
	 
      //Deregestration success
      key=new keywords();
    //  key.client_deregistration("adb:SM-T805",constants.app_id);
    // key.client_deregistration("adb:SM-T805",constants.app_id);
     // key.sleep(3000);
    //  key.client_deregistration("adb:SM-T805",constants.app_id);
     // key.app_clear_data(constants.app_id);
      key.setup();
      key.open_app("adb:SM-T805", constants.app_id);
      //test case started
      key.waitforelement_native("id=fb", 30000);
      key.click_native("id=fb");
      key.sleep(5000);
      key.send_text_web("name=email", "exampleapalya@gmail.com");
      key.send_text_web("name=pass", "apalya01");
      key.click_web("name=login");
      key.sleep(4000);
      key.click_web("name=__CONFIRM__");
      key.sleep(4000);
      key.click_native("id=bottom_button_container_layout");
      key.iselement_found_native("text=Example Apalya");
      key.select_elements_from_list("text=logout");
      key.click_native("text=logout");
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

