package com.hp.exstream.qa.commonlib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoIt_Library {

	
	public int browseWndFile(String autoItExe_BrowseWndFileLocation) throws IOException, InterruptedException
	{
		Process p = Runtime.getRuntime().exec(autoItExe_BrowseWndFileLocation);

		BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

		String line;
		while ((line = input.readLine()) != null) {
		  System.out.println(line);
		}
		// method waitFor() will make the current thread to wait until the external program finishes and returns the exit value.

		int exitVal = p.waitFor();
		System.out.println("Exited with error code "+exitVal);
		return exitVal;
	}
}
