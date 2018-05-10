package store.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Gcar {
    private int cId;

    private int userId;

    private int gameId;

    private String gameName;

    private double cPrice;

    private String cGamephoto;

    private Date cTime;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public double getcPrice() {
        return cPrice;
    }

    public void setcPrice(double gPrice) {
        this.cPrice = gPrice;
    }

    public String getcGamephoto() {
        return cGamephoto;
    }

    public void setcGamephoto(String cGamephoto) {
        this.cGamephoto = cGamephoto == null ? null : cGamephoto.trim();
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}