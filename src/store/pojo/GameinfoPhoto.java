package store.pojo;



public class GameinfoPhoto {
    private int pId;

    private Integer gameId;

    private String smallA;

    private String smallB;

    private String smallC;

    private String smallD;

    private String smallE;

    private String bigA;

    private String bigB;

    private String bigC;

    private String bigD;

    private String bigE;

    private String pHeader;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getSmallA() {
        return smallA;
    }

    public void setSmallA(String smallA) {
        this.smallA = smallA == null ? null : smallA.trim();
    }

    public String getSmallB() {
        return smallB;
    }

    public void setSmallB(String smallB) {
        this.smallB = smallB == null ? null : smallB.trim();
    }

    public String getSmallC() {
        return smallC;
    }

    public void setSmallC(String smallC) {
        this.smallC = smallC == null ? null : smallC.trim();
    }

    public String getSmallD() {
        return smallD;
    }

    public void setSmallD(String smallD) {
        this.smallD = smallD == null ? null : smallD.trim();
    }

    public String getSmallE() {
        return smallE;
    }

    public void setSmallE(String smallE) {
        this.smallE = smallE == null ? null : smallE.trim();
    }

    public String getBigA() {
        return bigA;
    }

    public void setBigA(String bigA) {
        this.bigA = bigA == null ? null : bigA.trim();
    }

    public String getBigB() {
        return bigB;
    }

    public void setBigB(String bigB) {
        this.bigB = bigB == null ? null : bigB.trim();
    }

    public String getBigC() {
        return bigC;
    }

    public void setBigC(String bigC) {
        this.bigC = bigC == null ? null : bigC.trim();
    }

    public String getBigD() {
        return bigD;
    }

    public void setBigD(String bigD) {
        this.bigD = bigD == null ? null : bigD.trim();
    }

    public String getBigE() {
        return bigE;
    }

    public void setBigE(String bigE) {
        this.bigE = bigE == null ? null : bigE.trim();
    }

    public String getpHeader() {
        return pHeader;
    }

    public void setpHeader(String pHeader) {
        this.pHeader = pHeader == null ? null : pHeader.trim();
    }
}