package com.atguigu.ggkt.vod.controller;


import com.atguigu.ggkt.model.vod.Teacher;
import com.atguigu.ggkt.vod.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2022-06-30
 */
@RestController
@RequestMapping("/admin/vod/teacher")
public class TeacherController {
    @Autowired

    private TeacherService teacherService;

    /**
     * 查询所有讲师列表
     * @return
     */
    @GetMapping("findAll")
    public List<Teacher> findAll(){
        List<Teacher> list = teacherService.list();
        return list;
    }
    /**删除讲师
     *
     */
    @DeleteMapping("remove/{id}")
    public boolean removeById(@PathVariable String id){
        System.out.println("ajjajaja");
        return teacherService.removeById(id);
    }
}

