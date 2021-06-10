package chapter26;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Incoming;
import dao.ProductDAO;
import dao.SupplierDAO;
import dao.WarehouseDAO;
import dao.EmployeeDAO;

import tool.Action;

public class IncomingDataAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
		) throws Exception {

			ProductDAO proDao=new ProductDAO();     //商品マスタ(材料マスタ)
			SupplierDAO supDao=new SupplierDAO();   //仕入先マスタ
			WarehouseDAO warDao=new WarehouseDAO(); //倉庫マスタ
			EmployeeDAO empDao = new EmployeeDAO(); //社員マスタ

			//データベースから取得したデータをそれぞれリストに代入
			List<Incoming> proList=proDao.search();
			List<Incoming> supList=supDao.search();
			List<Incoming> warList=warDao.search();
			List<Incoming> empList=empDao.search();

			//リクエスト属性に設定する
			request.setAttribute("supList", supList);
			request.setAttribute("proList", proList);
			request.setAttribute("warList", warList);
			request.setAttribute("empList", empList);


			return "incoming.jsp";
	}
}