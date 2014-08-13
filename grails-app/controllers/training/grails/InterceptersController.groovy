package training.grails

/**
 * 拦截器<br>
 *
 * 练习使用拦截器<br>
 *
 * 如果想改变request,session,application一些状态可以使用拦截器。如果多次改变的话，可以使用过滤器Filter...<br>
 *
 *
 * 拦截器常见的场景就是在做<b><i>认证授权</i></b><br>
 *
 * 如果一个拦截器返回错误（false），那么后续的方法和action将不会被执行
 *
 *
 */
class InterceptersController {

    def index() {}

    /**
     * 这是一种闭包写法：还有一种类似Map写法
     */
    /*
    def beforeInterceptor = {
        log.debug("执行之前拦截器的操作")
    }
    */

    /**
     * 这是一种闭包写法：还有一种类似Map写法
     */
    /*
    def afterInterceptor = {
        log.debug("执行之后拦截器的操作")
    }
    */
    /**
     * 指定使用一个私有的action来做处理逻辑，这个私有的方法不会对外暴露<br>
     * 对登录方法进行放行<br>
     *
     * 指定相应的条件:
     * <ul>
     * <li>排除一个：def beforeInterceptor = [action: this.&auth, except: 'login']
     * <li>排除多个：def beforeInterceptor = [action: this.&auth, except: ['login', 'register']]
     * <li>指定一个：def beforeInterceptor = [action: this.&auth, only: ['secure']]
     * </ul>
     *
     */
    def beforeInterceptor = [action: this.&auth, except: 'login']

    private auth() {
        if (!session.user) {
            redirect(action: 'login')
            return false
        }
    }

    /**
     * 可以自动注入一个model, modelAndView
     */
    /*
    def afterInterceptor = { model ->
        println "Tracing action ${actionUri}"
    }
    */

    /**
     * 在拦截以后可以进行逻辑处理，指向不同处理，对数据进行加工
     */
    def afterInterceptor = { model, modelAndView ->
        println "Current view is ${modelAndView.viewName}"
        if (model.someVar) modelAndView.viewName = "/mycontroller/someotherview"
        println "View is now ${modelAndView.viewName}"
    }

    /**
     * 登录的Action不被拦截
     *
     * @return
     */
    def login() {
        render("这个是登录页面")
    }
}
