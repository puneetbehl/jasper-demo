package demoapp

class DemoController {

    def index() {

        println "Testing reloading ..."

        [persons: Person.createSomeRecords()]
    }
}
