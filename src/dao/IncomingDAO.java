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

		PreparedStatement st=con.prepareStatement(
			"select * from incoming_data where supplier_code like ?");
		st.setString(1, supplierCode);
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Incoming i=new Incoming();
			i.setIncomingNumber(rs.getInt("incoming_number"));
			i.setProductCode(rs.getString("product_code"));
			i.setSupplierCode(rs.getString("supplier_code"));
			i.setWarehouseCode(rs.getString("worehouse_code"));
			i.setIncomingDate(rs.getString("incoming_date"));
			i.setPersonName(rs.getString("person_name"));
			i.setVolume(rs.getInt("volume"));
			i.setPrice(rs.getInt("price"));
			list.add(i);
		}

		st.close();
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
