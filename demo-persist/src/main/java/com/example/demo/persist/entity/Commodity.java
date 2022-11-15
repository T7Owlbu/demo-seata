package com.example.demo.persist.entity;

import com.example.demo.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2022-11-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Commodity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private BigDecimal price;

    private Integer stock;


}
