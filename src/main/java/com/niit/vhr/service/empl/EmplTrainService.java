package com.niit.vhr.service.empl;

import com.github.pagehelper.PageHelper;
import com.niit.vhr.mapper.EmployeetrainMapper;
import com.niit.vhr.model.Employeetrain;
import com.niit.vhr.model.RespPageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackgeName: com.niit.vhr.service.empl
 * @ClassName: EmplTrainService
 * @Author: redhood
 * Date: 2020/5/12 10:04
 * project name: vhr
 * @Version:
 * @Description:
 */
@Service
public class EmplTrainService {
    @Resource
    EmployeetrainMapper employeetrainMapper;

    public RespPageBean getall(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Employeetrain> data = employeetrainMapper.getAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(20L);
        return bean;
    }

    public Integer addTrain(Employeetrain employeetrain) {
        return employeetrainMapper.insert(employeetrain);
    }

    public Integer updateTrain(Employeetrain employeetrain) {
        return employeetrainMapper.updateByPrimaryKeySelective(employeetrain);
    }

    public int deleteTrain(Employeetrain employeetrain) {
        return employeetrainMapper.deleteByPrimaryKey(employeetrain.getId());
    }
}
