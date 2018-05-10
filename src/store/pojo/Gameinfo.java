package store.pojo;


import java.util.Date;

public class Gameinfo {
    private Integer gId;

    private String gName;

    private String gPhoto;

    private String gContext;

    private String gPublisher;

    private int gStatus;

    private Date publishDate;
    
    private double gPrice;
    
    

    public double getgPrice() {
		return gPrice;
	}

	public void setgPrice(double gPrice) {
		this.gPrice = gPrice;
	}

	public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgPhoto() {
        return gPhoto;
    }

    public void setgPhoto(String gPhoto) {
        this.gPhoto = gPhoto == null ? null : gPhoto.trim();
    }

    public String getgContext() {
        return gContext;
    }

    public void setgContext(String gContext) {
        this.gContext = gContext == null ? null : gContext.trim();
    }

    public String getgPublisher() {
        return gPublisher;
    }

    public void setgPublisher(String gPublisher) {
        this.gPublisher = gPublisher == null ? null : gPublisher.trim();
    }

    public int getgStatus() {
        return gStatus;
    }

    public void setgStatus(int i) {
        this.gStatus = i;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}