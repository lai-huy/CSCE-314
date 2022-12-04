package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataFile {
    protected final String dir;
    protected final String input;

    protected final File dir_file;
    protected final File input_file;

    public DataFile(final String dir, final String input) {
        this.dir = dir;
        this.input = input;
        this.dir_file = new File(this.dir);
        this.input_file = new File(this.input);
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

    public ArrayList<Integer> loadSampleInput() {
        if (!this.input_file.exists())
            return null;
        ArrayList<Integer> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(this.input_file))) {
            String line;
            while ((line = reader.readLine()) != null)
                lines.add(Integer.parseInt(line));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public String getDirectory() {
        return this.dir;
    }

    public String getSelections() {
        return this.input;
    }
}
