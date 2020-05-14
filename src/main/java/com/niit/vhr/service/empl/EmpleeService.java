package com.niit.vhr.service.empl;

import com.github.pagehelper.PageHelper;
import com.niit.vhr.mapper.EmployeeMapper;
import com.niit.vhr.model.Employee;
import com.niit.vhr.model.RespPageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @PackgeName: com.niit.vhr.service.empl
 * @ClassName: EmpleeService
 * @Author: redhood
 * Date: 2020/5/12 12:37
 * project name: vhr
 * @Version:1.0
 * @Description:人事信息统计
 */
@Service
@Slf4j(topic = "EmpleeService.class")
public class EmpleeService {
    @Resource
    EmployeeMapper employeeMapper;

    public RespPageBean getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if (page != null && size != null) {
            page = (page - 1) * size;
        }
        List<Employee> data = employeeMapper.getEmployeeByPage(page, size, employee, beginDateScope);
        Long total = employeeMapper.getTotal(employee, beginDateScope);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    public RespPageBean getEmployee(Integer page, Integer size) {
//        if (page != null && size != null) {
//            page = (page - 1) * size;
//        }
//        List<Employee> data = employeeMapper.getEmployeeByPage(page, size, employee, beginDateScope);
//        Long total = employeeMapper.getTotal(employee, beginDateScope);
//        RespPageBean bean = new RespPageBean();
//        bean.setData(data);
//        bean.setTotal(total);
        PageHelper.startPage(page, size);
        List<Employee> data = employeeMapper.getAll();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(617L);
        return bean;
    }
}
