package com.oelsner.ckr;

public class CkrWithString {
    private String ckrNum;
    private String ckrRun;

    public CkrWithString() {

    }

    public CkrWithString(String ckrNum, String ckrRun) {
        this.ckrNum = ckrNum;
        this.ckrRun = ckrRun;
    }


    public String getCkrNum() {
        return ckrNum;
    }

    public void setCkrNum(String ckrNum) {
        this.ckrNum = ckrNum;
    }

    public String getCkrRun() {
        return ckrRun;
    }

    public void setCkrRun(String ckrRun) {
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
