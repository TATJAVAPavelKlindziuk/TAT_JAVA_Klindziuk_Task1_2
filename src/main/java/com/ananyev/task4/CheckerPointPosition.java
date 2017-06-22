package com.ananyev.task4;

public class CheckerPointPosition {
	public static final long serialVersionUID = 42L;

	public boolean checkPosition(Point point) {
		return (checkFirstArea(point) || checkSecondArea(point));
	}

	protected boolean checkSecondArea(Point point) {
		int x = point.getX();
		int y = point.getY();
		return (x >= -4 && x <= 4 && y >= -3 && y <= 0);
	}

	protected boolean checkFirstArea(Point point) {
		int x = point.getX();
		int y = point.getY();
		return (y <= 4 && y > 0 - 3 && x <= 2 && x >= -2);
	}

}
