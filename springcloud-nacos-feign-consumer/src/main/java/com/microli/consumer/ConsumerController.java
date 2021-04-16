package com.microli.consumer;


import com.microli.consumer.feignservice.UserFeignService;
import com.microli.consumer.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 消费测试接口
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
     @Autowired
    private UserFeignService providerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultVO getList() {
        // 远程调用
        return new ResultVO.Builder<>().code(200).message("success").data(providerService.queryList()).build();
    }

}