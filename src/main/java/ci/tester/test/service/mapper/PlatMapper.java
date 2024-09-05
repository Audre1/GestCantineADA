package ci.tester.test.service.mapper;

import ci.tester.test.model.Menu;
import ci.tester.test.model.Plat;
import ci.tester.test.service.DTO.MenuDTO;
import ci.tester.test.service.DTO.PlatDTO;

public class PlatMapper {

    private PlatMapper(){

    }
    public static PlatDTO toDTO(Plat plat) {

        PlatDTO platDTO = new PlatDTO();
        platDTO.setId(plat.getId());
        platDTO.setName(plat.getName());
        platDTO.setSummary(plat.getSummary());

        return platDTO;
    }

    public static  Plat toEntity(PlatDTO platDTO ){

        Plat plat = new Plat();
        plat.setId(platDTO.getId());
        plat.setName(platDTO.getName());
        plat.setSummary(platDTO.getSummary());
        return plat;
    }
}
