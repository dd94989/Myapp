package com.hemaolin.springcloud.controller;

import com.hemaolin.springcloud.entities.CommonResult;
import com.hemaolin.springcloud.entities.Payment;
import com.hemaolin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author shkstart
 * @create 2022-10- 17- 17:19
 */
@Slf4j
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult  create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("插入结果：{}"+i );
        if(i>0){
            return new CommonResult(200,"插入成功,serverPort"+serverPort,i);
        }else {
            return new CommonResult(444,"插入失败,serverPort"+serverPort,null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment>  getPaymentById(@PathVariable("id")Long id, HttpSession session){
        session.setAttribute("name","123");
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("插入结果：{}"+paymentById);
        if(paymentById!=null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,paymentById);
        }else {
            return new CommonResult(444,"查询失败,serverPort"+serverPort,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String s:
             services) {
             log.info("*****element:{}",s);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance d:
                instances) {
            log.info("*****element:{},{},{},{}",d.getServiceId(),d.getHost(),d.getPort(),d.getUri());
        }
        return  this.discoveryClient;
    }
    @GetMapping("/payment/lb")
    public String getlb(){
        return serverPort;
    }
   @GetMapping("/payment/feign/timout")
    public String PaymentFeignTimout() {
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       return serverPort;
    }

}
