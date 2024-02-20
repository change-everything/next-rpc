package cn.nexura;

import cn.nexura.model.User;
import cn.nexura.service.UserService;

/**
 *  用户服务实现类
 * @author PeiYP
 * @since 2024年02月20日 15:14
 */

public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
