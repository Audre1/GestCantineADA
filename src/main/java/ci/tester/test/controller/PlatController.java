package ci.tester.test.controller;

import ci.tester.test.model.Menu;
import ci.tester.test.model.Plat;
import ci.tester.test.service.DTO.MenuDTO;
import ci.tester.test.service.DTO.PlatDTO;
import ci.tester.test.service.MenuService;
import ci.tester.test.service.PlatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/plat")
public class PlatController {
    private  final PlatService platService;

    @GetMapping
    public String showPlat(Model model){
        List<PlatDTO> platDTOS = platService.findAll();
        List<PlatDTO> plat = platService.findAll();
        model.addAttribute("plats",platDTOS);
        model.addAttribute("plats",platDTOS);

        return "plats/plats";
    }


    @GetMapping("/addplat")
    public String showAddPlat(Model model){

        log.debug("Request to show add plats");
        List<PlatDTO> plat = platService.findAll();
        model.addAttribute("plats",plat);
        model.addAttribute("plats", new Plat());
        return "/plats/forms";
    }


    @PostMapping
    public String savePlat(PlatDTO platDTO){

        log.debug("Request to save plat : {}",platDTO);
        platService.save(platDTO);

        return "redirect:/plats";
    }



}
