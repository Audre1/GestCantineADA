package ci.tester.test.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.xml.crypto.Data;
@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@NoArgsConstructor
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "creationDate")
    private Data creationDate;

    @OneToOne(mappedBy = "menu")
    private Plat plat;
}
