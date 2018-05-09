package com.tm.service.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.tm.model.Student;

public class StudentClientTest {

	public StudentClientTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  try {

				URL url = new URL("http://localhost:8080/FirstApp/rest/students");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				//conn.setDoOutput(true);
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Content-Type", "application/xml");

				String input = "{\"age\":20,\"emp_id\":108,\"emp_name\":\"sakshi\"}";

				JAXBContext jc=null;
				try {
					jc = JAXBContext.newInstance(Student.class);
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				InputStream xml = conn.getInputStream();
				Student student = 
				    (Student) jc.createUnmarshaller().unmarshal(xml);
					conn.disconnect();
				
	
				  } catch (MalformedURLException e) {

					e.printStackTrace();

				  } catch (IOException e) {

					e.printStackTrace();

				 } catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				}

	}


