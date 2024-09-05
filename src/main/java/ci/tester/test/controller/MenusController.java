package ci.tester.test.controller;

import ci.tester.test.model.Menu;
import ci.tester.test.service.DTO.MenuDTO;
import ci.tester.test.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/menus")
public class MenusController {


    private  final MenuService menuService;


    @GetMapping
    public String showMenu(Model model){
        List<MenuDTO> menuDTOS = menuService.findAll();
        List<MenuDTO> menu = menuService.findAll();
        model.addAttribute("menus",menuDTOS);
        model.addAttribute("menus",menuDTOS);

        return "menus/menus";
    }

    @GetMapping("/addmenu")
    public String showAddMenu(Model model){

        log.debug("Request to show add menus");
        List<MenuDTO> menu = menuService.findAll();
        model.addAttribute("menus",menu);
        model.addAttribute("menus", new Menu());
        return "/menus/forms";
    }

    @PostMapping
    public String saveMenu(MenuDTO menuDTO){

        log.debug("Request to save menu : {}",menuDTO);
        menuService.save(menuDTO);

        return "redirect:/menus";
    }













}
