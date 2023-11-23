package com.luxintong.structuralPattern.proxy;

/*
 * Description: 具体查询类，充当真实主题角色，它实现查询功能，提供 doSearch() 方法来查询信息
 * */
public class RealSearcher implements Searcher {
	// 模拟查询商务信息
	@Override
	public String doSearch(String userId, String keyword) {
		System.out.println("用户'" + userId + "'使用关键词'" + keyword + "'查询商务信息！");
		return "返回具体内容";
	}
}
