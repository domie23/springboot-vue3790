package com.entity.model;

import com.entity.ShengxiancangkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生鲜仓库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public class ShengxiancangkuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 仓库位置
	 */
	
	private String cangkuweizhi;
		
	/**
	 * 仓库面积
	 */
	
	private String cangkumianji;
		
	/**
	 * 生鲜名称
	 */
	
	private String shengxianmingcheng;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 存放位置
	 */
	
	private String cunfangweizhi;
		
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
	 * 设置：仓库面积
	 */
	 
	public void setCangkumianji(String cangkumianji) {
		this.cangkumianji = cangkumianji;
	}
	
	/**
	 * 获取：仓库面积
	 */
	public String getCangkumianji() {
		return cangkumianji;
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
	 * 设置：存放位置
	 */
	 
	public void setCunfangweizhi(String cunfangweizhi) {
		this.cunfangweizhi = cunfangweizhi;
	}
	
	/**
	 * 获取：存放位置
	 */
	public String getCunfangweizhi() {
		return cunfangweizhi;
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
