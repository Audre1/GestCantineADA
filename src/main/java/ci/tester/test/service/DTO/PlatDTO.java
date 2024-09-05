package ci.tester.test.service.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatDTO {

    private Long id;

    private String summary;

    private String name;

    private MenuDTO menuDTO;
}
