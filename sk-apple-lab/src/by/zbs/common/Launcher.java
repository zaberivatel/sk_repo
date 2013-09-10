package by.zbs.common;

import java.util.Scanner;

import by.zbs.bean.Tree;

public class Launcher {

	public static void monitor(int command, Tree tree) {
		switch (command) {
		case 1:
			tree.addApples();
			break;
		case 2:
			tree.deleteApples();
			break;
		default:
			System.out.println("Bye!");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Tree tree = new Tree();
		System.out.println("1 - Add apples; 2 - Remove apples; 0 - Exit;");
		while (true) {
			int cmd = in.nextInt();
			monitor(cmd, tree);
			tree.print();
		}
	}

}
