/*
 * File Name：RequestController.java
 *
 * Copyrighe：copyright@2017 GZSW Company, All Rights Reserved
 *
 * Create Time: 2017年7月7日 下午2:45:46
 */
package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.utils.HttpClientUtils;
/**
 *
 * @author vous (shinena_deng@163.com)
 * @version 1.0, 2017年7月7日 下午2:45:46
 */
@Controller
public class RequestController {

	@RequestMapping("/test")
	public String test(@RequestParam String searchTime) {
		String url="http://localhost:8082/highFrequencyAnalysis?cb=&searchTime=";
		
		return HttpClientUtils.doGet(url + searchTime, null);
	}
}
