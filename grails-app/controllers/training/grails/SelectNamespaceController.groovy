package training.grails

/**
 * 练习使用命名空间<br>
 *
 * namespace
 *
 */
class SelectNamespaceController {
    static namespace = 'business'
    def index() {

    }

    /**
     * 这时Grails会使用<br>
     * /training-grails/grails-app/views/business/selectNamespace/show.gsp<br>
     * 备用：<br>
     * /training-grails/grails-app/views/selectNamespace/show.gsp
     */
    def show() {
        [numberOfEmployees: 9]
    }
}
