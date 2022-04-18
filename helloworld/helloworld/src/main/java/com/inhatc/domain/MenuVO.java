package com.inhatc.domain;

public class MenuVO {
	private int menuId;
	private String menuKind;
	private String menuName;
	private int menuPrice;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuKind() {
		return menuKind;
	}
	public void setMenuKind(String menuKind) {
		this.menuKind = menuKind;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuPrice() {
		return menuPrice;
	}
	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	
	@Override
	public String toString() {
		return "MenuVO [menuId=" + menuId + ", menuKind=" + menuKind + ", menuName=" + menuName + ", menuPrice="
				+ menuPrice + "]";
	}
	public MenuVO(int menuId, String menuKind, String menuName, int menuPrice) {
		super();
		this.menuId = menuId;
		this.menuKind = menuKind;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	public MenuVO() {
		super();
	}
}
