package com.microli.provider.feigncontroller;



import com.microli.datalink.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class ProController {

    @RequestMapping("/list")
    public List<UserDto> queryList() {
        /*
        * 此处为模拟操作DB获取数据
        * provider中也可以有自己的service书写真正的业务逻辑
        * */

        // 初始化数据
        UserDto testDTO1 = new UserDto();
        testDTO1.setId(1);
        testDTO1.setName("学生");
        testDTO1.setNumber(100);
        UserDto testDTO2 = new UserDto();
        testDTO2.setId(2);
        testDTO2.setName("教师");
        testDTO2.setNumber(101);
        // 组装数据
        List<UserDto> list = new ArrayList<>();
        list.add(testDTO1);
        list.add(testDTO2);
        return list;
    }
}
