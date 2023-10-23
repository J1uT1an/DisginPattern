package com.luxintong.behavioralPattern.strategy;

/**
 * @author Luxintong
 * @Description 数据，环境类
 */
public class DataOperation {
	private Cipher cipher;

	public void setCipher(Cipher cipher) {
		this.cipher = cipher;
	}

	public String doEncrypt(int key, String plainText) {
		return cipher.doEncrypt(key, plainText);
	}
}
