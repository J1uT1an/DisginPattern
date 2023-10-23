package com.luxintong.behavioralPattern.strategy;

/**
 * @author Luxintong
 * @Description 求模加密类，具体策略
 */
public class ModCipher implements Cipher {
	@Override
	public String doEncrypt(int key, String plainText) {
		return "求模加密成功！";
	}
}
