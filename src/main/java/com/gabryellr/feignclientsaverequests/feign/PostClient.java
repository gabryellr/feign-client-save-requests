package com.gabryellr.feignclientsaverequests.feign;

import com.gabryellr.feignclientsaverequests.feign.config.FeignConfig;
import com.gabryellr.feignclientsaverequests.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "postClient", url = "https://run.mocky.io/v3", configuration = FeignConfig.class)
public interface PostClient {

    @PostMapping(value = "/a20c7353-7307-491f-b4c2-7888022a4e2d")
    Post successCall(@RequestBody Post post);

    @PostMapping(value = "/776f6512-86e3-4a3b-b352-0c14b2dee199")
    Post badRequest(@RequestBody Post post);

}
