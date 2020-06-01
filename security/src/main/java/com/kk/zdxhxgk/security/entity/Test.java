package com.kk.zdxhxgk.security.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Gocke
 * @since 2020-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;


}
