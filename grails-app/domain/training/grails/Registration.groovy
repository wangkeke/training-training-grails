package training.grails

/**
 * 注册信息--一个参赛者注册信息
 */
class Registration {
    Boolean paid
    Date dateCreated // 注意：这个是一个特殊的名字
    Date lastUpdated // 更新时候填充这个字段
    static constraints = {
        race()
        runner()
        paid()
        dateCreated()
        lastUpdated()
    }
    static mapping = {
        autoTimestamp false
    }
    static belongsTo = [race: Race, runner: Runner]

    /**
     * 使用Grails提供的闭包完成更复杂的逻辑
     */
    def beforeInsert = {

    }

    def beforeUpdate = {

    }

    def beforeDelete = {

    }

    def onLoad = {

    }

}
