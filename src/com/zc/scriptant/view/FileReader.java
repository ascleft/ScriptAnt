package com.zc.scriptant.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileReader {

	public static ArrayList<String> readFileByBytes(String fileName) {

		ArrayList<String> lines = new ArrayList<String>();

		File file = new File(fileName);

		try {
			
			
			if (!file.exists()) {

				file.createNewFile();

			}

			FileInputStream fileInput = new FileInputStream(file);

			InputStreamReader inputStreamReader = new InputStreamReader(fileInput, "UTF-8");

			BufferedReader br = new BufferedReader(inputStreamReader);

			String line = null;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
			br.close();

			for (int i = 0; i < lines.size(); i++) {
				System.out.println(lines.get(i));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lines;

	}

	public static void readFileByBytes2(String fileName) {
		// 一般先创建file对象
		FileInputStream fileInput = null;
		try {
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			byte[] buffer = new byte[1024];
			fileInput = new FileInputStream(file);
			int byteread = 0;
			// byteread表示一次读取到buffers中的数量。
			while ((byteread = fileInput.read(buffer)) != -1) {
				System.out.write(buffer, 0, byteread);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (fileInput != null) {
					fileInput.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static ArrayList<String> trims(ArrayList<String> al_in) {
		ArrayList<String> al_out = new ArrayList<String>();
		for (int i = 0; i < al_in.size(); i++) {
			al_out.add(al_in.get(i).trim());
		}
		return al_out;
	}

}
