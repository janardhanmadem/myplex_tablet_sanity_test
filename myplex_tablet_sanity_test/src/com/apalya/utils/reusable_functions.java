package com.apalya.utils;

//public class reusable_functions {
	
	
	//package <set your test package>;
	import com.experitest.client.*;
	/**
	 *
	 *
	*/
	public class  reusable_functions {
	   

	   public static keywords key=null;

	   
	    public  void normal_myplex_login(){
	        key=new keywords();
	    	key.setup();
	    	//key.app_clear_data("com.apalya.myplex/.LoginActivity");
	    	key.open_app("adb:SM-T805", "com.apalya.myplex/.LoginActivity");
	    	key.click_native("text=login to myplex");
	    	key.sleep(2000);
	   	    key.sent_text("exampleapalya@gmail.com");
	        key.waitforelement_native("hint=password:", 30000);
	     	key.click_native("hint=password:");
	        key.send_text_native("hint=password:", "apalya01");
	       	key.waitforelement_native("partial_text=login to myplex", 30000);
	       	key.click_native("text=login to myplex");
	       	key.sleep(5000);
	        key.waitforelement_native("partial_text=ok", 10000);
	        key.click_native("text=ok");
	       
	    }
	   
	}



