package com.warehouse.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;


@Controller
@RequestMapping("/warehouse/init/*")
public class InitWareHouseController {
	
	private static final Logger logger = LoggerFactory.getLogger(InitWareHouseController.class);
	
	@GetMapping(value="/insert")
	public void insert(Model model) {	
		
		System.out.println("Dsfdsfsdf");
	}
	
	@ResponseBody
	@PostMapping(value="/get", produces = "application/json; charset=utf8")
	public String get(Model model) {
		
		ItemVO vo = new ItemVO(7, 28, "asd", "테스트", 10000, 10000, "스크린샷_20221026_034152.png");
		ArrayList<ItemVO> lists = new ArrayList<>();
		lists.add(vo);
		return new Gson().toJson(lists);
	}
}

class ItemVO {
	
	private int no;
	private int client_no;
	private String code;
	private String name;
	private int in_price;
	private int out_price;
	private String image;
	
	public ItemVO(int no, int client_no, String code, String name, int in_price, int out_price, String image) {
		super();
		this.no = no;
		this.client_no = client_no;
		this.code = code;
		this.name = name;
		this.in_price = in_price;
		this.out_price = out_price;
		this.image = image;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getClient_no() {
		return client_no;
	}
	public void setClient_no(int client_no) {
		this.client_no = client_no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIn_price() {
		return in_price;
	}
	public void setIn_price(int in_price) {
		this.in_price = in_price;
	}
	public int getOut_price() {
		return out_price;
	}
	public void setOut_price(int out_price) {
		this.out_price = out_price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}