$(document).ready(function(){
    var data={
        list:window.list,
    }
    var html=template("everyDayTml",data);
    document.getElementById("everyDayDiv").innerHTML=html;
});
