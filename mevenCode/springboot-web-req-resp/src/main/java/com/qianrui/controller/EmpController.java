package com.qianrui.controller;

import com.qianrui.pojo.Emp;
import com.qianrui.pojo.Result;
import com.qianrui.service.EmpService;
import com.qianrui.service.impl.EmpServiceA;
import com.qianrui.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//如需切换bean，就将不需要交付的bean注释
//@Component  //将当前类交给IOC容器管理，成为IOC容器中的bean
public class EmpController {
	@Autowired  //运行时，IOC容器会提供该类的bean对象，并复制给该变量 - 依赖注入
	private EmpService empService;

	@RequestMapping("/listEmp")
	public Result list() {
		//1.调用service，获取数据
		List<Emp> empList = empService.listEmp();

		//3. 响应数据
		return Result.success(empList);
	}

    /*
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        //2. 对数据进行转换处理 - gender, job
        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else if("2".equals(gender)){
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任 , 3: 就业指导
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            }else if("2".equals(job)){
                emp.setJob("班主任");
            }else if("3".equals(job)){
                emp.setJob("就业指导");
            }
        });*/

}
