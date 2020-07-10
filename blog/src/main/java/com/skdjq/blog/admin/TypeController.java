package com.skdjq.blog.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.skdjq.blog.Service.TypeService;
import com.skdjq.blog.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    //列表页
    @GetMapping("/types")
    public String list(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<Type> allType = typeService.getAdminType();
        //得到分页结果对象
        PageInfo<Type> pageInfo = new PageInfo<>(allType);
        model.addAttribute("pageInfo", pageInfo);
        return "admin/types";
    }

    //新增页面
    @GetMapping("/types/input")
    public String input(){
        return "admin/types-input";
    }

    //提交
    @PostMapping("/types/add")
    public String Add(Type type, RedirectAttributes attributes){
        System.out.println("前端传过来的表单" + type);
        Type type1 = typeService.getTypeByName(type.getName());
        if (type1 != null) {
            attributes.addFlashAttribute("message", "不能添加重复的类!");
            return "redirect:/admin/types/input";
        }
        attributes.addFlashAttribute("message", "添加成功！");
        //添加操作
        typeService.saveType(type);
        return "redirect:/admin/types";
    }

    //到修改页面
    @GetMapping("/types/{id}/input")
    public String editInput(@PathVariable Long id, Model model) {
        System.out.println(id);
        Type type = typeService.getType(id);
        System.out.println(type);
        model.addAttribute("type", type);
        return "admin/types-update";
    }

    //进行修改
    @PostMapping("/types/update")
    public String editPost(Type type) {
        System.out.println(type);
        typeService.updateType(type);
        return "redirect:/admin/types";
    }


    //删除
    @GetMapping("/types/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes) {
        typeService.deleteType(id);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/types";
    }

}
