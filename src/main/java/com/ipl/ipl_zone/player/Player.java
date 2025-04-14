package com.ipl.ipl_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats")
public class Player {

    @Id
    @Column(name = "player", unique = true)
    private String player;

    private String country;
    private String team;
    private Integer age;
    private String captaincyExp;
    private String payingRole;

    private Integer mat;
    private Integer inns;
    private Integer runs;
    private Integer bf;
    private Integer hs;
    private String avg;
    private String sr;
    private Integer no;
    private Integer fours;
    private Integer sixes;
    private Integer zeros;
    private Integer fifties;
    private Integer hundreds;

    private Integer tMat;
    private Integer tInns;
    private Integer tRuns;
    private Integer tBF;
    private Integer tHS;
    private String tAvg;
    private String tSR;
    private Integer tNO;
    private Integer t4s;
    private Integer t6s;
    private Integer t0s;
    private Integer t50s;
    private Integer t100s;

    private Integer bInns;
    private Integer bBalls;
    private Integer bRuns;
    private Integer bMaidens;
    private Integer bWkts;
    private String bAvg;
    private String bEcon;
    private String bSR;
    private Integer b4w;
    private Integer b5w;

    private Integer bTInns;
    private Integer bTBalls;
    private Integer bTRuns;
    private Integer bTMaidens;
    private Integer bTWkts;
    private String bTAvg;
    private String bTEcon;
    private String bTSR;
    private Integer bT4w;
    private Integer bT5w;

    private Float soldPrice;

    public Player() {
    }

    public Player(String player, String country, String team, Integer age, String captaincyExp, String payingRole,
            Integer mat, Integer inns, Integer runs, Integer bf, Integer hs, String avg, String sr, Integer no,
            Integer fours, Integer sixes, Integer zeros, Integer fifties, Integer hundreds, Integer tMat, Integer tInns,
            Integer tRuns, Integer tBF, Integer tHS, String tAvg, String tSR, Integer tNO, Integer t4s, Integer t6s,
            Integer t0s, Integer t50s, Integer t100s, Integer bInns, Integer bBalls, Integer bRuns, Integer bMaidens,
            Integer bWkts, String bAvg, String bEcon, String bSR, Integer b4w, Integer b5w, Integer bTInns,
            Integer bTBalls, Integer bTRuns, Integer bTMaidens, Integer bTWkts, String bTAvg, String bTEcon,
            String bTSR,
            Integer bT4w, Integer bT5w, Float soldPrice) {
        this.player = player;
        this.country = country;
        this.team = team;
        this.age = age;
        this.captaincyExp = captaincyExp;
        this.payingRole = payingRole;
        this.mat = mat;
        this.inns = inns;
        this.runs = runs;
        this.bf = bf;
        this.hs = hs;
        this.avg = avg;
        this.sr = sr;
        this.no = no;
        this.fours = fours;
        this.sixes = sixes;
        this.zeros = zeros;
        this.fifties = fifties;
        this.hundreds = hundreds;
        this.tMat = tMat;
        this.tInns = tInns;
        this.tRuns = tRuns;
        this.tBF = tBF;
        this.tHS = tHS;
        this.tAvg = tAvg;
        this.tSR = tSR;
        this.tNO = tNO;
        this.t4s = t4s;
        this.t6s = t6s;
        this.t0s = t0s;
        this.t50s = t50s;
        this.t100s = t100s;
        this.bInns = bInns;
        this.bBalls = bBalls;
        this.bRuns = bRuns;
        this.bMaidens = bMaidens;
        this.bWkts = bWkts;
        this.bAvg = bAvg;
        this.bEcon = bEcon;
        this.bSR = bSR;
        this.b4w = b4w;
        this.b5w = b5w;
        this.bTInns = bTInns;
        this.bTBalls = bTBalls;
        this.bTRuns = bTRuns;
        this.bTMaidens = bTMaidens;
        this.bTWkts = bTWkts;
        this.bTAvg = bTAvg;
        this.bTEcon = bTEcon;
        this.bTSR = bTSR;
        this.bT4w = bT4w;
        this.bT5w = bT5w;
        this.soldPrice = soldPrice;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCaptaincyExp() {
        return captaincyExp;
    }

    public void setCaptaincyExp(String captaincyExp) {
        this.captaincyExp = captaincyExp;
    }

    public String getPayingRole() {
        return payingRole;
    }

    public void setPayingRole(String payingRole) {
        this.payingRole = payingRole;
    }

    public Integer getMat() {
        return mat;
    }

    public void setMat(Integer mat) {
        this.mat = mat;
    }

    public Integer getInns() {
        return inns;
    }

    public void setInns(Integer inns) {
        this.inns = inns;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getBf() {
        return bf;
    }

    public void setBf(Integer bf) {
        this.bf = bf;
    }

    public Integer getHs() {
        return hs;
    }

    public void setHs(Integer hs) {
        this.hs = hs;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getFours() {
        return fours;
    }

    public void setFours(Integer fours) {
        this.fours = fours;
    }

    public Integer getSixes() {
        return sixes;
    }

    public void setSixes(Integer sixes) {
        this.sixes = sixes;
    }

    public Integer getZeros() {
        return zeros;
    }

    public void setZeros(Integer zeros) {
        this.zeros = zeros;
    }

    public Integer getFifties() {
        return fifties;
    }

    public void setFifties(Integer fifties) {
        this.fifties = fifties;
    }

    public Integer getHundreds() {
        return hundreds;
    }

    public void setHundreds(Integer hundreds) {
        this.hundreds = hundreds;
    }

    public Integer gettMat() {
        return tMat;
    }

    public void settMat(Integer tMat) {
        this.tMat = tMat;
    }

    public Integer gettInns() {
        return tInns;
    }

    public void settInns(Integer tInns) {
        this.tInns = tInns;
    }

    public Integer gettRuns() {
        return tRuns;
    }

    public void settRuns(Integer tRuns) {
        this.tRuns = tRuns;
    }

    public Integer gettBF() {
        return tBF;
    }

    public void settBF(Integer tBF) {
        this.tBF = tBF;
    }

    public Integer gettHS() {
        return tHS;
    }

    public void settHS(Integer tHS) {
        this.tHS = tHS;
    }

    public String gettAvg() {
        return tAvg;
    }

    public void settAvg(String tAvg) {
        this.tAvg = tAvg;
    }

    public String gettSR() {
        return tSR;
    }

    public void settSR(String tSR) {
        this.tSR = tSR;
    }

    public Integer gettNO() {
        return tNO;
    }

    public void settNO(Integer tNO) {
        this.tNO = tNO;
    }

    public Integer getT4s() {
        return t4s;
    }

    public void setT4s(Integer t4s) {
        this.t4s = t4s;
    }

    public Integer getT6s() {
        return t6s;
    }

    public void setT6s(Integer t6s) {
        this.t6s = t6s;
    }

    public Integer getT0s() {
        return t0s;
    }

    public void setT0s(Integer t0s) {
        this.t0s = t0s;
    }

    public Integer getT50s() {
        return t50s;
    }

    public void setT50s(Integer t50s) {
        this.t50s = t50s;
    }

    public Integer getT100s() {
        return t100s;
    }

    public void setT100s(Integer t100s) {
        this.t100s = t100s;
    }

    public Integer getbInns() {
        return bInns;
    }

    public void setbInns(Integer bInns) {
        this.bInns = bInns;
    }

    public Integer getbBalls() {
        return bBalls;
    }

    public void setbBalls(Integer bBalls) {
        this.bBalls = bBalls;
    }

    public Integer getbRuns() {
        return bRuns;
    }

    public void setbRuns(Integer bRuns) {
        this.bRuns = bRuns;
    }

    public Integer getbMaidens() {
        return bMaidens;
    }

    public void setbMaidens(Integer bMaidens) {
        this.bMaidens = bMaidens;
    }

    public Integer getbWkts() {
        return bWkts;
    }

    public void setbWkts(Integer bWkts) {
        this.bWkts = bWkts;
    }

    public String getbAvg() {
        return bAvg;
    }

    public void setbAvg(String bAvg) {
        this.bAvg = bAvg;
    }

    public String getbEcon() {
        return bEcon;
    }

    public void setbEcon(String bEcon) {
        this.bEcon = bEcon;
    }

    public String getbSR() {
        return bSR;
    }

    public void setbSR(String bSR) {
        this.bSR = bSR;
    }

    public Integer getB4w() {
        return b4w;
    }

    public void setB4w(Integer b4w) {
        this.b4w = b4w;
    }

    public Integer getB5w() {
        return b5w;
    }

    public void setB5w(Integer b5w) {
        this.b5w = b5w;
    }

    public Integer getbTInns() {
        return bTInns;
    }

    public void setbTInns(Integer bTInns) {
        this.bTInns = bTInns;
    }

    public Integer getbTBalls() {
        return bTBalls;
    }

    public void setbTBalls(Integer bTBalls) {
        this.bTBalls = bTBalls;
    }

    public Integer getbTRuns() {
        return bTRuns;
    }

    public void setbTRuns(Integer bTRuns) {
        this.bTRuns = bTRuns;
    }

    public Integer getbTMaidens() {
        return bTMaidens;
    }

    public void setbTMaidens(Integer bTMaidens) {
        this.bTMaidens = bTMaidens;
    }

    public Integer getbTWkts() {
        return bTWkts;
    }

    public void setbTWkts(Integer bTWkts) {
        this.bTWkts = bTWkts;
    }

    public String getbTAvg() {
        return bTAvg;
    }

    public void setbTAvg(String bTAvg) {
        this.bTAvg = bTAvg;
    }

    public String getbTEcon() {
        return bTEcon;
    }

    public void setbTEcon(String bTEcon) {
        this.bTEcon = bTEcon;
    }

    public String getbTSR() {
        return bTSR;
    }

    public void setbTSR(String bTSR) {
        this.bTSR = bTSR;
    }

    public Integer getbT4w() {
        return bT4w;
    }

    public void setbT4w(Integer bT4w) {
        this.bT4w = bT4w;
    }

    public Integer getbT5w() {
        return bT5w;
    }

    public void setbT5w(Integer bT5w) {
        this.bT5w = bT5w;
    }

    public Float getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(Float soldPrice) {
        if (soldPrice == null || soldPrice < 0) {
            throw new IllegalArgumentException("Sold price cannot be negative");
        }
        this.soldPrice = soldPrice;
    }
}
