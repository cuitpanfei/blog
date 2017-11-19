function initmenu(){
    $('#no-login').css({
        display: 'none'
    });
    $('#is-login').css({
        display: 'block'
    });
    updateTransaction(_contextPath);
}
/**
 *
 * @param _str 网站的根
 */
function updateTransaction(_str) {
    $.ajax({
        type: "POST",
        url: _str+"/user/events/getEvents.action",
        success: function (data) {
            var _Enevts = mosaicEvents(data);
            $("#yourId").html("");
            $("#yourId").append(_Enevts);
        },
        complete:function () {
            jalendar_event();
        }
    });
}

function mosaicEvents(obj) {
    var html = "";
    // var _i=0;
    obj.forEach(function (da) {
        var scheduleContent = da.scheduleContent==null?"":da.scheduleContent;
        html = html + '<div class="added-event" data-date="'+getNowFormatDate(da.creatDate)+'" data-title="'+scheduleContent+'"></div>\n';
    });
    return html;
}

function getNowFormatDate(date) {
    var currentdate = new Date(date).format('dd-MM-yyyy');
    return currentdate;
}

Date.prototype.format =function(format)
{
    var o = {
        "M+" : this.getMonth()+1, //month
        "d+" : this.getDate(), //day
        "h+" : this.getHours(), //hour
        "m+" : this.getMinutes(), //minute
        "s+" : this.getSeconds(), //second
        "q+" : Math.floor((this.getMonth()+3)/3), //quarter
        "S" : this.getMilliseconds() //millisecond
    }
    if(/(y+)/.test(format)) format=format.replace(RegExp.$1,
        (this.getFullYear()+"").substr(4- RegExp.$1.length));
    for(var k in o)if(new RegExp("("+ k +")").test(format))
        format = format.replace(RegExp.$1,
            // RegExp.$1.length==1? o[k] :
            //     ("00"+ o[k]).substr((""+ o[k]).length));
            o[k]);
    return format;
}
