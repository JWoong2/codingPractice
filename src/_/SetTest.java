package _;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Point {
	int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Point) {
			Point p = (Point) obj;
			return (x == p.x && y == p.y);
		} else return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(x,y);
	}
}

class Path {
	Point start;
	Point end;
	public Path(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Path) {
			Path p = (Path) obj;
			return start.x == p.start.x && start.y == p.start.y || end.x == p.start.x && end.y == p.start.y;
		}
		return false;
	}
}

public class SetTest {
	public static void main(String[] args) {
		Set<Point> set = new HashSet<Point>();
		set.add(new Point(1,2));
		set.add(new Point(1,2));
	
		Iterator<Point> it = set.iterator();
		
		while(it.hasNext()) {
			Point temp = it.next();
			System.out.println(temp.x + " " + temp.y);
		}
	}
}
