package com.sakurapuare.boatmanagement.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.sakurapuare.boatmanagement.mapper.AlertsMapper;
import com.sakurapuare.boatmanagement.pojo.entity.Alerts;
import com.sakurapuare.boatmanagement.service.AlertsService;
import org.springframework.stereotype.Service;

/**
 * 服务层实现。
 *
 * @author sakurapuare
 * @since 2024-11-15
 */
@Service
public class AlertsServiceImpl extends ServiceImpl<AlertsMapper, Alerts> implements AlertsService {

}
