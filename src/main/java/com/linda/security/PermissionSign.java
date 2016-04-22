package com.linda.security;

/**
 * 权限标识配置类,
 * 与 permission 权限表 中的 permission_sign 字段 相对应
 * 使用:
 * 
 RequiresPermissions(value = PermissionConfig.USER_CREATE)
 * public String create() {
 *     return 拥有user:create权限,能访问;
 * }
 **/
public class PermissionSign {

    /**
     * 用户新增权限 标识
     */
    public static final String USER_CREATE = "user:create";

    /**
     * 用户删除权限 标识
     */
    public static final String USER_DELETE = "user:delete";

    /**
     * 添加更多...
     */

}
