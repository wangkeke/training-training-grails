package training.grails

/**
 * PersonComposition/AddressComposition组合用法
 */
class PersonComposition {
    AddressComposition homeAddress
    AddressComposition workAddress
    static embedded = ['homeAddress', 'workAddress']
    static constraints = {
    }

    /**
     * 最终的表结构
     *
     * id-home_address_number-home_address_code-work_address_number-work_address_code
     *
     */
}
