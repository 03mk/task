$(function(){

    /// 選択肢の表示(text)と値(val)を持たせたオブジェクトの配列
    let productCodeList = []
    let supplierCodeList = []
    let warehouseCodeList = []
    let incomingDateList = []
    let personNameList = []
    let volumeList = []
    let priceList = []

    ///jsonファイルの読み込み
    url = 'incomingData.json';
    $.getJSON(url, (data) => {
      for (let i = 0; i < data.length; i++) {
        productCodeList[i] = {text: data[i].productCode, value: data[i].productCode};
        supplierCodeList[i] = {text: data[i].supplierCode, value: data[i].supplierCode};
        warehouseCodeList[i] ={text: data[i].warehouseCode, value: data[i].warehouseCode};
        incomingDateList[i] ={text: data[i].incomingDate, value: data[i].incomingDate};
        personNameList[i] ={text: data[i].personName, value: data[i].personName};
        volumeList[i] ={text: data[i].volume, value: data[i].volume};
        priceList[i] ={text: data[i].price, value: data[i].price};
      }

      /// jQueryによるセレクトボックス初期化
      var select = $('#productCode');
      var keys = Object.keys(productCodeList);
      keys.forEach(function(key, i){
        /// option要素を動的に生成＆追加
        var content = this[key];
        var option = $('<option>')
          .text(content['text'])
          .val(content['value']);
        select.append(option);
      }, productCodeList);

      /// jQueryによるセレクトボックス初期化
      var select = $('#supplierCode');
      var keys = Object.keys(supplierCodeList);
      keys.forEach(function(key, i){
        /// option要素を動的に生成＆追加
        var content = this[key];
        var option = $('<option>')
          .text(content['text'])
          .val(content['value']);
        select.append(option);
      }, supplierCodeList);

      /// jQueryによるセレクトボックス初期化
      var select = $('#warehouseCode');
      var keys = Object.keys(warehouseCodeList);
      keys.forEach(function(key, i){
        /// option要素を動的に生成＆追加
        var content = this[key];
        var option = $('<option>')
          .text(content['text'])
          .val(content['value']);
        select.append(option);
      }, warehouseCodeList);

      /// jQueryによるセレクトボックス初期化
      var select = $('#incomingDate');
      var keys = Object.keys(incomingDateList);
      keys.forEach(function(key, i){
        /// option要素を動的に生成＆追加
        var content = this[key];
        var option = $('<option>')
          .text(content['text'])
          .val(content['value']);
        select.append(option);
      }, incomingDateList);

      /// jQueryによるセレクトボックス初期化
      var select = $('#personName');
      var keys = Object.keys(personNameList);
      keys.forEach(function(key, i){
        /// option要素を動的に生成＆追加
        var content = this[key];
        var option = $('<option>')
          .text(content['text'])
          .val(content['value']);
        select.append(option);
      }, personNameList);

      /// jQueryによるセレクトボックス初期化
      var select = $('#volume');
      var keys = Object.keys(volumeList);
      keys.forEach(function(key, i){
        /// option要素を動的に生成＆追加
        var content = this[key];
        var option = $('<option>')
          .text(content['text'])
          .val(content['value']);
        select.append(option);
      }, volumeList);

      /// jQueryによるセレクトボックス初期化
      var select = $('#price');
      var keys = Object.keys(priceList);
      keys.forEach(function(key, i){
        /// option要素を動的に生成＆追加
        var content = this[key];
        var option = $('<option>')
          .text(content['text'])
          .val(content['value']);
        select.append(option);
      }, priceList);
    });

  })