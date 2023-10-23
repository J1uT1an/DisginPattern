package com.luxintong.behavioralPattern.strategy;

/**
 * @author Luxintong
 * @Description 某系统需要对重要数据（如用户密码）进行加密，并提供了几种加密方案（例如凯撒加密、求模加密等），对该加密模块进行设计，使得用户可以动态地选择加密方式
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个数据操作对象
		DataOperation dataOperation = new DataOperation();
		String plainText = "Hello, World!"; // 设置需要加密文本

		Cipher cipher;
		cipher = (Cipher) XMLUtil.getBean();
		dataOperation.setCipher(cipher);

		// 加密
		int key = 123456; // 设置加密密钥
		String encryptedText = dataOperation.doEncrypt(key, plainText);
		System.out.println("加密结果: " + encryptedText);
	}
}