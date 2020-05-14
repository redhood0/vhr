package com.niit.vhr.controller.employee;

import com.niit.vhr.model.Employeetrain;
import com.niit.vhr.model.Hr;
import com.niit.vhr.model.RespBean;
import com.niit.vhr.model.RespPageBean;
import com.niit.vhr.service.HrService;
import com.niit.vhr.service.empl.EmplTrainService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PackgeName: com.niit.vhr.controller.employee
 * @ClassName: TrainController
 * @Author: redhood
 * Date: 2020/5/13 16:02
 * project name: vhr
 * @Version:
 * @Description:
 */
@RestController
@RequestMapping("/empl")
public class TrainController {
    @Autowired
    EmplTrainService emplTrainService;

    //read
    @ApiOperation(value = "查找出所有的训练记录，分页")
    @GetMapping("/getAllTrain")
    public RespBean getAllTrain(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        RespPageBean bean = emplTrainService.getall(page,size);
        return RespBean.ok("", bean);
    }

    //creat
    @ApiOperation(value = "添加一条记录")
    @PostMapping("/addTrain")
    public RespBean addTrain(@RequestBody Employeetrain employeetrain) {
        emplTrainService.addTrain(employeetrain);
        return RespBean.ok("add success");
    }

    //update
    @ApiOperation(value = "修改一条记录")
    @PostMapping("/updateTrain")
    public RespBean updateTrain(@RequestBody Employeetrain employeetrain) {
        emplTrainService.updateTrain(employeetrain);
        return RespBean.ok("add success");
    }

    //delete
    @ApiOperation(value = "删除一条记录")
    @PostMapping("/deleteTrain")
    public RespBean deleteTrain(@RequestBody Employeetrain employeetrain) {
        emplTrainService.deleteTrain(employeetrain);
        return RespBean.ok("add success");
    }
}
