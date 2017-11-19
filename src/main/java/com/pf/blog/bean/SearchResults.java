package com.pf.blog.bean;

import com.pf.blog.entity.Article;
import com.pf.blog.entity.ArticleType;
import com.pf.blog.entity.Replay;
import com.pf.blog.entity.Schedule;
import com.pf.blog.entity.withblobs.ArticleWithBLOBs;
import com.pf.util.JsonUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cuitpanfei on 2017/11/11.
 */
@Data
public class SearchResults implements Serializable {
    List<ArticleWithBLOBs> articleList = new ArrayList<>();
    List<ArticleType> articleTypeList = new ArrayList<>();
    List<Schedule> scheduleList = new ArrayList<>();
    List<Replay> replayList = new ArrayList<>();

    @Override
    public String toString() {
        HashMap<String,List> allResult = new HashMap();
        allResult.put("Article",articleList);
        allResult.put("ArticleType",articleTypeList);
        allResult.put("Schedule",scheduleList);
        allResult.put("Replay",replayList);
        return JsonUtil.getInstance().obj2json(allResult);
    }
}
