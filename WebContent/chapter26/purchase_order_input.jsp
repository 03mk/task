<%--注文書入力ページ--%>

<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<form action="purchase_order_output.jap" method="post">
<p>注文書</p>

注文書作成日<input type="date" name="createdDate"><br>
注文書提出日<input type="date" name="filingDate"><br><br>

<p>仕入れ先情報</p>
仕入先コード<input type="number" name="sid"><br>
仕入先名<input type="text" name="sname"><br>
仕入先担当者名<input type="text" name="spname"><br>
仕入先郵便番号<input type="number" name="szc1">
-<input type="number" name="szc2"><br>
仕入先都道府県<select name="sprefectures">
<option value="北海道">北海道</option>
<option value="青森県">青森県</option>
<option value="岩手県">岩手県</option>
<option value="宮城県">宮城県</option>
<option value="秋田県">秋田県</option>
<option value="山形県">山形県</option>
<option value="福島県">福島県</option>
<option value="茨城県">茨城県</option>
<option value="栃木県">栃木県</option>
<option value="群馬県">群馬県</option>
<option value="埼玉県">埼玉県</option>
<option value="千葉県">千葉県</option>
<option value="東京都">東京都</option>
<option value="神奈川県">神奈川県</option>
<option value="新潟県">新潟県</option>
<option value="富山県">富山県</option>
<option value="石川県">石川県</option>
<option value="福井県">福井県</option>
<option value="山梨県">山梨県</option>
<option value="長野県">長野県</option>
<option value="岐阜県">岐阜県</option>
<option value="静岡県">静岡県</option>
<option value="愛知県">愛知県</option>
<option value="三重県">三重県</option>
<option value="滋賀県">滋賀県</option>
<option value="京都府">京都府</option>
<option value="大阪府">大阪府</option>
<option value="兵庫県">兵庫県</option>
<option value="奈良県">奈良県</option>
<option value="和歌山県">和歌山県</option>
<option value="鳥取県">鳥取県</option>
<option value="島根県">島根県</option>
<option value="岡山県">岡山県</option>
<option value="広島県">広島県</option>
<option value="山口県">山口県</option>
<option value="徳島県">徳島県</option>
<option value="香川県">香川県</option>
<option value="愛媛県">愛媛県</option>
<option value="高知県">高知県</option>
<option value="福岡県">福岡県</option>
<option value="佐賀県">佐賀県</option>
<option value="長崎県">長崎県</option>
<option value="熊本県">熊本県</option>
<option value="大分県">大分県</option>
<option value="宮崎県">宮崎県</option>
<option value="鹿児島県">鹿児島県</option>
<option value="沖縄県">沖縄県</option>
</select><br>
仕入先住所<input type="text" name="saddress"><br>
仕入先電話番号<input type="tel" name="stel"><br>
仕入先メールアドレス<input type="email" name="smail"><br><br>

<p>自社情報</p>
自社名<input type="text" name="cname" value="株式会社いろは" disabled><br>
担当者名<input type="text" name="cpname"><br>
郵便番号<input type="number" name="czc1" value="777" disabled>
-<input type="number" name="czc2" value="7777" disabled><br>
住所<input type="text" name="caddress" value="大阪府大阪市" disabled><br>
電話番号<input type="tel" name="ctel" value="0000-555-555" disabled><br>
メールアドレス<input type="email" name="cmail" value="xxxyyy@gmail.com" disabled><br><br>

<p>注文材料</p>
材料コード<input type="number" name="mid"><br>
材料名<input type="text" name="mname"><br>
材料型番<input type="number" name="mnumber"><br>
仕入れ単価<input type="number" name="mprice">円<br>
数量<input type="number" name="mquantity"><br>


<p>備考欄</p>
<textarea name="remarks" cols="30" rows="5"></textarea><br><br><br>

<input type="submit" value="確認">

</form>
<%@include file="../footer.html" %>
