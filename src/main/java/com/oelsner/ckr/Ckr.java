package com.oelsner.ckr;

public class Ckr {

    private long ckrNum;
    private long ckrRun;

    public Ckr() {

    }

    public Ckr(long ckrNum, long ckrRun) {
        this.ckrNum = ckrNum;
        this.ckrRun = ckrRun;
    }


    public long getCkrNum() {
        return ckrNum;
    }

    public void setCkrNum(long ckrNum) {
        this.ckrNum = ckrNum;
    }

    public long getCkrRun() {
        return ckrRun;
    }

    public void setCkrRun(long ckrRun) {
        this.ckrRun = ckrRun;
    }

    @Override
    public String toString() {
        return "Ckr{" +
                "ckrNum=" + ckrNum +
                ", ckrRun=" + ckrRun +
                '}';
    }

}
