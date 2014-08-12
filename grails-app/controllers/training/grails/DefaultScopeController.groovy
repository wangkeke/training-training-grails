package training.grails

/**
 * 测试默认的范围(Scope)<br>
 * <ul>
 * <li>servletContext
 * <li>session
 * <li>request
 * <li>params(map) -- queryString / Post Params
 * <li>flash
 * </ul>
 *
 */
class DefaultScopeController {

    def index() {}

    /**
     * 第一种语法
     */
    def findA() {
        def findBy = params.findBy
        def appContext = request.foo
        def loggedUser = session.logged_user
    }

    /**
     * 第二种语法
     */
    def findB() {
        def findBy = params["findBy"]
        def appContext = request["foo"]
        def loggedUser = session["logged_user"]
    }
}
