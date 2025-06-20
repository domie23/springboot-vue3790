package com.entity.vo;

import com.entity.YonghujinggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户警告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public class YonghujinggaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 警告内容
	 */
	
	private String jinggaoneirong;
		
	/**
	 * 警告时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jinggaoshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：警告内容
	 */
	 
	public void setJinggaoneirong(String jinggaoneirong) {
		this.jinggaoneirong = jinggaoneirong;
	}
	
	/**
	 * 获取：警告内容
	 */
	public String getJinggaoneirong() {
		return jinggaoneirong;
	}
				
	
	/**
	 * 设置：警告时间
	 */
	 
	public void setJinggaoshijian(Date jinggaoshijian) {
		this.jinggaoshijian = jinggaoshijian;
	}
	
	/**
	 * 获取：警告时间
	 */
	public Date getJinggaoshijian() {
		return jinggaoshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
