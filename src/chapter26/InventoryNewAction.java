//在庫登録アクション

package chapter26;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Inventory;
import dao.InventoryDAO;
import tool.Action;

public class InventoryNewAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String  warehouseCode = request.getParameter("warehouseCode");
		String  productCode = request.getParameter("productCode");
		Integer actualStock=Integer.parseInt(request.getParameter("actualStock"));



		Inventory i=new Inventory();
		i.setProductCode(productCode);
		i.setWarehouseCode(warehouseCode);
		i.setActualStock(actualStock);
		InventoryDAO dao=new InventoryDAO();
		dao.insert(i);

		List<Inventory> list = dao.search("");
		request.setAttribute("list3", list);

		return "inventory-new-ok.jsp";
	}
}


