package com.luxintong.structuralPattern.proxy;

/*
 * Description: 代理查询类，充当代理主题角色，它是查询代理，维持了对 RealSearcher 对象、AccessSearcher 对象和 Logger 对象的引用。
 * */
public class ProxySearcher implements Searcher {
	private final RealSearcher searcher = new RealSearcher(); // 维持一个对真是主题的引用
	private AccessValidator validator;
	private Logger logger;
	
	public String doSearch(String userId, String keyword) {
		// 如果身份验证成功，则执行查询
		if (this.validate(userId)) {
			String result = searcher.doSearch(userId, keyword); // 调用真实主题对象的查询方法
			
			this.log(userId); // 记录查询日志
			return result; // 返回查询结果
		} else {
			return null;
		}
	}
	
	// 创建访问验证对象并调用其 validate() 方法实现身份验证
	private boolean validate(String userId) {
		validator = new AccessValidator();
		return validator.validate(userId);
	}
	
	// 创建日志记录对象并调用其 log() 方法实现日志记录
	private void log(String userId) {
		logger = new Logger();
		logger.log(userId);
	}
}
