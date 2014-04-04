package ca.cb.cc.cv.model;

public class NavDrawerItem {
    
    private String title;
    private int icon;
    private int count;
    private boolean isCounterVisible = false;
    
    
    
    
    public NavDrawerItem(String title, int icon) {
        this.title = title;
        this.icon = icon;
    }
    
    public NavDrawerItem(String title, int icon, boolean isCounterVisible, int count) {
        this.title = title;
        this.icon = icon;
        this.isCounterVisible = isCounterVisible;
        this.count = count;
    }
    
    
    
    
    public String getTitle() {
        return this.title;
    }
    
    public int getIcon() {
        return this.icon;
    }
    
    public boolean getCounterVisibility() {
        return this.isCounterVisible;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setIcon(int icon) {
        this.icon = icon;
    }
    
    public int getCount() {
    	return this.count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public void setCounterVisibility(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }
    
}