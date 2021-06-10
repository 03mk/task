<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet/JSP Samples</title>
</head>
<body>

<form action="IncomingData.action" method="post">
<input type="submit" value="ホームページから遷移">
</form>

     商品コード<select id="productCode">
        <option selected disabled hidden>選んでください</option>
    </select>

     仕入先コード<select id="supplierCode">
        <option selected disabled hidden>選んでください</option>
    </select>

     倉庫コード<select id="warehouseCode">
        <option selected disabled hidden>選んでください</option>
    </select>

     入荷日<select id="incomingDate">
        <option selected disabled hidden>選んでください</option>
    </select>

     担当者名<select id="personName">
        <option selected disabled hidden>選んでください</option>
    </select>

     数量<select id="volume">
        <option selected disabled hidden>選んでください</option>
    </select>

     単価<select id="price">
        <option selected disabled hidden>選んでください</option>
    </select>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="../select_option.js"></script>
</body>
</html>