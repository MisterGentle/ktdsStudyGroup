package com.ktdsuniversity.edu.cafe.menu.mgnt.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class MenuMgntDAOImpl implements MenuMgntDAO {
	
	private Map<String, List<MenuMgntVO>> dataSource;
	
	public MenuMgntDAOImpl() {
		dataSource = new HashMap<>();
		dataSource.put("커피", new ArrayList<>());
		dataSource.put("음료", new ArrayList<>());
		dataSource.put("티", new ArrayList<>());
		dataSource.put("디저트", new ArrayList<>());
	}
	
	@Override
	public int create(String itemType, MenuMgntVO menuMgntVO) {
		List <MenuMgntVO> itemList = dataSource.get(itemType);
		itemList.add(menuMgntVO);
		return 1;
	}

	@Override
	public int update(String itemType, int itemIdx, MenuMgntVO menuMgntVO) {
		List<MenuMgntVO> itemList = dataSource.get(itemType);
		MenuMgntVO item = itemList.get(itemIdx);
		item.setItemName(menuMgntVO.getItemName());
		return 1;
	}
	
	@Override
	public int delete(String itemType, int itemIdx) {
		List<MenuMgntVO> itemList = dataSource.get(itemType);
		itemList.remove(itemIdx);
		return 1;
	}
	
	@Override
	public MenuMgntVO read(String itemType, int itemIdx) {
		return dataSource.get(itemType).get(itemIdx);
	}

	@Override
	public List<MenuMgntVO> readSome(String itemType) {
		return dataSource.get(itemType);
	}

	@Override
	public Map<String, List<MenuMgntVO>> readAll() {
		return dataSource;
	}

}
