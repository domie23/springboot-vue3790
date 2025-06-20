package com.entity.vo;

import com.entity.ShangjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商家
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public class ShangjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 商店名称
	 */
	
	private String shangdianmingcheng;
		
	/**
	 * 商店地址
	 */
	
	private String shangdiandizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 商店图片
	 */
	
	private String shangdiantupian;
		
	/**
	 * 余额
	 */
	
	private Float money;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：商店名称
	 */
	 
	public void setShangdianmingcheng(String shangdianmingcheng) {
		this.shangdianmingcheng = shangdianmingcheng;
	}
	
	/**
	 * 获取：商店名称
	 */
	public String getShangdianmingcheng() {
		return shangdianmingcheng;
	}
				
	
	/**
	 * 设置：商店地址
	 */
	 
	public void setShangdiandizhi(String shangdiandizhi) {
		this.shangdiandizhi = shangdiandizhi;
	}
	
	/**
	 * 获取：商店地址
	 */
	public String getShangdiandizhi() {
		return shangdiandizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：商店图片
	 */
	 
	public void setShangdiantupian(String shangdiantupian) {
		this.shangdiantupian = shangdiantupian;
	}
	
	/**
	 * 获取：商店图片
	 */
	public String getShangdiantupian() {
		return shangdiantupian;
	}
				
	
	/**
	 * 设置：余额
	 */
	 
	public void setMoney(Float money) {
		this.money = money;
	}
	
	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}
			
}
