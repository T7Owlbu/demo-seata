package com.example.demo.temp.entity;

import com.example.demo.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
public class Temp extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;


}
