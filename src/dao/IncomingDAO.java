//入荷データベース操作 JSP/サーブレット教科書235参照

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Incoming;


public class IncomingDAO extends DAO {

	public List<Incoming> search(String supplierCode) throws Exception {
		List<Incoming> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement proSt=con.prepareStatement(
				"select * from product_master");
		PreparedStatement supSt=con.prepareStatement(
				"select * from supplier_master");
		PreparedStatement warSt=con.prepareStatement(
				"select * from warehouse_master");
		PreparedStatement empSt=con.prepareStatement(
				"select * from employee_master");

		ResultSet proRs=proSt.executeQuery();
		ResultSet supRs=supSt.executeQuery();
		ResultSet warRs=warSt.executeQuery();
		ResultSet empRs=empSt.executeQuery();

		while (proRs.next()) {
			Incoming i=new Incoming();
			i.setProductCode(proRs.getString("product_code"));
			list.add(i);
		}
		while (proRs.next()) {
			Incoming i=new Incoming();
			i.setSupplierCode(supRs.getString("supplier_code"));
			list.add(i);
		}
		while (proRs.next()) {
			Incoming i=new Incoming();
			i.setWarehouseCode(warRs.getString("warehouse_code"));
			list.add(i);
		}
		while (proRs.next()) {
			Incoming i=new Incoming();
			i.setPersonName(empRs.getString("person_name"));
			list.add(i);
		}
		proSt.close();
		supSt.close();
		warSt.close();
		empSt.close();
		con.close();

		return list;
	}


	public int insert(Incoming incoming) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into incoming_data values(null,?,?,?,?,?, ?, ?)");
		st.setString(1, incoming.getProductCode());
		st.setString(2, incoming.getSupplierCode());
		st.setString(3, incoming.getWarehouseCode());
		st.setString(4, incoming.getIncomingDate());
		st.setString(5, incoming.getPersonName());
		st.setInt(6, incoming.getVolume());
		st.setInt(7,incoming.getPrice());

		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
}
