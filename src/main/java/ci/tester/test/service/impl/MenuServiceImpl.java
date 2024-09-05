package ci.tester.test.service.impl;

import ci.tester.test.model.Menu;
import ci.tester.test.repository.MenuRepository;
import ci.tester.test.service.DTO.MenuDTO;
import ci.tester.test.service.DTO.PlatDTO;
import ci.tester.test.service.MenuService;
import ci.tester.test.service.mapper.MenuMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private  final MenuRepository menuRepository;
    private final MenuMapper menuMapper;


    @Override
    public MenuDTO save(MenuDTO menuDTO) {

        log.debug("Resquest to save : {}",menuDTO);
        Menu menu = menuMapper.toEntity(menuDTO);
        menu = menuRepository.save(menu);

        return  menuMapper.toDTO(menu);
    }


    @Override
    public MenuDTO update(MenuDTO menuDTO) {
        Menu menu = menuMapper.toEntity(menuDTO);
        menu = menuRepository.save(menu);
        return menuMapper.toDTO(menu);

    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return menuRepository.findById(id).map(menu -> {
            return menuMapper.toDTO(menu);
        });
    }

    @Override
    public List<MenuDTO> findAll() {
        return menuRepository.findAll().stream().map(menu -> {
            return menuMapper.toDTO(menu);
        }).toList();
    }

    @Override
    public void delecte(Long id) {
        menuRepository.deleteById(id);

    }



    }



