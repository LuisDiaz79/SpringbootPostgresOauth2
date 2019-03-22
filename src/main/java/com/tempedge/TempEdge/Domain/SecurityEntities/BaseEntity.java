package com.tempedge.TempEdge.Domain.SecurityEntities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity  implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    public BaseEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
