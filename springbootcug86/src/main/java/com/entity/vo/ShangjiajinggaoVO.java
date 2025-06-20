package com.entity.vo;

import com.entity.ShangjiajinggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商家警告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public class ShangjiajinggaoVO  implements Serializable {
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
	 * 商店编号
	 */
	
	private String shangdianbianhao;
		
	/**
	 * 商店名称
	 */
	
	private String shangdianmingcheng;
				
	
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
	 * 设置：商店编号
	 */
	 
	public void setShangdianbianhao(String shangdianbianhao) {
		this.shangdianbianhao = shangdianbianhao;
	}
	
	/**
	 * 获取：商店编号
	 */
	public String getShangdianbianhao() {
		return shangdianbianhao;
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
			
}
