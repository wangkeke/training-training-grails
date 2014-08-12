package training.grails

/**
 * 控制器的控制范围<br>
 *
 * 目前支持三种：
 * <ul>
 * <li>prototype：默认方式，推荐使用闭包方式(recommended for actions as Closure properties)
 * <li>session
 * <li>singleton：推荐使用方法方式 (recommended for actions as methods)
 * </ul>
 *
 * <b>注意：</b> <br>
 * 如果一个控制器指定了是单例（singleton），这时就不要在这个控制器中有任何的其他属性
 *
 */
class ScopedController {
    /**
     * 添加一个属性就可以指定特定的类型
     */
    static scope = "singleton"

    public ScopedController() {
        log.debug("=====测试构造方法创建=====")
    }

    def index() {
        log.debug("默认的首页")
        render("Hello")
    }

}
