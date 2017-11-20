package net.davidtanzer;

public enum Weekday {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, 
	FRIDAY {
		@Override
		public int discount() {
			return 10;
		}
	}, SATURDAY {
		@Override
		public int discount() {
			return 20;
		}
	}, SUNDAY;

	public boolean isWorkingDay() {
		return this != SUNDAY;
	}

	public int discount() {
		return 0;
	}
}
