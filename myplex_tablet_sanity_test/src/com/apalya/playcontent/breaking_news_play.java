package com.apalya.playcontent;

import org.testng.annotations.Test;

import com.apalya.utils.keywords;

public class breaking_news_play {
	
	public static keywords key=null;
	@Test
	public void breaking_new_play(){
	//rf=new reusable_functions();
	
			//rf.normal_myplex_login();
			key=new keywords();
			//package <set your test package>;
			key.setup();
			key.open_app("adb:SM-T805","com.apalya.myplex/.LoginActivity");
			key.select_elements_from_list("text=breaking news"); 
		    //key.click_native("text=logout");
			//key.waitforelement_native("partial_text=breaking news", 10000);
			key.click_native("text=breaking news");
			key.waitforelement_native("xpath=//*[@text='▶']", 30000);
			key.click_native("xpath=//*[@text='▶']");
			key.waitforelement_native("xpath=(//*[@class='android.widget.FrameLayout'])[5]", 30000);
			key.iselement_found_native("xpath=//*[@class='android.widget.ImageView']");
			key.sent_text("{ESC}");
			
}}