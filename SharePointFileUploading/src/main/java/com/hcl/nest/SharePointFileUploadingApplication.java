package com.hcl.nest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.HttpClients;

@SpringBootApplication
public class SharePointFileUploadingApplication {

	static final String accessToken = "eyJ0eXAiOiJKV1QiLCJub25jZSI6IjVOVzNqRmlPNzFiOFpkYm5rY3B1V09mZFN4ODdhbXNuSkxQalVaeENHczgiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJodHRwczovL2dyYXBoLm1pY3Jvc29mdC5jb20iLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8xODlkZTczNy1jOTNhLTRmNWEtOGI2OC02ZjRjYTk5NDE5MTIvIiwiaWF0IjoxNjcyMDM0NjI2LCJuYmYiOjE2NzIwMzQ2MjYsImV4cCI6MTY3MjAzODUyNiwiYWlvIjoiRTJaZ1lNZ3hNSlJjTk45UXBtVFAxczdMOGxOTUFBPT0iLCJhcHBfZGlzcGxheW5hbWUiOiJEaWdpdGFsIENvbGxlYWd1ZSIsImFwcGlkIjoiZGE4ZjBlYTEtNWE2Zi00Y2Q1LWI1MzEtMGJjMjEzYjljZTYwIiwiYXBwaWRhY3IiOiIxIiwiaWRwIjoiaHR0cHM6Ly9zdHMud2luZG93cy5uZXQvMTg5ZGU3MzctYzkzYS00ZjVhLThiNjgtNmY0Y2E5OTQxOTEyLyIsImlkdHlwIjoiYXBwIiwib2lkIjoiYzM4Y2IyYWEtNmU1NS00YzA4LWEwNDEtYjQ2ZjAwZDgwZGE0IiwicmgiOiIwLkFROEFOLWVkR0RySldrLUxhRzlNcVpRWkVnTUFBQUFBQUFBQXdBQUFBQUFBQUFBUEFBQS4iLCJzdWIiOiJjMzhjYjJhYS02ZTU1LTRjMDgtYTA0MS1iNDZmMDBkODBkYTQiLCJ0ZW5hbnRfcmVnaW9uX3Njb3BlIjoiQVMiLCJ0aWQiOiIxODlkZTczNy1jOTNhLTRmNWEtOGI2OC02ZjRjYTk5NDE5MTIiLCJ1dGkiOiI0dVp2eER2bVNrZWYxMFBGY1ZQekFBIiwidmVyIjoiMS4wIiwid2lkcyI6WyIwOTk3YTFkMC0wZDFkLTRhY2ItYjQwOC1kNWNhNzMxMjFlOTAiXSwieG1zX3RjZHQiOjEzNzk0MDQwNDV9.Ge05nWxtDzb4SSdEmnIcnGwZwNXb2xGXonG2FhmH67n31Fgc-Cw_I1UkrkIMn6JqlQDdWQSwUm3G9ZtkT_fmyUA6CFJBfR1ids1GBDQyGr5Vuem63ntSxIgVmfz766I0pua1CF3QlPp2j6NHmpvbQIafFfCVfIRwacVWNf53Ls2XsTJsvlG90Va62rKnahmA4w2419O1dbURzmM2afq63MIv9mFObzXrR0VQ7ovKRhjZaSyo09C4IN8Zk4m7xRKONmbR120QaCzk8o6yPOafHrT6fPGQ6LCy3vvitXElJxf0Y7FAz8QD8PKsu0Jfa2x0GIkWV9b5Go3UTV_48VyU3A";

	public static void main(String[] args) {
		SpringApplication.run(SharePointFileUploadingApplication.class, args);
		try {
			String fileName = "C:/Users/sundram.dubey/Downloads/jarfiles/lombok.jar";
			File file = new File(fileName);
			System.out.println("SharePointFileUploadingApplication.main() " + file.length() + "  file " + file + " \n\n");
			String res = uploadFileSP("https://hclo365.sharepoint.com/sites/ToscanaT3Site", file);
			System.out.println("SharePointFileUploadingApplication.main() " + res);
		} catch (Exception e) {
			System.out.println("SharePointFileUploadingApplication.main()" + e.getCause());
			e.printStackTrace();
		}
	}

	static String uploadFileSP(String siteURi, File file) throws ClientProtocolException, IOException {
		HttpPost postReq = new HttpPost(siteURi);
		postReq.addHeader("Accept", "application/json;odata=verbose");
		postReq.setHeader("Authorization", "Bearer " + accessToken);
		postReq.setEntity(new FileEntity(file));
		return "Response Code: " + HttpClients.createDefault().execute(postReq).getStatusLine();
	}
}
