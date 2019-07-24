package com.baomidou.mybatisplus.samples.quickstart.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.quickstart.entity.Sequence;
import com.baomidou.mybatisplus.samples.quickstart.mapper.SequenceMapper;
import com.baomidou.mybatisplus.samples.quickstart.service.ISequenceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcc
 * @since 2019-07-24
 */
@Service
public class SequenceServiceImpl extends ServiceImpl<SequenceMapper, Sequence> implements ISequenceService {
	Integer selectSequence(@Param("se") Sequence Sequence);
}
