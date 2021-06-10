//入荷アクション JSP/サーブレット教科書373ページ参照

package chapter26;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Incoming;
import dao.IncomingDAO;
import tool.Action;

public class IncomingAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String productCode=request.getParameter("productCode");
		String  supplierCode = request.getParameter("supplierCode");
		String  warehouseCode = request.getParameter("warehouseCode");
		String  incomingDate = request.getParameter("incomingDate");
		String  personName = request.getParameter("personName");
		Integer volume=Integer.parseInt(request.getParameter("volume"));
		Integer price=Integer.parseInt(request.getParameter("price"));


		Incoming i=new Incoming();
		i.setProductCode(productCode);
		i.setSupplierCode(supplierCode);
		i.setWarehouseCode(warehouseCode);
		i.setIncomingDate(incomingDate);
		i.setPersonName(personName);
		i.setVolume(volume);
		i.setPrice(price);
		IncomingDAO dao=new IncomingDAO();
		dao.insert(i);

		List<Incoming> list = dao.search("");
		request.setAttribute("list2", list);

		return "incoming-ok.jsp";
	}
}

