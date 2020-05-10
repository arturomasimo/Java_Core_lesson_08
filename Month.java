package lession8;

public enum Month {
    СІЧЕНЬ(Season.ЗИМА, 31), 
    ЛЮТИЙ(Season.ЗИМА, 28), 
    БЕРЕЗЕНЬ(Season.ВЕСНА, 31),
    КВІТЕНЬ(Season.ВЕСНА, 30), 
    ТРАВЕНЬ(Season.ВЕСНА, 31), 
    ЧЕРВЕНЬ(Season.ЛІТО, 30),
    ЛИПЕНЬ(Season.ЛІТО, 31), 
    СЕРПЕНЬ(Season.ЛІТО, 31), 
    ВЕРЕСЕНЬ(Season.ОСІНЬ, 30),
    ЖОВТЕНЬ(Season.ОСІНЬ, 31), 
    ЛИСТОПАД(Season.ОСІНЬ, 30), 
    ГРУДЕНЬ(Season.ЗИМА, 31);

	private Season season;
	private int days;
	private Month(Season season, int days) {
		this.season = season;
		this.days = days;
	}
	
	
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
}
