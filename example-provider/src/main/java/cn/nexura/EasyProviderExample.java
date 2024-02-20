package cn.nexura;

import cn.nexura.nextrpc.VertxHttpServer;
import cn.nexura.registry.LocalRegistry;
import cn.nexura.service.UserService;

public class EasyProviderExample {
    public static void main(String[] args) {
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        VertxHttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
        System.out.println("Hello world!");
    }
}