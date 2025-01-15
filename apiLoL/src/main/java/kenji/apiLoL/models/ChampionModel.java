package kenji.apiLoL.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "Champion")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChampionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "name_champion", nullable = false, unique = true)
    private String name;

    @Column(name = "level", nullable = false)
    @Length(min = 1, max = 18)
    private int level;

    @Column(name = "health", nullable = false)
    @Length(min = 0)
    private Integer health;

    @Column(name = "armor", nullable = false)
    @Length(min = 0)
    private Integer armor;

    @Column(name = "magic_resistance", nullable = false)
    @Length(min = 0)
    private Integer magicResistance;

    @Column(name = "atk_damage", nullable = false)
    private Integer atackDamage;

    @Column(name = "atk_range", nullable = false)
    @Length(min = 0)
    private Integer atackRange;

    @Column(name = "crit_strike_chance", nullable = false)
    @Length(min = 0, max = 100)
    private Integer criticalStrikeChance;

    @Column(name = "atack_speed", nullable = false)
    @Length(min = 0)
    private Integer atackSpeed;


}
