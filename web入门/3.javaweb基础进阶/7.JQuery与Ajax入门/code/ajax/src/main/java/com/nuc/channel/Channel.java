package com.nuc.channel;

/***
 *  ClassName : Channel
 *  Author    : lin
 *  Date      : 2019/4/14 17:37    
 *  Remark    : 
 */

public class Channel {

    private String code;
    private String name;

    public Channel() {

    }

    public Channel(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
