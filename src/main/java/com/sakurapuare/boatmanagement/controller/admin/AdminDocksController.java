package com.sakurapuare.boatmanagement.controller.admin;

import com.mybatisflex.core.paginate.Page;
import com.sakurapuare.boatmanagement.pojo.entity.Docks;
import com.sakurapuare.boatmanagement.service.DocksService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 码头表 控制层。
 *
 * @author sakurapuare
 * @since 2024-12-17
 */
@RestController
@Api("码头表接口")
@RequestMapping("/admin/docks")
public class AdminDocksController {

    @Autowired
    private DocksService docksService;

    /**
     * 添加码头表。
     *
     * @param docks 码头表
     * @return {@code true} 添加成功，{@code false} 添加失败
     */
    @PostMapping("save")
    @ApiOperation("保存码头表")
    public boolean save(@RequestBody @ApiParam("码头表") Docks docks) {
        return docksService.save(docks);
    }

    /**
     * 根据主键删除码头表。
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("remove/{id}")
    @ApiOperation("根据主键码头表")
    public boolean remove(@PathVariable @ApiParam("码头表主键") Long id) {
        return docksService.removeById(id);
    }

    /**
     * 根据主键更新码头表。
     *
     * @param docks 码头表
     * @return {@code true} 更新成功，{@code false} 更新失败
     */
    @PutMapping("update")
    @ApiOperation("根据主键更新码头表")
    public boolean update(@RequestBody @ApiParam("码头表主键") Docks docks) {
        return docksService.updateById(docks);
    }

    /**
     * 查询所有码头表。
     *
     * @return 所有数据
     */
    @GetMapping("list")
    @ApiOperation("查询所有码头表")
    public List<Docks> list() {
        return docksService.list();
    }

    /**
     * 根据码头表主键获取详细信息。
     *
     * @param id 码头表主键
     * @return 码头表详情
     */
    @GetMapping("getInfo/{id}")
    @ApiOperation("根据主键获取码头表")
    public Docks getInfo(@PathVariable @ApiParam("码头表主键") Long id) {
        return docksService.getById(id);
    }

    /**
     * 分页查询码头表。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    @ApiOperation("分页查询码头表")
    public Page<Docks> page(@ApiParam("分页信息") Page<Docks> page) {
        return docksService.page(page);
    }

}
