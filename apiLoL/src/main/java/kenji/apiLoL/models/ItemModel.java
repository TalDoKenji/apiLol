package kenji.apiLoL.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "Item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(name = "item_name", nullable = false)
    private String name;

    @Column(name = "status", nullable = false)
    private Map<String, Integer> status;

    @Column(name = "Passive", nullable = false)
    private Map<String, String> passive;
}
