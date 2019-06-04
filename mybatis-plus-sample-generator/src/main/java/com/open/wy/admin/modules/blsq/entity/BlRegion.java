package com.open.wy.admin.modules.blsq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lcc
 * @since 2019-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BlRegion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * uuid主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 小区名
     */
    private String regionName;

    /**
     * 小区类型
     */
    private String regionType;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 定位经纬度
     */
    private String location;

    /**
     * 管理处负责人
     */
    private String manager;

    /**
     * 管理处电话
     */
    private String mobile;

    /**
     * 状态(0为正常/1为禁用)
     */
    private Integer regionState;

    /**
     * 报修人名称
     */
    private String repairUser;

    /**
     * 报修电话
     */
    private String repairPhone;

    /**
     * 删除标志(0为不是,1为是)
     */
    private Integer delFlag;

    /**
     * 乐观锁标识
     */
    private Integer version;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
