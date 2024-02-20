package cn.nexura;

import cn.nexura.model.User;
import cn.nexura.nextrpc.proxy.ServiceProxyFactory;
import cn.nexura.service.UserService;


/**
 * 简易服务消费者示例
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("nexura");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}