package 프로그래머스_스쿨.파트1.방문길이;

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

	public Point move(int dx, int dy) {
		return new Point(x + dx, y + dy);
	}

	public boolean isAvailable() {
		return -5 <= x && x <= 5 && -5 <= y && y <= 5;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point p = (Point) obj;
		return x == p.x && y == p.y;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(x,y);
	}
}

class Path {
	Point start, end;

	public Path(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Path p = (Path) obj;
		return start.equals(p.start) && end.equals(p.end) ||
				(start.equals(p.end) && end.equals(p.start));
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return start.hashCode() + end.hashCode();
	}
}

class Solution {
	public static void main(String[] args) {
		int ans = solution("ULURRDLLU");
		System.out.println(ans);
	}

	public static int solution(String dirs) {
		Set<Path> routes = new HashSet<Path>();
		Point start = new Point(0, 0);

		for (char c : dirs.toCharArray()) {
			Point end = null;
			switch (c) {
			case 'U':
				end = start.move(1, 0);
				break;
			case 'D':
				end = start.move(-1, 0);
				break;
			case 'L':
				end = start.move(0, -1);
				break;
			case 'R':
				end = start.move(0, 1);
				break;
			}

			if (end == null)
				continue;
			if (!end.isAvailable())
				continue;

			routes.add(new Path(start, end));
			start = end;
		}
		return routes.size();
	}
}