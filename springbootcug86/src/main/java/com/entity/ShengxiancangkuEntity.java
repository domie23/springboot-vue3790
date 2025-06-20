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
 * 生鲜仓库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
@TableName("shengxiancangku")
public class ShengxiancangkuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengxiancangkuEntity() {
		
	}
	
	public ShengxiancangkuEntity(T t) {
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
	 * 仓库编号
	 */
					
	private String cangkubianhao;
	
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
	 * 设置：仓库编号
	 */
	public void setCangkubianhao(String cangkubianhao) {
		this.cangkubianhao = cangkubianhao;
	}
	/**
	 * 获取：仓库编号
	 */
	public String getCangkubianhao() {
		return cangkubianhao;
	}
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
