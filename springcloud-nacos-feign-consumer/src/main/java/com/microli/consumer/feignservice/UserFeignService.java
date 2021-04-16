package com.microli.consumer.feignservice;


import com.microli.datalink.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Feign接口
 * @author 李洋林
 */
@FeignClient("pro")
public interface UserFeignService {
    @RequestMapping("/list")
    List<UserDto> queryList();
}