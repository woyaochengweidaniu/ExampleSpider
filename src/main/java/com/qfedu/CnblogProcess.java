package com.qfedu;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class CnblogProcess implements PageProcessor {
   Site site = Site.me().setRetryTimes(3).setTimeOut(3000);

    public void process(Page page) {
        //图片路径
        List<String> tile =  page.getHtml().xpath("ul[@class='listUl']/li/div[@class='img_list']/a/img/@lazy_src").all();
        //租金
        List<String> moneylist =  page.getHtml().xpath("ul[@class='listUl']/li/div[@class='listliright']/div[@class='money']/b[@class='strongbox']/text()").all();
        //房屋描述
        List<String> desc =  page.getHtml().xpath("ul[@class='listUl']/li/div[@class='des']/h2/a/text()").all();
        //规模大小
        List<String> guimo =  page.getHtml().xpath("ul[@class='listUl']/li/div[@class='des']/p[@class='room strongbox']/text()").all();
        //描述

        for (int i = 0;i<tile.size();i++){

            System.out.println("src："+tile.get(i));
            System.out.println("租金："+moneylist.get(i));
            System.out.println("描述："+desc.get(i));
           System.out.println("类型："+guimo.get(i));

        }

       // System.err.println("http;" + page.getHtml().get());
    }

    public Site getSite() {
        return site ;
    }
}
