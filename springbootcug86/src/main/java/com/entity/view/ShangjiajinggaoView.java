package com.entity.view;

import com.entity.ShangjiajinggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商家警告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
@TableName("shangjiajinggao")
public class ShangjiajinggaoView  extends ShangjiajinggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangjiajinggaoView(){
	}
 
 	public ShangjiajinggaoView(ShangjiajinggaoEntity shangjiajinggaoEntity){
 	try {
			BeanUtils.copyProperties(this, shangjiajinggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
