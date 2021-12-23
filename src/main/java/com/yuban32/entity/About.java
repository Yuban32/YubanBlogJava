package com.yuban32.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_about")
public class About implements Serializable {
    @TableId(value = "id" , type = IdType.AUTO)
    private Long id;

    @NotBlank(message = "内容不能为空")
    private String Content;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime created;
}
