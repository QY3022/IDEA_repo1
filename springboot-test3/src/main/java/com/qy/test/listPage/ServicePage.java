package com.qy.test.listPage;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author by QY3022
 * @date 2020/2/24.
 */
public class ServicePage {
    public static Page fen(Page page) {
        try {
            //查询出的list数据
            List<Integer> list = Lists.newArrayList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(9);
            list.add(10);
            list.add(11);
            list.add(12);
            list.add(13);

            //刚开始的页面为第一页
            if (page.getCurrentPage() == null) {
                page.setCurrentPage(1);
            } else {
                page.setCurrentPage(page.getCurrentPage());
            }
            //设置每页数据为十条
            page.setPageSize(10);
            //每页的开始数
            page.setStar((page.getCurrentPage() - 1) * page.getPageSize());
            //list的大小
            int count = list.size();
            //设置总页数
            page.setTotalPage(count % 10 == 0 ? count / 10 : count / 10 + 1);
            //对list进行截取
            page.setDataList(list.subList(page.getStar(), count - page.getStar() > page.getPageSize() ? page.getStar() + page.getPageSize() : count));
            return page;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return page;
    }
}

