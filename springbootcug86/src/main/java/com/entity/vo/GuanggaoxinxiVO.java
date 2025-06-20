package com.entity.vo;

import com.entity.GuanggaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 广告信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
public class GuanggaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 广告类型
	 */
	
	private String guanggaoleixing;
		
	/**
	 * 广告内容
	 */
	
	private String guanggaoneirong;
		
	/**
	 * 广告视频
	 */
	
	private String guanggaoshipin;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 广告封面
	 */
	
	private String guanggaofengmian;
		
	/**
	 * 商店编号
	 */
	
	private String shangdianbianhao;
		
	/**
	 * 商店名称
	 */
	
	private String shangdianmingcheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：广告类型
	 */
	 
	public void setGuanggaoleixing(String guanggaoleixing) {
		this.guanggaoleixing = guanggaoleixing;
	}
	
	/**
	 * 获取：广告类型
	 */
	public String getGuanggaoleixing() {
		return guanggaoleixing;
	}
				
	
	/**
	 * 设置：广告内容
	 */
	 
	public void setGuanggaoneirong(String guanggaoneirong) {
		this.guanggaoneirong = guanggaoneirong;
	}
	
	/**
	 * 获取：广告内容
	 */
	public String getGuanggaoneirong() {
		return guanggaoneirong;
	}
				
	
	/**
	 * 设置：广告视频
	 */
	 
	public void setGuanggaoshipin(String guanggaoshipin) {
		this.guanggaoshipin = guanggaoshipin;
	}
	
	/**
	 * 获取：广告视频
	 */
	public String getGuanggaoshipin() {
		return guanggaoshipin;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：广告封面
	 */
	 
	public void setGuanggaofengmian(String guanggaofengmian) {
		this.guanggaofengmian = guanggaofengmian;
	}
	
	/**
	 * 获取：广告封面
	 */
	public String getGuanggaofengmian() {
		return guanggaofengmian;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
