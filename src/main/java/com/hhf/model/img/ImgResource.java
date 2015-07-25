package com.hhf.model.img;

import java.io.Serializable;

public class ImgResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2393850093336402555L;

	public ImgResource() {
	}

	public ImgResource(String rid) {
		this.setRid(rid);
	}

	/* 分配给图片的ID，使用ID下载图片 */
	private String rid;

	/* 图片高度 */
	private int height;

	/* 图片宽度 */
	private int width;

	/* 文件类型 */
	private String type;

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
