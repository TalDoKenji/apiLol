package kenji.apiLoL.models;

import jakarta.persistence.*;
import kenji.apiLoL.Enums.ResourceType;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Champion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
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
    private Integer attackDamage;

    @Column(name = "magic_damage", nullable = false)
    private Integer magicDamage;

    @Column(name = "resorce_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ResourceType resorceType;

    @Column(name = "resource_points")
    private Integer resourcePoints;

    @Column(name = "atk_range", nullable = false)
    @Length(min = 0)
    private Double attackRange;

    @Column(name = "crit_strike_chance", nullable = false)
    @Length(min = 0, max = 100)
    private Integer criticalStrikeChance;

    @Column(name = "attack_speed", nullable = false)
    @Length(min = 0)
    private Double attackSpeed;

    @Column(name = "armor_penetration", nullable = false)
    @Length(min = 0)
    private Integer armorPenetration;

    @Column(name = "letality", nullable = false)
    @Length(min = 0)
    private Integer letality;

    @Column(name = "magic_penetration_percentual", nullable = false)
    @Length(min = 0)
    private Integer magicPenetrationPercentual;

    @Column(name = "magic_penetration_flat", nullable = false)
    @Length(min = 0)

    @ManyToMany
    @JoinTable(
            name = "champion_item",
            joinColumns = @JoinColumn(name = "champion_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private Set<ItemModel> items = new HashSet<>();

    private Integer magicPenetrationFlat;

    private Integer healthPerLevel;

    private Double armorPerLevel;

    private Double magicResistancePerLevel;

    private Double attackDamagePerLevel;

    private Double resourcePointsPerLevel;

    private Double critStrickeChancePerLevel;

    private Double attackSpeedPerLevel;



}
