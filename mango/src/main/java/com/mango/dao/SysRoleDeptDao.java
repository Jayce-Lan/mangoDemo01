package com.mango.dao;

import com.mango.entity.SysRoleDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色机构(SysRoleDept)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-28 21:03:24
 */
public interface SysRoleDeptDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRoleDept queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysRoleDept> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysRoleDept 实例对象
     * @return 对象列表
     */
    List<SysRoleDept> queryAll(SysRoleDept sysRoleDept);

    /**
     * 新增数据
     *
     * @param sysRoleDept 实例对象
     * @return 影响行数
     */
    int insert(SysRoleDept sysRoleDept);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysRoleDept> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysRoleDept> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysRoleDept> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SysRoleDept> entities);

    /**
     * 修改数据
     *
     * @param sysRoleDept 实例对象
     * @return 影响行数
     */
    int update(SysRoleDept sysRoleDept);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
