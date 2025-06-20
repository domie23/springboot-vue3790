package com.entity.model;

import com.entity.ShangjiajinggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商家警告
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public class ShangjiajinggaoModel  implements Serializable {
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
