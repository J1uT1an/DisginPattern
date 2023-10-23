package com.luxintong.behavioralPattern.strategy;

/**
 * @author Luxintong
 * @Description 凯撒加密类，具体策略
 */
public class CaesarCipher implements Cipher {
	@Override
	public String doEncrypt(int key, String plainText) {
		return "凯撒加密成功！";
	}
}
