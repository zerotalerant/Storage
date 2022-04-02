package Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "header", nullable = false)
    private String header;

    @Column(name = "news_text", nullable = false)
    private String newsText;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private String newsCategory;

    @Column(name = "publish_time")
    private LocalDateTime localDateTime;
}
