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
 * 商家
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
@TableName("shangjia")
public class ShangjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangjiaEntity() {
		
	}
	
	public ShangjiaEntity(T t) {
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
	 * 商店编号
	 */
					
	private String shangdianbianhao;
	
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
