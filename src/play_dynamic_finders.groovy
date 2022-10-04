import com.rise1116.banking.domain.Account
import com.rise1116.library.domain.Author

def accounts = [
        new Account(name: 'mehul', balance: 9000, number: 12456),
        new Account(name: 'jane', balance: 6000, number: 67845),
        new Account(name: 'john', balance: 5000, number: 98776)
]
// findByAttribute(args)

def df1 = new DynamicFinder(elements: accounts)

// find an account where name is jane
println df1.findByName('jane')

// find an account where number is 98776
println df1.findByNumber(98776)

// find an account where balance is 6000
println df1.findByBalance(6000)

def authors = [
        new Author(name: 'mehul chopra', ratings: 4, gender: 'm' as Character),
        new Author(name: 'jill', ratings: 3, gender: 'f' as Character),
        new Author(name: 'john', ratings: 4, gender: 'm' as Character)
]

def df2 = new DynamicFinder(elements: authors)

// find authors where gender is m
println df2.findByGender('m')

// find authors where ratings is 4
println df2.findByRatings(4)

println df2.findByName('jill')
