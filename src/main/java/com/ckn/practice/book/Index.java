package com.ckn.practice.book;

/**
 * 
 * @author Pactera-NEN
 * @date 2016年6月29日-下午3:35:14
 */
public class Index {
	
	private String indexName;
	private String indexUrl;
	
		
	//getter and setter
	public String getIndexName() {
		return indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	
	public String getIndexUrl() {
		return indexUrl;
	}
	public void setIndexUrl(String indexUrl) {
		this.indexUrl = indexUrl;
	}
	
	@Override
	public String toString() {
		return "Index [indexName=" + indexName + ", indexUrl=" + indexUrl + "]";
	}


}
