$(function () {
    if (!('' == user || null == user)) {
        initmenu();
    }else{
        jalendar_event();
    }
});
