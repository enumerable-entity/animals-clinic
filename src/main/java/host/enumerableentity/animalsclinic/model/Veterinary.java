package host.enumerableentity.animalsclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuperBuilder
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "veterinary")
public class Veterinary extends Person {
}
