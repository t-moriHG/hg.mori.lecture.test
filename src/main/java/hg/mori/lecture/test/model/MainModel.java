package hg.mori.lecture.test.model;

import org.springframework.stereotype.Component;

/**
 * Mainモデル.
 */
@Component
public class MainModel {
	
	/**
	 * 文字数取得.
	 * @param str 文字列
	 */ 
	public String getCount(String str) {
		
		int count = str.length();
		
		return String.valueOf(count);
	}

}
