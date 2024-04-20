package common;

public enum WKD_EGVN {
	
	// SUNDAY --> WKD_EGVN SUNDAY = new WKD_EGVN();
	// SUNDAY("Chủ Nhật") --> WKD_EGVN SUNDAY = new WKD_EGVN("Chủ Nhật");
	
	SUNDAY("Chủ Nhật"),
	MONDAY("Thứ Hai"),
	TUESDAY("Thứ Ba"),
	WEDNESDAY("Thứ Tư"),
	THURSDAY("Thứ Năm"),
	FRIDAY("Thứ Sáu"),
	SATURDAY("Thứ Bảy");
	
	private String vnText;
	
	WKD_EGVN(String vnText) {
		this.vnText = vnText;
	}
	
	public String getVnText() {
		return vnText;
	}
	
}
