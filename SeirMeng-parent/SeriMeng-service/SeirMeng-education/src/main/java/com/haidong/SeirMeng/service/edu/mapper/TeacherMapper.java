package com.haidong.SeirMeng.service.edu.mapper;

import com.haidong.SeirMeng.service.edu.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 讲师 Mapper 接口
 * </p>
 *
 * @author atguigu
 * @since 2021-11-14
 */
@Component
public interface TeacherMapper extends BaseMapper<Teacher> {

    List<Teacher> getView();
}
