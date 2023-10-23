package com.luxintong.structuralPattern.proxy;

/*
 * Description:
 * 某软件公司承接了某信息咨询公司的收费商务信息查询系统的开发任务，该系统的基本需求如下：
 * (1)在进行商务信息查询之前用户需要通过身份验证，只有合法用户才能够使用该查询系统。
 * (2)在进行商务信息查询时系统需要记录查询日志，以便根据查询次数收取查询费用。
 *
 * 该软件公司的开发人员已完成了商务信息查询模块的开发任务，现希望能够以一种松耦合的方式向原有系统增加身份验证和日志记录功能，
 * 客户端代码可以无区别地对待原始的商务信息查询模块和增加新功能之后的商务信息查询模块，而且可能在将来还要在该信息查询模块中增加一些新的功能。
 *
 * 试使用代理模式设计并实现该收费商务信息查询系统。
 * */
public class Client {
	public static void main(String[] args) {
		Searcher searcher;
		searcher = (Searcher) XMLUtil.getBean();
		String result = searcher.doSearch("杨过", "玉女心经");
	}
}
