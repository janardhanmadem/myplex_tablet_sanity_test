package com.apalya.playcontent;

import org.testng.annotations.Test;

import com.apalya.utils.keywords;
/**
*
*
*/
public class livetv_play {
  public static keywords key=null;

 

  @Test(groups = {"seetest"})
  public void testlivetv_content_play(){
	//rf=new reusable_functions();
		
			//rf.normal_myplex_login();
			key=new keywords();
			//package <set your test package>;
			key.setup();
			key.open_app("adb:SM-T805","com.apalya.myplex/.LoginActivity");
			key.waitforelement_native("partial_text=live tv", 10000);
			key.click_native("text=live tv");
			key.swipe_while_not_found("Down","NATIVE", "text=big thrill", 15, true);
			key.click_w_r_t_otherelement("NATIVE", "text=big thrill", "Down", "NATIVE", "id=card_preview_image");
		    key.sleep(2000);
		    key.iselement_found_native("text=big thrill");
		    key.iselement_found_native("xpath=//*[contains(@text,'watch now')]");
		    key.waitforelement_native("id=cardmediasubitemvideo_imagepreview", 10000);
		    key.click_native("id=cardmediasubitemvideo_imagepreview");
		    key.sleep(40000);
			key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
			key.waitforelement_native("xpath=//*[@id='playpauseimage']", 10000);
			key.iselement_found_native("xpath=//*[@id='playpauseimage']");
			key.sent_text("{ESC}");
  }
     
}
