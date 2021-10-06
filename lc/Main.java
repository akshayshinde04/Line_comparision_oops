package com.bl.lc;

public class Main {
		public static void main(String[] args) {
			Point p1 = new Point();
			p1.x = 5;
			p1.y = 4;
			Point p2 = new Point();
			p2.x = 6;
			p2.y = 9;
			Point p3 = new Point();
			p3.x = 9;
			p3.y = 8;
			Point p4 = new Point();
			p4.x = 6;
			p4.y = 5;
			Line l1 = new Line();
			l1.p1 = p1;
			l1.p2 = p2;
			Line l2 = new Line();
			l2.p1 = p3;
			l2.p2 = p4;
			float length1 = l1.lineLength();
			System.out.println("length is "+ length1);
			float length2 = l2.lineLength();
			System.out.println("length is "+ length2);
			String lineEqual = Line.lineEqual(length1, length2);
		        System.out.println(lineEqual);
		}
	}

