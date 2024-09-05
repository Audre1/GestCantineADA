package ci.tester.test.service.impl;


import ci.tester.test.model.Plat;
import ci.tester.test.repository.PlatRepository;
import ci.tester.test.service.DTO.PlatDTO;
import ci.tester.test.service.PlatService;
import ci.tester.test.service.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
@Slf4j
@RequiredArgsConstructor
public class PlatServiceImpl implements PlatService {

    private  final PlatRepository platRepository;
    private  final PlatMapper platMapper;


    @Override
    public PlatDTO save(PlatDTO platDTO) {
        log.debug("Resquest to save : {}",platDTO);
        Plat plat = platMapper.toEntity(platDTO);
        plat = platRepository.save(plat);
        return  platMapper.toDTO(plat);
    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        Plat plat = platMapper.toEntity(platDTO);
        plat = platRepository.save(plat);
        return platMapper.toDTO(plat);
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return platRepository.findById(id).map(plat -> {
            return platMapper.toDTO(plat);
        });
    }

    @Override
    public List<PlatDTO> findAll() {
        return platRepository.findAll().stream().map(plat -> {
            return platMapper.toDTO(plat);
        }).toList();
    }

    @Override
    public void delecte(Long id) {
platRepository.deleteById(id);
    }



}
