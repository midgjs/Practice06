package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	
    public void execute(String str){
        
        if(str.equals("앱")) {
        	playApp();
        } else if(str.equals("음악")) {
        	playMusic(); //생략가능
        } else {
            super.execute(str);
        }
        
        
    }
 
    //메소드작성
    
    //메소드작성
    
    public void playApp() {
    	System.out.println("앱실행");
    }
    
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
}
