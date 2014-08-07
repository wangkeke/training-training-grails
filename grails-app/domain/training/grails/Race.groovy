package training.grails

/**
 * 比赛
 */
class Race {

    String name
    Date startDate
    String city
    String state
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners = 100000

    /**
     * 默认显示顺序不一致，使用constraints调整显示顺序
     */
    static constraints = {
        name(blank: false, maxSize: 50)
        startDate()
        city()
        state(inList: ["GA", "NC", "SC", "VA"])
        distance(min: 0.0)
        cost(min: 0.0, max: 100.0)
        maxRunners(min: 0, max: 100000)
    }

    static mapping = {
        sort "startDate"
    }

    /**
     * 多对一
     */
    static hasMany = [registrations: Registration]

    String toString () {
        return "${name},${startDate.format("yyyy-MM-dd")}"
    }
}
