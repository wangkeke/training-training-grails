package training.grails

/**
 * 书籍控制器<br>
 *
 * 一个控制处理一个请求，并且生成一个输出的response.<br>
 * 它会直接的处理输出，例如Rest...或者交个其他的视图处理。
 * 一般视图的目录在grails-app/controllers或者这里的子目录下<br>
 *
 * 使用Grails命令：grails create-controller book
 *
 *
 *
 *
 *
 */
class BookController {

    def index() {
        render("Hello")
    }

    /**
     * 一个控制可以有多个公开的(public)的Action <br>
     *
     *
     */
    def list() {
        log.debug("========================List===========================")
        /**
         * 写一些处理逻辑
         * do controller logic
         */

        /**
         * 创建一些实体
         * create model
         */

        /**
         * 映射的地址/book/list <br>
         * 规则就是Controller/Action
         */
        def result = new HashMap<String, String>()
        result.put("hello", "world")
        render(result)
    }

    /**
     * 公开的方法(public)可以做Action <br>
     * In earlier versions of Grails actions were implemented with Closures. This is still supported, but the preferred approach is to use methods.
     * Grails在早期的版本支持使用一个闭包来作为一个Action，为了保证向后的兼容性，这种方式依然支持。但是推荐的方式是直接使用一个方法。<br>
     *
     * 使用方法比闭包的优势：
     * <ul>
     * <li>节省内存
     * <li>允许使用无状态的控制器-Allow use of stateless controllers
     * <li>可以重载-You can override actions from subclasses and call the overridden superclass method with super.actionName()
     * <li>可以使用JDK反向代理或者AOP来处理，但是使用闭包就很难了
     * </ul>
     *
     * If you prefer the Closure syntax or have older controller classes created in earlier versions of Grails and still want the advantages of using methods, you can set the grails.compile.artefacts.closures.convert property to true in BuildConfig.groovy:<br>
     * grails.compile.artefacts.closures.convert = true<br>
     *
     * 如果你喜欢闭包语法，而且又想使用上述新的特性，你可以在Grails的BuildConfig.groovy配置文件中做相应的配置<br>
     * grails.compile.artefacts.closures.convert = true<br>
     * 但是需要注意的是，如果一个继承的类没有在/controller目录下，从那些类继承来的Action是不能转换的，如果想使用转换需要重新一些Action通过super方式调用<br>
     *
     * @return 可以配置返回一个视图，一个Model或者一个模板
     */
    public Map<String, String> trainingMethod() {
//        def result = new Has

    }
}
