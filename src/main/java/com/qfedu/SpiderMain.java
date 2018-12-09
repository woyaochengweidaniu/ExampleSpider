package com.qfedu;

import us.codecraft.webmagic.Spider;

public class SpiderMain {

    public static void main(String[] args) {

        String url = "https://zz.58.com/zufang/?PGTID=0d200001-0015-6dac-1d32-bb7e3ddf44e9&ClickID=1";
        new Spider(new CnblogProcess()).addUrl(url).run();
    }
}
