package com.apalya.playcontent;

import org.testng.annotations.Test;

import com.apalya.utils.keywords;

public class tvshow_trialer_play_check {
	public static keywords key=null;
	@Test
	public static void tv_show_trialer(){
		key=new keywords();
	 	key.setup();
		key.open_app("adb:SM-T805","com.apalya.myplex/.LoginActivity");
	     key.waitforelement_native("partial_text=movies", 30000);
	     key.click_native("text=tv shows");
	     key.sleep(2000);
	     key.click_native("xpath=//*[@id='card_preview_image' and ../*[./*[@text='the big bang theory']]]");
	     key.click_native("xpath=//*[@id='cardmediasubitemtrailer_play']");
	     key.sleep(20000);
		 key.click_native("xpath=//*[@id='carddetailtablet_videolayout']");
		key.waitforelement_native("xpath=//*[@id='playpauseimage']", 10000);
		key.iselement_found_native("xpath=//*[@id='playpauseimage']");
	     //client.sendText("{ESC}");
	     key.sent_text("{ESC}");
	     key.sleep(20000);
	}

}
