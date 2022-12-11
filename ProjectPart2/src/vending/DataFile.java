package vending;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataFile {
	protected final File dir_file;

	public DataFile(final File dir) {
		this.dir_file = dir;
	}

	public ArrayList<String> loadDirectory() {
		if (!this.dir_file.exists())
			return null;
		ArrayList<String> lines = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(this.dir_file))) {
			String line;
			while ((line = reader.readLine()) != null)
				lines.add(line);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lines;
	}

	public String getDirectory() {
		return this.dir_file.getPath();
	}
}
