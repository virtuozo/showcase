package virtuozo.showcase.server;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/code-server/*")
public class CodeServer extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String clazz = request.getParameter("class").replace(".", "/").concat(".java");
    System.out.println(clazz);
    
    InputStream file = this.getClass().getClassLoader().getResourceAsStream(clazz);
    byte[] buffer = new byte[file.available()];
    file.read(buffer);
    
    response.getOutputStream().write(buffer);
  }
}
