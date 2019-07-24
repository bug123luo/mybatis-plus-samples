package com.baomidou.mybatisplus.samples.quickstart.controller;


import com.baomidou.mybatisplus.samples.quickstart.entity.Sequence;
import com.baomidou.mybatisplus.samples.quickstart.service.ISequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lcc
 * @since 2019-07-24
 */
@Controller
@RequestMapping("/sequence")
public class SequenceController {

    @Autowired
    ISequenceService iSequenceService;

    @GetMapping("/nextval")
    @ResponseBody
    public Integer getSequence(){
        Sequence sequence = new Sequence();
        sequence.setName("TestSeq");
        return iSequenceService.selectSequence(sequence);
    }

}
