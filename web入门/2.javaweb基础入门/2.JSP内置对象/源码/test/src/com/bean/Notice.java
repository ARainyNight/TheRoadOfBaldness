package com.bean;

public class Notice {

    private String tiaccount ;
    private String title ;
    private String context ;

    public Notice(String tiaccount, String title, String context) {
        this.tiaccount = tiaccount;
        this.title = title;
        this.context = context;
    }

    public String getTiaccount() {
        return tiaccount;
    }

    public void setTiaccount(String tiaccount) {
        this.tiaccount = tiaccount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
