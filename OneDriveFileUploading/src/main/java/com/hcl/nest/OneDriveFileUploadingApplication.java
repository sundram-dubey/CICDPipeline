package com.hcl.nest;

import java.io.File;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneDriveFileUploadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneDriveFileUploadingApplication.class, args);
		onedriveFileUpload();
	}

	public static void onedriveFileUpload() {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost uploadFile = new HttpPost("https://apis.live.net/v5.0/folder.id");

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		uploadFile.addHeader("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJub25jZSI6IkFyNHIyYm1Cb1RlSXZPaGpKY25Nc2RLNnRibEJTSzFkOFlGNWk3LUEtbkEiLCJhbGciOiJSUzI1NiIsIng1dCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyIsImtpZCI6Ii1LSTNROW5OUjdiUm9meG1lWm9YcWJIWkdldyJ9.eyJhdWQiOiJodHRwczovL2dyYXBoLm1pY3Jvc29mdC5jb20iLCJpc3MiOiJodHRwczovL3N0cy53aW5kb3dzLm5ldC8xODlkZTczNy1jOTNhLTRmNWEtOGI2OC02ZjRjYTk5NDE5MTIvIiwiaWF0IjoxNjcxMTIwNTc3LCJuYmYiOjE2NzExMjA1NzcsImV4cCI6MTY3MTEyNTk3NCwiYWNjdCI6MCwiYWNyIjoiMSIsImFpbyI6IkFWUUFxLzhUQUFBQVVmMlJmQ2FLVVN4SmU2QlpFdUtWcW9udUdOZXY5Z2pldTI4MFc3MDRMRzVJMFJDaXFLanVPci9IUXNobFB6bW9GYTZIZnQ5dEkxZ1cyTWRhdFdYWk05b09xVzJsdDNPSUxUTDFVLzQyRU84PSIsImFtciI6WyJyc2EiLCJtZmEiXSwiYXBwX2Rpc3BsYXluYW1lIjoiRGlnaXRhbCBDb2xsZWFndWUiLCJhcHBpZCI6ImRhOGYwZWExLTVhNmYtNGNkNS1iNTMxLTBiYzIxM2I5Y2U2MCIsImFwcGlkYWNyIjoiMSIsImRldmljZWlkIjoiOTc3OGJjNTctMGUwOC00NjdlLWExMzYtYzMxOGQzNDJjOWI5IiwiZmFtaWx5X25hbWUiOiJEdWJleSIsImdpdmVuX25hbWUiOiJTdW5kcmFtIiwiaWR0eXAiOiJ1c2VyIiwiaXBhZGRyIjoiMTQ4LjY0LjcuMjEzIiwibmFtZSI6IlN1bmRyYW0gRHViZXkiLCJvaWQiOiIyYTZiNzkwMS0xZDc5LTQ5YzUtYTNjNy03MWI2OWNlNWFlMzQiLCJvbnByZW1fc2lkIjoiUy0xLTUtMjEtMzMzNjUzMDEzLTIzMDQ4Mzk5NjAtMzg3NjIwMzkzMi0xODI5NzkwIiwicGxhdGYiOiIzIiwicHVpZCI6IjEwMDMyMDAyMTVENEUxQjUiLCJyaCI6IjAuQVE4QU4tZWRHRHJKV2stTGFHOU1xWlFaRWdNQUFBQUFBQUFBd0FBQUFBQUFBQUFQQUowLiIsInNjcCI6Ik1haWwuUmVhZCBNYWlsLlNlbmQgU01UUC5TZW5kIFVzZXIuUmVhZCIsInNpZ25pbl9zdGF0ZSI6WyJkdmNfbW5nZCIsImR2Y19jbXAiLCJkdmNfZG1qZCIsImttc2kiXSwic3ViIjoicmNPSnk2Q2stRWxCTUhvbDRGLUx2OTZiQkFwNjRUQ3M1Q3VEd3lTSS1vSSIsInRlbmFudF9yZWdpb25fc2NvcGUiOiJBUyIsInRpZCI6IjE4OWRlNzM3LWM5M2EtNGY1YS04YjY4LTZmNGNhOTk0MTkxMiIsInVuaXF1ZV9uYW1lIjoic3VuZHJhbS5kdWJleUBoY2wuY29tIiwidXBuIjoic3VuZHJhbS5kdWJleUBoY2wuY29tIiwidXRpIjoibXNEUzBaUnBtMENrOWNTUVRlUlVBQSIsInZlciI6IjEuMCIsIndpZHMiOlsiYjc5ZmJmNGQtM2VmOS00Njg5LTgxNDMtNzZiMTk0ZTg1NTA5Il0sInhtc190Y2R0IjoxMzc5NDA0MDQ1fQ.OcYesthZvrFmYVwwPH6NDQ3_9aWGjPesalMCxoNz81V2xTwXJOP-8bqGUuo7-SD_Cvo5iQKvGfFTvlPMqUvCSQqq9C8EbAGMuLip8iF9cKdw6qQ9mMKHZJEyKvVVF1OLG8DEZyuzRuE6cSa2e9fORvb5yNRSahRkDHvRkmJBKu49Os8YCFm97g3bIjkKJNo4JeG9emiVyL8Q9pa7iBGlWudEfBJrAC6xEkp8RuAv_qwHOZHmbES5wu-_uTVVL5SGmNMjzBdBnMpz-ATgI3ud1a4pN2VlrnVE7hofR8skLiGPfCrvDI3w6fjhXJIDfTEhYoiK49VU83jRMvTR9ta64Q");
		builder.addPart("file", new FileBody(new File(
				"C:\\Users\\sundram.dubey\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\workitem_solution.png"),
				ContentType.APPLICATION_OCTET_STREAM,
				"C:\\Users\\sundram.dubey\\OneDrive - HCL Technologies Ltd\\Pictures\\Screenshots\\workitem_solution.png"));

		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		Charset chars = Charset.forName("utf-8");
		builder.setCharset(chars);
		uploadFile.setEntity(builder.build());
		uploadFile.setHeader("Content-Type", "multipart/form-data");
		uploadFile.setHeader("charset", "UTF-8");
		uploadFile.setHeader("boundary", "AaB03x");
		HttpResponse response = null;
		try {
			response = (HttpResponse) httpClient.execute(uploadFile);
			HttpEntity responseEntity = ((HttpEntityEnclosingRequestBase) response).getEntity();
			String json = EntityUtils.toString(responseEntity);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("OneDriveFileUploadingApplication.onedriveFileUpload()");
		}

	}

}
