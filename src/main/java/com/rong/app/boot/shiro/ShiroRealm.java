package com.rong.app.boot.shiro;

import com.rong.app.boot.auth.service.IAuthService;
import com.rong.app.boot.role.service.IRoleService;
import com.rong.app.boot.user.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;


/**
 * Auth
 *
 * @author RONG-YI-FENG
 * @version v1.0
 * @CreationTime: - 2018-12-01 16:02:30
 * @Description:
 */
public class ShiroRealm extends AuthorizingRealm {

    private static Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    @Resource
    private IUserService userService;
    @Resource
    private IRoleService roleService;
    @Resource
    private IAuthService authService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
