package com.entity.view;

import com.entity.YonghujinggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户警告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
@TableName("yonghujinggao")
public class YonghujinggaoView  extends YonghujinggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghujinggaoView(){
	}
 
 	public YonghujinggaoView(YonghujinggaoEntity yonghujinggaoEntity){
 	try {
			BeanUtils.copyProperties(this, yonghujinggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
