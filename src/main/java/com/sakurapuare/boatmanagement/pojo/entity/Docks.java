package com.sakurapuare.boatmanagement.pojo.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * 实体类。
 *
 * @author sakurapuare
 * @since 2024-11-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("docks")
public class Docks extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer dockId;

    private String dockName;

    private String dockLocation;


}
