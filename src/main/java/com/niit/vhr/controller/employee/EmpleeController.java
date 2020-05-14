package com.niit.vhr.controller.employee;

import com.niit.vhr.model.RespBean;
import com.niit.vhr.model.RespPageBean;
import com.niit.vhr.service.empl.EmpleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @PackgeName: com.niit.vhr.controller.employee
 * @ClassName: HrMsgController
 * @Author: redhood
 * Date: 2020/5/12 17:33
 * project name: vhr
 * @Version:
 * @Description:
 */
@RestController
@RequestMapping("/employee")
public class EmpleeController {
    @Autowired
    EmpleeService empleeService;


    @GetMapping("/getAllEmpl")
    public RespBean getAllEmpl(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        RespPageBean respPageBean = empleeService.getEmployee(page,size);
        return RespBean.ok("", respPageBean);
    }

}
