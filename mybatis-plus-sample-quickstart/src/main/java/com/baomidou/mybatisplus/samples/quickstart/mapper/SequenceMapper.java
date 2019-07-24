package com.baomidou.mybatisplus.samples.quickstart.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.quickstart.entity.Sequence;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lcc
 * @since 2019-07-24
 */
public interface SequenceMapper extends BaseMapper<Sequence> {
	Integer selectSequence(@Param("se") Sequence Sequence);
}
