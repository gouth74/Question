package com.revature;

import java.sql.SQLException;
import java.util.Scanner;

public class TestInsertQuestion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s = new Scanner(System.in);
		System.out.println("Enter the Question Name:");
		//String Qtext = "SPM stands for _ _ _ _";
	    String Qtext = s.nextLine();
	    System.out.println("Enter the Question Type:");
	    int qtype = s.nextInt();
	    System.out.println("Enter the Score:");
	    int score = s.nextInt();
		InsertQuestion.insert(Qtext, qtype,score);
		s.close();
	}
}
