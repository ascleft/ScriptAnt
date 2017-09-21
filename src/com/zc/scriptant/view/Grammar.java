package com.zc.scriptant.view;

import java.util.ArrayList;

public class Grammar {

	public static ArrayList<ArrayList<String>> gotCodeBlock(ArrayList<String> input) {
		ArrayList<ArrayList<String>> al_out = new ArrayList<ArrayList<String>>();
		int tag = 0;// 0æ≤÷π,1ÃÓ≥‰÷–,-1“Ï≥£
		ArrayList<String> al_temp = new ArrayList<String>();
		;
		for (int i = 0; i < input.size(); i++) {

			if (tag == 0) {
				if ("{".equals(input.get(i))) {
					System.out.println("right block start");

					tag = 1;
					al_temp = new ArrayList<String>();
				} else if ("}".equals(input.get(i))) {
					System.out.println("err block end");

				}
			} else if (tag == 1) {
				if ("{".equals(input.get(i))) {
					System.out.println("err block start");
				} else if ("}".equals(input.get(i))) {
					System.out.println("right block end");
					al_out.add(al_temp);
					tag = 0;
				} else {
					
					
					
					
					al_temp.add(input.get(i));
				}
			}
		}

		if (tag == 0) {
			System.out.println("Grammar succ end");
		} else {
			System.out.println("Grammar err end");
		}

		return al_out;
	}
}
