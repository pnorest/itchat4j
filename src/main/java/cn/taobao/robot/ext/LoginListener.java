package cn.taobao.robot.ext;


import cn.taobao.robot.dto.LoginEvent;

/**
 * 登录事件监听
 *
 * @author joe
 */
public interface LoginListener {
    /**
     * 监听登录事件
     *
     * @param event 登录事件
     */
    void listen(LoginEvent event);
}
