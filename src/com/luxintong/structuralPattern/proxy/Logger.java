package com.luxintong.structuralPattern.proxy;

/*
 * Description: 日志记录类（业务类），它提供 log() 方法来保存日志
 * */
public class Logger {
	// 模拟实现日志记录
	public void log(String userId) {
		System.out.println("更新数据库，用户'" + userId + "'查询次数加1！");
	}
}
