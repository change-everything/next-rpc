package cn.nexura.nextrpc;

/**
 * HTTP服务器接口
 * @author PeiYP
 * @since 2024年02月20日 15:18
 */
public interface HttpServer {

    /**
     * 启动服务器
     */
    void doStart(int port);

}
