package com.luxintong.behavioralPattern.strategy;

/**
 * @author Luxintong
 * @Description 加密类，抽象策略
 */
public interface Cipher {
	String doEncrypt(int key, String plainText);
}
