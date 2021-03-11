package com.example.test.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer price;
    private String content;


    //1 :N Lazy = 지연로딩 and Eager= 즉시로딩
    //lazy = select * from item where id =?
    //eager =
    //itme_id = order_dtail.item_id
    //user_id = order_detail.item.id
    //where item.id = ?
    //1:1 일때를 제외하고는 lazy 타입을 쓰는게 좋다.
    @OneToMany(fetch = FetchType.LAZY ,mappedBy = "item")
    private List<OrderDetail> orderDetailList;
}
