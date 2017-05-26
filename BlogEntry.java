package org.chapter4.absolutejava;

import java.io.*;
import java.util.*;

import org.selftestexercises.chapter4.absolutejava.Date;

public class BlogEntry {
	
	private String username;
	private String entry;
	private Date dateEntry = new Date(6, 9, 1996);
	
	public BlogEntry() {
		username = "Unknown";
		entry = "Empty";
	}
	
	public BlogEntry(String username, String entry, Date dateEntry) {
		this.username = username;
		this.entry = entry;
		this.dateEntry = new Date();
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setEntry(String entry) {
		this.entry = entry;
	}
	
	public String getEntry() {
		return this.entry;
	}
	
	public void setDateEntry(Date dateEntry) {
		this.dateEntry = dateEntry;
	}
	
	public Date getDateEntry() {
		return this.dateEntry;
	}
	
	public void displayEntry(String username, String entry, Date dateEntry) {
		System.out.println("Author: " + username + "\nMy Blog:" + entry + "\n" + "Date: " + dateEntry + "\n");
	}
	
	public void getSummary() {
		StringTokenizer words = new StringTokenizer(entry, " \n.,");
		for (int i = 0; i < 10; i++) {
			System.out.println(words.nextToken());
			if (!(words.hasMoreTokens())) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Date entry = new Date(6, 9, 1996);
		BlogEntry blog = new BlogEntry("Ramein", "My name is Ramein, that is all.", entry);
		blog.displayEntry("Ramein", "My name is Ramein, that is all.", entry);
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("essay.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(0);
		}
	
		String sentences = "";
		while (fileIn.hasNextLine()) {
			sentences = sentences + "\n" + fileIn.nextLine();
		}
		BlogEntry blog2 = new BlogEntry("Ramein Zahedi", sentences, entry);
		blog2.displayEntry("Ramein Zahedi", sentences, entry);
		blog2.getSummary();
		blog2.displayEntry("Jack Bower", sentences, new Date("February", 12, 1999));
		
	}
}
