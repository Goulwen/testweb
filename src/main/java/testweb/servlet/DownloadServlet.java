package testweb.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			InputStream is = new FileInputStream("C:\\Users\\admin\\Downloads\\apache-tomcat-7.0.92.zip");
			//OutputStream os = resp.getOutputStream();
			ServletOutputStream os = resp.getOutputStream();
			
			resp.setContentType("application/zip");
			resp.setHeader("Content-Disposition","attachment;filename=nom_choisi_apache.zip");
			
			int count;
			
			byte buf[] = new byte[4096];
			while ((count = is.read(buf)) > -1)
				os.write(buf, 0, count);
			
			is.close();
			os.close();
		} catch (Exception e) {
			resp.setStatus(500);
		}
	}
}
