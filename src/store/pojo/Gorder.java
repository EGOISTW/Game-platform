package store.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Gorder {
    private BigDecimal oId;

    private BigDecimal userId;

    private BigDecimal gameId;

    private BigDecimal oTotalprice;

    private Short oStatus;

    private Date oTime;

    private BigDecimal oGroup;

    public BigDecimal getoId() {
        return oId;
    }

    public void setoId(BigDecimal oId) {
        this.oId = oId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getGameId() {
        return gameId;
    }

    public void setGameId(BigDecimal gameId) {
        this.gameId = gameId;
    }

    public BigDecimal getoTotalprice() {
        return oTotalprice;
    }

    public void setoTotalprice(BigDecimal oTotalprice) {
        this.oTotalprice = oTotalprice;
    }

    public Short getoStatus() {
        return oStatus;
    }

    public void setoStatus(Short oStatus) {
        this.oStatus = oStatus;
    }

    public Date getoTime() {
        return oTime;
    }

    public void setoTime(Date oTime) {
        this.oTime = oTime;
    }

    public BigDecimal getoGroup() {
        return oGroup;
    }

    public void setoGroup(BigDecimal oGroup) {
        this.oGroup = oGroup;
    }
}