package chapter26;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.stream.JsonWriter;

import bean.IncomingData;
import dao.IncomingDataDAO;
import tool.Action;

public class IncomingDataAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
		) throws Exception {

			IncomingDataDAO dao=new IncomingDataDAO();
			List<IncomingData> list=dao.search();

			File file = new File("C:\\pleiades\\workspace\\testproj1\\WebContent\\chapter26\\incomingData.json");

			//Jsonファイルに書き出し
			try (JsonWriter writer = new JsonWriter(new FileWriter(file))) {
				writer.setIndent(" ");
		        writer.beginArray();

		        for (IncomingData item : list) {
		        	writer.beginObject();
		        	writer.name("incomingNumber").value(item.getIncomingNumber());
		        	writer.name("productCode").value(item.getProductCode());
		        	writer.name("supplierCode").value(item.getSupplierCode());
		        	writer.name("warehouseCode").value(item.getWarehouseCode());
		        	writer.name("incomingDate").value(item.getIncomingDate());
		        	writer.name("personName").value(item.getPersonName());
		        	writer.name("volume").value(item.getVolume());
		        	writer.name("price").value(item.getPrice());
		        	writer.endObject();
		        }

		        writer.endArray();
		    }

			return "search_db.jsp";
	}
}