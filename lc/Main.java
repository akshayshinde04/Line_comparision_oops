package com.bl.lc;

public class Main {
		public static void main(String[] args) {
			Point p1 = new Point();
			p1.x = 5;
			p1.y = 4;
			Point p2 = new Point ();
			p2.x = 6;
			p2.y = 9;
			
			Line l1 = new Line();
			l1.p1 = p1;
			l1.p2 = p2;
			float length = l1.lineLength();
			System.out.println("length is "+ length);
		}
	}

