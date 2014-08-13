package training.grails

/**
 * 介绍使用保存或者更新
 *
 */
class SaveAndUpdateAndDelete {

    /**
     *
     * save--保存:
     * def p = CommandPerson.get(1)
     * p.save()
     *
     * 或者--立即刷新执行
     * def p = CommandPerson.get(1)
     * p.save(flush: true)
     *
     * update--更新：
     *
     * 保存失败抛出相应的异常
     * p.save(failOnError: true)
     *
     * Delete--删除
     *
     * def p = CommandPerson.get(1)
     * p.delete()
     *
     * 或者
     * p.delete(flush: true)
     *
     */
    static constraints = {
    }
}
