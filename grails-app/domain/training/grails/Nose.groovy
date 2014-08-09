package training.grails

class Nose {
    /**
     * 双向关联
     */
    static belongsTo = [face:Face]
    static constraints = {
    }
}
