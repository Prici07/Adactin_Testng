package com.helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class File_Reader {
	
	private File_Reader() {
	}
		
		
	
		public  static File_Reader getInstanceFRM() {
			File_Reader fm= new File_Reader();
	        return fm;
		}

		public Config_Reader getInstanceCR() throws IOException {
			Config_Reader cr= new Config_Reader();
			return cr;

		}


	}


