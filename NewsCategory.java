package Entity;


import jdk.jfr.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "news_category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "news_category", nullable = false)
    private String newsCategory;
}