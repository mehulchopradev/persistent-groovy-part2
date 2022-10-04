class DynamicFinder {

    List elements

    def methodMissing(String methodName, args) {
        def propertyName = methodName['findBy'.size()..methodName.size()-1]
        propertyName = "${propertyName[0].toLowerCase()}${propertyName[1..propertyName.size()-1]}"

        elements.findAll { it[propertyName] == args[0]}
    }
}
