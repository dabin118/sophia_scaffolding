package com.scaffolding.sophia.admin.biz.controller;

import com.scaffolding.sophia.admin.biz.service.role.RoleService;
import com.scaffolding.sophia.common.base.support.ApiResponse;
import com.scaffolding.sophia.common.base.support.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LHL
 * @ProjectName: sophia_scaffolding
 * @Package: com.scaffolding.sophia.admin.biz.controller
 * @ClassName: RoleController
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/info/{id}")
    public ApiResponse getRoleByUserId(@PathVariable Long id) {
        return success(roleService.getRoleByUserId(id));
    }

}
