package ca.cb.cc.cv.model;
import java.util.Date;

public class CVListItem {
    
    private String title;
    private int preview;
    private Date date;

    public CVListItem(){}
     
    
    //video list item for each cv episode
    
    public CVListItem(String title, int preview, Date date){
        this.title = title;
        this.preview = preview;
        this.date = date;
    }
     
    public String getTitle(){
        return this.title;
    }
     
    public int getPreview(){
        return this.preview;
    }
     
    public Date getDate(){
        return this.date;
    }
     
    public void setTitle(String title){
        this.title = title;
    }
     
    public void setIcon(int preview){
        this.preview = preview;
    }
     
    public void setDate(Date date){
        this.date = date;
    }
}