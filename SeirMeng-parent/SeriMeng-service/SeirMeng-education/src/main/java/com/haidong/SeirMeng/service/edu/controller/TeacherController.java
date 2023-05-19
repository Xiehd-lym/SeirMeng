package com.haidong.SeirMeng.service.edu.controller;

import com.haidong.SeirMeng.service.base.result.R;
import com.haidong.SeirMeng.service.edu.entity.Teacher;
import com.haidong.SeirMeng.service.edu.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2021-11-14
 */
@Slf4j
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("insert")
    public R insert(@RequestBody Teacher teacher){
        boolean b = teacherService.save(teacher);
        return R.ok().data("b",b);
    }

}

