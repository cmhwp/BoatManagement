package com.sakurapuare.boatmanagement.pojo.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 实体类。
 *
 * @author sakurapuare
 * @since 2024-11-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("alerts")
public class Alerts implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id(keyType = KeyType.Auto)
    private Integer alertId;

    private Integer boatId;

    private String alertType;

    private Timestamp alertTime;

    private String description;

    private Integer status;

    private Boolean isDeleted;

    private Timestamp createdAt;

    private Timestamp updatedAt;

}
