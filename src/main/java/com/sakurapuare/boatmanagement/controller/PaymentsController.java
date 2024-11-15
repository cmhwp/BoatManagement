package com.sakurapuare.boatmanagement.controller;

import com.mybatisflex.core.paginate.Page;
import com.sakurapuare.boatmanagement.pojo.entity.Payments;
import com.sakurapuare.boatmanagement.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 控制层。
 *
 * @author sakurapuare
 * @since 2024-11-15
 */
@RestController
@RequestMapping("/payments")
public class PaymentsController {

    @Autowired
    private PaymentsService paymentsService;

    /**
     * 添加。
     *
     * @param payments
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    public boolean save(@RequestBody Payments payments) {
        return paymentsService.save(payments);
    }

    /**
     * 根据主键删除。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return paymentsService.removeById(id);
    }

    /**
     * 根据主键更新。
     *
     * @param payments
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    public boolean update(@RequestBody Payments payments) {
        return paymentsService.updateById(payments);
    }

    /**
     * 查询所有。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    public List<Payments> list() {
        return paymentsService.list();
    }

    /**
     * 根据主键获取详细信息。
     *
     * @param id 主键
     * @return 详情
     */
    @GetMapping("getInfo/{id}")
    public Payments getInfo(@PathVariable Integer id) {
        return paymentsService.getById(id);
    }

    /**
     * 分页查询。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public Page<Payments> page(Page<Payments> page) {
        return paymentsService.page(page);
    }

}
