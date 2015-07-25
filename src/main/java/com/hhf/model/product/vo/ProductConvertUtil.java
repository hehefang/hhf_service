package com.hhf.model.product.vo;

import org.apache.commons.lang.StringUtils;

import com.hhf.common.util.DateUtils;
import com.hhf.constants.product.ProductConstants;
import com.hhf.model.product.Product;

public class ProductConvertUtil {

	public static Product voToProduct(ProductVo vo, Product product) {
		if(product == null){
			product = new Product();
		}
		
		if(null != vo.getProdId() &&  vo.getProdId() > 0){ //商品ID
			product.setProdId(vo.getProdId());
		}else{ // 新增
			product.setStatus(ProductConstants.PROD_STATUS_ON);
			product.setAuditStatus(ProductConstants.PROD_AUDIT_STATUS_PASS);
		}
		
		if(StringUtils.isNotBlank(vo.getAuditStatus()) 
				&& ProductConstants.PROD_AUDIT_STATUS_NO_PASS.equals(vo.getAuditStatus())){ //审核驳回
			product.setAuditStatus(ProductConstants.PROD_AUDIT_STATUS_WAIT);
		}		
		if(StringUtils.isNotBlank(vo.getProdCode())){ //商品编码
			product.setProdCode(vo.getProdCode());
		}else{
//			product.setProdCode(prodCode); //TODO 生成prodCode
			product.setCreateDate(DateUtils.currentDate()); //创建时间
		}
		if(null != vo.getSellerId() &&  vo.getSellerId() > 0){ //卖家ID
			product.setSellerId(vo.getSellerId());
		}
		if(null != vo.getBcId() &&  vo.getBcId() > 0){	//bcID
			product.setBcId(vo.getBcId());
			product.setBcCode(vo.getBcCode()); 	//bcCode
		}
		if(null != vo.getBrandId() &&  vo.getBrandId() > 0){//品牌ID
			product.setBrandId(vo.getBrandId());
			product.setBrandName(vo.getBrandName());	//品牌名称
		}
		if(StringUtils.isNotBlank(vo.getTitle())){	//标题
			product.setTitle(vo.getTitle());
		}
		if(StringUtils.isNotBlank(vo.getSubtitle())){//子标题
			product.setSubtitle(vo.getSubtitle());
		}
		if(StringUtils.isNotBlank(vo.getArtNo())){ //货号
			product.setArtNo(vo.getArtNo());
		}
		if(StringUtils.isNotBlank(vo.getAttrValueId())){ //属性ID字符串
			product.setAttrValueId(vo.getAttrValueId());
			product.setAttrValueName(vo.getAttrValueName()); //属性值字符串
		}
		if(StringUtils.isNotBlank(vo.getImgUrl())){ //主图图片
			product.setImgUrl(vo.getImgUrl());
		}
		if(StringUtils.isNotBlank(vo.getDetail())){ //描述
			product.setDetail(vo.getDetail());
		}
		
		product.setLastUpdateDate(DateUtils.currentDate());
		return product;
		
	}

}
