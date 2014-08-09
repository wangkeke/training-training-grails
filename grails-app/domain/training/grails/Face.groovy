package training.grails

/**
 * Many-to-one And one-to-one
 * Face/Node来说明Many-to-one And one-to-one
 */
class Face {

    /**
     * Many-to-one And one-to-one
     *
     * 这样使用级联保存
     * new Face(nose:new Nose()).save()
     *
     * 级联删除
     * def f = Face.get(1)
     * f.delete() // both Face and Nose deleted
     * 脸都不存在了，鼻子肯定没了。。。
     *
     * 可以强制使用一对一操作，如下：
     * static hasOne = [nose:Nose]
     * 这样会增加一个唯一约束在Nose表的外键（默认：nose_id）
     */
    Nose nose
    static constraints = {
        nose unique: true
    }
}
