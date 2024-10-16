package za.ac.cput.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Table(name = "SUBJECT")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;
    @Column(unique = true)
    private String subjectCode;
    private String name;
    private byte[] subjectGuide;

    @ManyToMany(mappedBy = "assignedSubjects")
    private Set<Tutor> assignedTutors;

}
