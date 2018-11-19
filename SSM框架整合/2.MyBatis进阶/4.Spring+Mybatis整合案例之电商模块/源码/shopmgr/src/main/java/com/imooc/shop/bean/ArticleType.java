package com.imooc.shop.bean;

/**
 * ArticleType 数据传输类
 * @author xlei @qq 251425887 @tel 13352818008
 * @Email dlei0009@163.com
 * @date 2018-11-19 09:41:26
 * @version 1.0
 */
public class ArticleType implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	private String code;
	private String name;
	private String remark;

	/** setter and getter method */
	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return this.code;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setRemark(String remark){
		this.remark = remark;
	}
	public String getRemark(){
		return this.remark;
	}


	@Override
	public String toString() {
		return "ArticleType{" +
				"code='" + code + '\'' +
				", name='" + name + '\'' +
				", remark='" + remark + '\'' +
				'}';
	}
}