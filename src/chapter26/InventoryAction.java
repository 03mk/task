//在庫表示、検索アクション JSP/サーブレット教科書398参照

package chapter26;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Inventory;
import dao.InventoryDAO;
import tool.Action;

public class InventoryAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {


		String productCode=request.getParameter("productCode");
		if (productCode==null) productCode="";

		InventoryDAO dao=new InventoryDAO();
		List<Inventory> list=dao.search(productCode);

		request.setAttribute("list1", list);

		return "inventory.jsp";
	}
}