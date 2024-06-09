package com.hellotecky;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEcho {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(2000);
		Socket stk = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		
		String msg;
		do {
			msg=br.readLine();
			StringBuilder sb = new StringBuilder(msg);
			sb.reverse();
			msg  = sb.toString();
			
			ps.println(msg);
		}while(!msg.equals("dne"));
		
	}

}

class Client {

	public static void main(String[] args) throws Exception {
		Socket stk = new Socket("192.168.0.106",2000);
		
		BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps = new PrintStream(stk.getOutputStream());
		
		String msg;
		do {
			msg=keyb.readLine();
			ps.println(msg);
			msg=br.readLine();
			System.out.println("From Server: "+msg);
			
		}while(!msg.equals("dne"));
		stk.close();
	}

}