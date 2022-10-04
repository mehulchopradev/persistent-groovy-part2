String.metaClass.csvify = {sep = ',' ->
    delegate.replaceAll(" ", sep)
}

def message = "mehul 10 m 90"
println message.csvify() // mehul,10,m,90


def s1 = "jane 99 f"
println s1.csvify('|')
