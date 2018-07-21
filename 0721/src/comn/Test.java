package comn;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @File name:  test.java
 * @Description:   
 * @Create on:  2018年7月21日 上午11:16:39
 * @LinkPage :  
 * @ChangeList
 * ---------------------------------------------------
 * Date         Editor              ChangeReasons
 *
 *
 */
public class Test extends HttpServlet {

	@Override
	/**
	 * request 请求，用户发过来的东西都在这里面
	 * response 响应，你想告诉用户的东西都在这里面
	 * 注意，异常不能删掉
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String pwd=request.getParameter("password");
		System.out.println("输入的用户名是："+username);
		System.out.println("输入的密码是："+pwd);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

	

}
