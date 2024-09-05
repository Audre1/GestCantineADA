package ci.tester.test.controller;

import ci.tester.test.service.DTO.MenuDTO;
import ci.tester.test.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class IndexController {
    private  final MenuService menuService;

    @GetMapping
    public String showIndex(Model model){

        List<MenuDTO> menuDTOS = menuService.findAll();
        model.addAttribute("menu",menuDTOS);
        return "/pages/index";
    }



}
