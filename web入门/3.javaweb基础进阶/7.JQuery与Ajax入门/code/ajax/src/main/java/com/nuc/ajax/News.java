package com.nuc.ajax;

/***
 *  ClassName : News
 *  Author    : lin
 *  Date      : 2019/4/13 22:02    
 *  Remark    : 
 */

public class News {

    private String title ;
    private String date ;
    private String source;
    private String content;

    public News(String title, String date, String source, String content) {
        this.title = title;
        this.date = date;
        this.source = source;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
