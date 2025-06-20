package com.entity.model;

import com.entity.ShengxianchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生鲜出库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public class ShengxianchukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 仓库位置
	 */
	
	private String cangkuweizhi;
		
	/**
	 * 生鲜名称
	 */
	
	private String shengxianmingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 出库时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chukushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 商店编号
	 */
	
	private String shangdianbianhao;
		
	/**
	 * 商店名称
	 */
	
	private String shangdianmingcheng;
				
	
	/**
	 * 设置：仓库位置
	 */
	 
	public void setCangkuweizhi(String cangkuweizhi) {
		this.cangkuweizhi = cangkuweizhi;
	}
	
	/**
	 * 获取：仓库位置
	 */
	public String getCangkuweizhi() {
		return cangkuweizhi;
	}
				
	
	/**
	 * 设置：生鲜名称
	 */
	 
	public void setShengxianmingcheng(String shengxianmingcheng) {
		this.shengxianmingcheng = shengxianmingcheng;
	}
	
	/**
	 * 获取：生鲜名称
	 */
	public String getShengxianmingcheng() {
		return shengxianmingcheng;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：出库时间
	 */
	 
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
