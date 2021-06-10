package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Incoming;

public class WarehouseDAO extends DAO {

	public List<Incoming> search() throws Exception {
		List<Incoming> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from warehouse_master");

		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Incoming i=new Incoming();
			i.setWarehouseCode(rs.getString("warehouse_code"));
			list.add(i);
		}

		st.close();
		con.close();

		return list;
	}
}