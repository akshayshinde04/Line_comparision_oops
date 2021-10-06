package com.bl.lc;

public class Line {
	Point p1;
	Point p2;
	 
	public float lineLength() {
    	return (float) Math.sqrt(Math.pow(p1.x-p2.x,2)+ Math.pow(p1.y-p2.y,2));
	}
	public static String lineEqual(float length1, float length2) {
		if (length1 == length2)
			return "Lines are equal";
		else if (length1 > length2)
			return "Line 1 is Greater than Line 2";
		else
			return "Line 2 is Greater than Line 1";
	}
}



