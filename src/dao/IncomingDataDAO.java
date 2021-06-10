package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.IncomingData;

public class IncomingDataDAO extends DAO {

	public List<IncomingData> search() throws Exception {

		List<IncomingData> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
			"select * from incoming_data");
		ResultSet rs = st.executeQuery();

		while(rs.next()) {
			IncomingData id = new IncomingData();
			id.setIncomingNumber(rs.getInt("incoming_number"));
			id.setProductCode(rs.getString("product_code"));
			id.setSupplierCode(rs.getString("supplier_code"));
			id.setWarehouseCode(rs.getString("warehouse_code"));
			id.setIncomingDate(rs.getString("incoming_date"));
			id.setPersonName(rs.getString("person_name"));
			id.setVolume(rs.getInt("volume"));
			id.setPrice(rs.getInt("price"));
			list.add(id);
		}

		st.close();
		con.close();

		return list;
	}
}
