package chapter26;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import tool.Page;

@WebServlet(urlPatterns={"/chapter26/name-search"})
public class NameSearch extends HttpServlet {
	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
				"java:/comp/env/jdbc/book");
			Connection con=ds.getConnection();

			String sname=request.getParameter("sname");


			PreparedStatement st=con.prepareStatement(
				"select * from stock where 材料名=?  ");
			st.setString(1, "%"+ sname +"%");

			ResultSet rs=st.executeQuery();

			while (rs.next()) {
				out.println(rs.getInt("材料名"));
				out.println("：");
				out.println(rs.getString("材料型番"));
				out.println("：");
				out.println(rs.getInt("在庫数"));
				out.println("：");
				out.println(rs.getInt("入荷日"));
				out.println("<br>");
			}

			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}

