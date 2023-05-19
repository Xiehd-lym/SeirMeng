package com.haidong.SeirMeng.service.base.model;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
//@Accessors用于配置getter和setter方法的生成结果,chain设置为true，则setter方法返回当前对象
@Accessors(chain = true)
public class BaseEntity {
    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "创建时间", example = "2019-01-01 8:00:00")
    @TableField(fill = FieldFill.INSERT)
    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间", example = "2019-01-01 8:00:00")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    //@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date gmtModified;

    @Version
    private Integer version;

}
