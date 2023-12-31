package com.luxintong.structuralPattern.proxy;

/*
 * Description: 抽象查询类，充当抽象主题角色，它声明了 doSearch() 方法
 * */
public interface Searcher {
	String doSearch(String userId, String keyword);
}
