//在庫データベース操作 JSP/サーブレット教科書235参照

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Inventory;

public class InventoryDAO extends DAO {

	public List<Inventory> search(String productCode) throws Exception {
		List<Inventory> list=new ArrayList<>();

		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from inventory_data where product_code like ?");
		st.setString(1,  "%"+ productCode +"%");
		ResultSet rs=st.executeQuery();

		while (rs.next()) {
			Inventory i=new Inventory();
			i.setInventoryNumber(rs.getInt("inventory_number"));
			i.setWarehouseCode(rs.getString("warehouse_code"));
			i.setProductCode(rs.getString("product_code"));
//			i.setRotNumber(rs.getString("rot_number"));
//			i.setProductQuality(rs.getString("product_quality"));
			i.setActualStock(rs.getInt("actual_stock"));
//			i.setActiveStock(rs.getInt("active_stock"));
			list.add(i);
		}

		st.close();
		con.close();

		return list;
	}


	public int insert(Inventory inventory) throws Exception {
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"insert into inventory_data values(null,?, ?, ?)");
		st.setString(1, inventory.getWarehouseCode());
		st.setString(2, inventory.getProductCode());
//		st.setString(3, inventory.getRotNumber());
//		st.setString(4, inventory.getProductQuality());
		st.setInt(3, inventory.getActualStock());
//		st.setInt(6, inventory.getActiveStock());
		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
	}
}

