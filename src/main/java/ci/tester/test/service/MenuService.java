package ci.tester.test.service;

import ci.tester.test.service.DTO.MenuDTO;
import ci.tester.test.service.DTO.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {


    MenuDTO save(MenuDTO menuDTO);

    MenuDTO update(MenuDTO menuDTO);

    Optional<MenuDTO> findOne(Long id);

    List<MenuDTO> findAll();

    void delecte(Long id);





}
