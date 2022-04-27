package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor; //private으로 하면 자손 클래스에서 사용이 안된다.
	protected String lineColor; //private으로 쓰고 싶을 때에는 자손클래스에서 get.으로 사용하면 된다.
	
	//생성자
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public Shape() {
		//생성자 중복오류 해결
	}
	
	//메소드 gs - setter 정의되지 않으면 ShapeApp에서 set메소드를 쓸수가 없다 /
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
}

