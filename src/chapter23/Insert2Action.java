package chapter23;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;
import tool.Action;

public class Insert2Action extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String name=request.getParameter("name");
		Integer price=Integer.parseInt(request.getParameter("price"));

		Product p=new Product();
		p.setName(name);
		p.setPrice(price);
		ProductDAO dao=new ProductDAO();
		dao.insert(p);

		Product c=new Product();
		c.setName(name + "づくし");
		c.setPrice(price * 5);
		dao.insert(c);

		List<Product> list=dao.search("");
		request.setAttribute("list", list);


		return "list.jsp";
	}
}
