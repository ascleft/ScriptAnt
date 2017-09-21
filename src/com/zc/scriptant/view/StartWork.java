package com.zc.scriptant.view;

import java.util.ArrayList;

public class StartWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> input = FileReader.readFileByBytes("workspace/test.txt");
		
		ArrayList<ArrayList<String>> blocks = 	Grammar.gotCodeBlock(input);
		
		System.out.println(blocks.size());
	}

}
