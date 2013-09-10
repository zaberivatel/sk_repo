package by.zbs.bean;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private List<Apple> tree;

	public Tree() {
	}

	public void addApples() {
		int count = (int) (Math.random() * 1000) % 7 + 1;
		System.out.println("Added apples : " + count);
		for (int i = 0; i < count; i++) {
			getTree().add(new Apple((int) (Math.random() * 1000), 1));
		}
	}

	public void deleteApples() {
		int count = (int) (Math.random() * 1000) % 5 + 1;
		System.out.println("Deleted apples : " + count);
		if (count > getTree().size()) {
			getTree().clear();
		} else {
			for (int i = 0; i < count; i++) {
				getTree().remove(0);
			}
		}
	}

	public void blooming() {
		List<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < getTree().size(); i++) {
			if (getTree().get(i).getCondition() == 1) {
				apples.add(new Apple((int) Math.random() * 1000, 1));
				getTree().get(i).setCondition(2);
			}
		}
		System.out.println("Blooming apples : " + apples.size());
		getTree().addAll(apples);
	}
	
	private List<Apple> getTree() {
		if (tree == null) {
			tree = new ArrayList<Apple>();
		}
		return tree;
	}

	public void print() {
		System.out.println("Count of apples : " + getTree().size());
		for (Apple apple : getTree()) {
			System.out.println(apple);
		}
	}
}
