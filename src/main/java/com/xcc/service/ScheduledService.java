package com.xcc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author xuhe
 * @PackageName:com.xcc.service
 * @ClassName:ScheduledService
 * @Description:
 * @data 2022/4/7 22:31
 */
@Service
public class ScheduledService {
    //在一个特定的时间执行这个代码 Timer
    //秒 分 时 日 月 周几
/*    @Scheduled(cron ="0 * * * * 0-7")
*       cron ="0 * * * * 0-7" 每分钟0第0秒执行
*
*
* */
    @Scheduled(cron ="0 15 10 * * ?") //每天10点15分0秒执行
    public void hello(){
        System.out.println("你被执行了");
    }
}
