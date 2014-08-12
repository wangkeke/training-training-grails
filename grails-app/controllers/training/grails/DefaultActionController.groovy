package training.grails

/**
 * 默认的方法<br>
 * 默认访问方式为：DefaultActionController：/defaultAction<br>
 * 规则就是去掉***Controller遵循驼峰命名<br>
 * 规则:
 * <ul>
 * <li>一个控制中如果就有一个Action，那么这个就是默认值
 * <li>如果有index的Action，那么这个就是默认值
 * <li>可以手动来置顶默认：static defaultAction = "list"
 * </ul>
 *
 */
class DefaultActionController {
//    static defaultAction = "list"
    def index() {
        render("Hello World")
    }

    def list() {

    }
}
