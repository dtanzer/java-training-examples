package net.davidtanzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		try(PrintWriter w = new PrintWriter(new FileWriter(new File("test.txt")))) {
			w.println("Short line");
			w.println("A longer line. Actually, this line is longer than 20 chars.");
			w.println("Another short line.");
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
		
		try(BufferedReader r = new BufferedReader(new FileReader(new File("test.txt")))) {
			String line;
			while((line=r.readLine()) != null) {
				System.out.println(line);
				if(line.length() > 20) {
					System.err.println("Line is longer than 20 characters!");
				}
			}
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
