package ci.tester.test.service.mapper;

import ci.tester.test.model.Menu;
import ci.tester.test.service.DTO.MenuDTO;

public class MenuMapper {



    private MenuMapper(){

    }
    public static MenuDTO toDTO(Menu menu) {

        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setId(menu.getId());
        menuDTO.setCreationDate(menu.getCreationDate());

        return menuDTO;
    }

    public static  Menu toEntity(MenuDTO menuDTO ){

       Menu menu = new Menu();
        menu.setId(menuDTO.getId());
        menu.setCreationDate(menuDTO.getCreationDate());

        return menu;
    }
}
