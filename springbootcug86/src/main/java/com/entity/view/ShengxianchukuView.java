package com.entity.view;

import com.entity.ShengxianchukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生鲜出库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-16 15:55:56
 */
@TableName("shengxianchuku")
public class ShengxianchukuView  extends ShengxianchukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengxianchukuView(){
	}
 
 	public ShengxianchukuView(ShengxianchukuEntity shengxianchukuEntity){
 	try {
			BeanUtils.copyProperties(this, shengxianchukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
