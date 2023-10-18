package com.luxintong.structuralPattern.facade;

/*
 * Description: 主机类
 * */
public class Mainframe {
	// 聚合 CPU、硬盘、内存、操作系统
	private final CPU cpu;
	private final HardDisk hardDisk;
	private final Memory memory;
	private final OS os;
	
	// 构造函数，创建实例化对象
	public Mainframe() {
		cpu = new CPU();
		hardDisk = new HardDisk();
		memory = new Memory();
		os = new OS();
	}
	
	// 按下开机按钮，即可调用其他硬件设备和软件的启动方法
	public void on() {
		// 内存自检
		try {
			memory.check();
		} catch (Exception e) {
			System.out.println("内存存在问题");
			System.out.println("电脑启动失败");
		}
		// CPU启动
		try {
			cpu.run();
		} catch (Exception e) {
			System.out.println("CPU存在问题");
			System.out.println("电脑启动失败");
		}
		// 硬盘读取
		try {
			hardDisk.read();
		} catch (Exception e) {
			System.out.println("硬盘存在问题！");
			System.out.println("电脑启动失败");
		}
		// 操作系统载入
		try {
			os.load();
		} catch (Exception e) {
			System.out.println("操作系统存在问题！");
			System.out.println("电脑启动失败");
		}
		// 设备启动
		System.out.println("电脑开机成功！");
	}
}
