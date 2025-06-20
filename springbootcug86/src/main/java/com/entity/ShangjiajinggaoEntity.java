package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商家警告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
@TableName("shangjiajinggao")
public class ShangjiajinggaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangjiajinggaoEntity() {
		
	}
	
	public ShangjiajinggaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
