package com.tasnimt.taz_book_network_api.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tokens")
public class Token {
        @Id
        @GeneratedValue
        private Long id;
        private String token;

        private LocalDateTime createdAt;
        private LocalDateTime validatedAt;
        private LocalDateTime expiredAt;

        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        private User user;

}
