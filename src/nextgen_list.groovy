List.metaClass.odds = {
    delegate.findAll {it % 2 != 0} // delegate is like `this`
}


def marks = [5, 6, 7, 2, 3, 1, 0, 10, 7, 8, 4, 5, 3]
println marks.odds()