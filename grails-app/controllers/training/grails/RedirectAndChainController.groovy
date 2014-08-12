package training.grails

/**
 * 练习使用跳转/执行链<br>
 *
 * redirect/chain
 *
 */
class RedirectAndChainController {

    def index() {}

    /**
     * 跳转 <br>
     * redirect
     * <ul>
     *     <li>跳转到同一个控制器：redirect(action: 'rending')
     *     <li>跳转到不同控制器：redirect(controller: 'home', action: 'index')
     *     <li>跳转到一个相对地址：redirect(uri: "/login.html")
     *     <li>跳转到一个绝对地址：redirect(url: "http://grails.org")
     *     <li>跳转带参数：redirect(action: 'myaction', params: [myparam: "myvalue"])
     *     <li>输出带片段：redirect(controller: "test", action: "show", fragment: "profile") --  "/myapp/test/show#profile".
     * </ul>
     * @return
     */
    def find() {
        if (!session)
            redirect(action: 'rending')
        return
    }

    /**
     * 执行链<br>
     * first->second->third <br>
     *
     * 最终结果：[one: 1, two: 2, three: 3]<br>
     *
     * 与redirect一样可以带参数：chain(action: "action1", model: [one: 1], params: [myparam: "param1"])
     *
     */
    def first() {
        chain(action: second, model: [one: 1])
    }

    def second () {
        chain(action: third, model: [two: 2])
    }

    def third() {
        [three: 3]
    }

}