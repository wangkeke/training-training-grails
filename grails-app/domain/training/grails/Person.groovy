package training.grails

class Person {
    String name
    Integer age
    Date lastVisit
    Person parent

    static belongsTo = [supervisor: Person]
    static mappedBy = [supervisor: "none", parent: "none"]
    static constraints = {
        supervisor nullable: true
    }

}
