package com.hhf.model.product.vo;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * 基础类目包括属性规格相关信息
 */
public class BaseCategoryInfoVO implements Serializable {

	private static final long serialVersionUID = -1062915915400494487L;

	private Integer bcId;
    private String bcName;
    private String bcCode;
    private String pathId;
    private String pathName;
    private List<Attr> attrList;
    private List<Spec> specList;
    private List<Brand> brandList;
    
	public Integer getBcId() {
		return bcId;
	}

	public void setBcId(Integer bcId) {
		this.bcId = bcId;
	}

	public String getBcName() {
		return bcName;
	}

	public void setBcName(String bcName) {
		this.bcName = bcName;
	}

	public String getPathId() {
		return pathId;
	}

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public List<Attr> getAttrList() {
		return attrList;
	}

	public void setAttrList(List<Attr> attrList) {
		this.attrList = attrList;
	}

	public List<Spec> getSpecList() {
		return specList;
	}

	public void setSpecList(List<Spec> specList) {
		this.specList = specList;
	}
	
	public List<Brand> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<Brand> brandList) {
		this.brandList = brandList;
	}
	
	public String getBcCode() {
		return bcCode;
	}

	public void setBcCode(String bcCode) {
		this.bcCode = bcCode;
	}


	/**
     *	品牌
     */
    public static class Brand implements Serializable {
		private static final long serialVersionUID = -4312989435012826980L;
		private Long brandId;
		private Long brandBcId;
		private String brandName;
	    private String brandEname;
	    private String logoUrl;
	    private Boolean isFilter;
	    private Boolean isMobileDisplay;
	    private Long mDisplayPosition;
		
	    public String getName() {
	    	String name = null;
	    	if(StringUtils.isNotEmpty(brandName) && StringUtils.isNotEmpty(brandEname)){
	    		name = brandName + "/" + brandEname;
	    	}else if(StringUtils.isNotEmpty(brandName)){
	    		name = brandName;
	    	}else if(StringUtils.isNotEmpty(brandEname)){
	    		name = brandEname;
	    	}
	    	
			return name;
		}
	    
		public Long getBrandId() {
			return brandId;
		}
		public void setBrandId(Long brandId) {
			this.brandId = brandId;
		}
		public Long getBrandBcId() {
			return brandBcId;
		}
		public void setBrandBcId(Long brandBcId) {
			this.brandBcId = brandBcId;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getBrandEname() {
			return brandEname;
		}
		public void setBrandEname(String brandEname) {
			this.brandEname = brandEname;
		}
		public String getLogoUrl() {
			return logoUrl;
		}
		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}
		public Boolean getIsFilter() {
			return isFilter;
		}
		public void setIsFilter(Boolean isFilter) {
			this.isFilter = isFilter;
		}
		public Long getmDisplayPosition() {
			return mDisplayPosition;
		}
		public void setmDisplayPosition(Long mDisplayPosition) {
			this.mDisplayPosition = mDisplayPosition;
		}
		public Boolean getIsMobileDisplay() {
			return isMobileDisplay;
		}
		public void setIsMobileDisplay(Boolean isMobileDisplay) {
			this.isMobileDisplay = isMobileDisplay;
		}
		
    }

	/**
     *	规格及值列表
     */
    public static class Spec implements Serializable {
		private static final long serialVersionUID = -8676531378585389283L;
		private Long bcSpecId;
		private Long specId;
		private String specName;
		private Integer displayOrder;
		private String displayMode;
		private Boolean isFilter;
		private List<SpecValue> specValueList;
		
		
		public Long getSpecId() {
			return specId;
		}

		public void setSpecId(Long specId) {
			this.specId = specId;
		}

		public Long getBcSpecId() {
			return bcSpecId;
		}

		public void setBcSpecId(Long bcSpecId) {
			this.bcSpecId = bcSpecId;
		}

		public String getSpecName() {
			return specName;
		}

		public void setSpecName(String specName) {
			this.specName = specName;
		}

		public Integer getDisplayOrder() {
			return displayOrder;
		}

		public void setDisplayOrder(Integer displayOrder) {
			this.displayOrder = displayOrder;
		}

		public List<SpecValue> getSpecValueList() {
			return specValueList;
		}

		public void setSpecValueList(List<SpecValue> specValueList) {
			this.specValueList = specValueList;
		}
		
		public String getDisplayMode() {
			return displayMode;
		}

		public void setDisplayMode(String displayMode) {
			this.displayMode = displayMode;
		}

		public Boolean getIsFilter() {
			return isFilter;
		}

		public void setIsFilter(Boolean isWebFilter) {
			this.isFilter = isWebFilter;
		}

		public static class SpecValue implements Serializable {
			private static final long serialVersionUID = 4504141626105089855L;
			private Long bcSvId;
			private Long specValueId;
			private String specValueName;
		    private String imgUrl;
		    private Integer displayOrder;
		    private Boolean isFilter;
		    private Boolean isMobileDisplay;
		    private Integer mDisplayPosition;
		    
			public Long getSpecValueId() {
				return specValueId;
			}
			public void setSpecValueId(Long specValueId) {
				this.specValueId = specValueId;
			}
			public String getSpecValueName() {
				return specValueName;
			}
			public void setSpecValueName(String specValueName) {
				this.specValueName = specValueName;
			}
			public String getImgUrl() {
				return imgUrl;
			}
			public void setImgUrl(String imgUrl) {
				this.imgUrl = imgUrl;
			}
			public Integer getDisplayOrder() {
				return displayOrder;
			}
			public void setDisplayOrder(Integer displayOrder) {
				this.displayOrder = displayOrder;
			}
			public Long getBcSvId() {
				return bcSvId;
			}
			public void setBcSvId(Long bcSvId) {
				this.bcSvId = bcSvId;
			}
			public Boolean getIsFilter() {
				return isFilter;
			}
			public void setIsFilter(Boolean isFilter) {
				this.isFilter = isFilter;
			}
			public Boolean getIsMobileDisplay() {
				return isMobileDisplay;
			}
			public void setIsMobileDisplay(Boolean isMobileDisplay) {
				this.isMobileDisplay = isMobileDisplay;
			}
			public Integer getmDisplayPosition() {
				return mDisplayPosition;
			}
			public void setmDisplayPosition(Integer mDisplayPosition) {
				this.mDisplayPosition = mDisplayPosition;
			}
		}
    }
    
    /**
     *	属性及值列表
     */
    public static class Attr implements Serializable {
		private static final long serialVersionUID = 5449053325270219052L;
		
		//属性所属类目的ID
		private Long bcAttrId;
		private Long attrId;
		private String attrName;
	    private Integer displayOrder;
	    private Boolean isRequire;
	    private String displayMode;
	    private Boolean isFilter;
	    //属性值列表
	    List<AttrValue> attrValueList;

	    
		public Boolean getIsFilter() {
			return isFilter;
		}

		public void setIsFilter(Boolean isFilter) {
			this.isFilter = isFilter;
		}

		public Long getBcAttrId() {
			return bcAttrId;
		}

		public void setBcAttrId(Long bcAttrId) {
			this.bcAttrId = bcAttrId;
		}
		
		public Long getAttrId() {
			return attrId;
		}

		public void setAttrId(Long attrId) {
			this.attrId = attrId;
		}

		public String getAttrName() {
			return attrName;
		}

		public void setAttrName(String attrName) {
			this.attrName = attrName;
		}

		public Integer getDisplayOrder() {
			return displayOrder;
		}

		public void setDisplayOrder(Integer displayOrder) {
			this.displayOrder = displayOrder;
		}

		public Boolean getIsRequire() {
			return isRequire;
		}

		public void setIsRequire(Boolean isRequire) {
			this.isRequire = isRequire;
		}

		public List<AttrValue> getAttrValueList() {
			return attrValueList;
		}

		public void setAttrValueList(List<AttrValue> attrValueList) {
			this.attrValueList = attrValueList;
		}

    	public String getDisplayMode() {
			return displayMode;
		}

		public void setDisplayMode(String displayMode) {
			this.displayMode = displayMode;
		}

		public static class AttrValue implements Serializable {
			private static final long serialVersionUID = 5887055918834421439L;
			private Long bcAvId;
			private Long attrValueId;
			private String attrValue;
    	    private String icon;
    	    private Integer displayOrder;
    	    private Boolean isSubAttr;
    	    private Boolean isFilter;
		    private Boolean isMobileDisplay;
    	    //子属性
    	    private Attr subAttrObj;
    	    
    	    public Long getAttrValueId() {
				return attrValueId;
			}
			public void setAttrValueId(Long attrValueId) {
				this.attrValueId = attrValueId;
			}
			public Long getBcAvId() {
				return bcAvId;
			}
			public void setBcAvId(Long bcAvId) {
				this.bcAvId = bcAvId;
			}
    	    public String getAttrValue() {
				return attrValue;
			}
			public void setAttrValue(String attrValue) {
				this.attrValue = attrValue;
			}
			public String getIcon() {
				return icon;
			}
			public void setIcon(String icon) {
				this.icon = icon;
			}
			public Integer getDisplayOrder() {
				return displayOrder;
			}
			public void setDisplayOrder(Integer displayOrder) {
				this.displayOrder = displayOrder;
			}
			public Boolean getIsFilter() {
				return isFilter;
			}
			public void setIsFilter(Boolean isFilter) {
				this.isFilter = isFilter;
			}
			public Boolean getIsMobileDisplay() {
				return isMobileDisplay;
			}
			public void setIsMobileDisplay(Boolean isMobileDisplay) {
				this.isMobileDisplay = isMobileDisplay;
			}
			public Boolean getIsSubAttr() {
				return isSubAttr;
			}
			public void setIsSubAttr(Boolean isSubAttr) {
				this.isSubAttr = isSubAttr;
			}
			public Attr getSubAttrObj() {
				return subAttrObj;
			}
			public void setSubAttrObj(Attr subAttrObj) {
				this.subAttrObj = subAttrObj;
			}
        }
    }

}
