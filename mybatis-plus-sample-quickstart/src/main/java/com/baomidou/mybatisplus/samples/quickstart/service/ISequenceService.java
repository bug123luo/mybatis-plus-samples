package com.baomidou.mybatisplus.samples.quickstart.service;

import com.baomidou.mybatisplus.samples.quickstart.entity.Sequence;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lcc
 * @since 2019-07-24
 */
public interface ISequenceService extends IService<Sequence> {

	public Integer selectSequence(@Param("se") Sequence Sequence);
}
