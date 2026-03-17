package com.ngocquang.restautant.Enity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="food")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length=40)
    private String name;

    @Column(precision = 10,scale =2,nullable = false)
    private BigDecimal price;

    @Column(columnDefinition = "Text",nullable = false)
    @Lob
    private String description;

    @Column(nullable = false)
    private String imageUrl;

    public enum Status{Available,Unavailable,Out_of_stock};

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Combo.Status status= Combo.Status.Available;

    @OneToMany(mappedBy = "food")
    private List<OrderDetail> orderDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;
}
