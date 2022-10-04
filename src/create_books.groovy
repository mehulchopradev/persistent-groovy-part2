import com.rise1116.library.domain.Author
import com.rise1116.library.domain.Book
import com.rise1116.library.domain.Contact

/* def c1 = new Contact(email: 'mehulc@hey.com', phone: '9868768768', country: 'IN', state: 'MH', pinCode: 400053)
def c2 = new Contact(email: 'jane@gmail.com', phone: '78786899', country: 'USA', state: 'MI', pinCode: 1234)
def a1 = new Author(name: 'mehul chopra', ratings: 4, gender: 'm' as Character, contact: c1)
def a2 = new Author(name: 'jane', ratings: 3, gender: 'f' as Character, contact: c2)
def b = new Book(title: 'Prog in Java', price: 1000, pages: 500, authors: [a1, a2]) */

// ObjectGraphBuilder
def builder = new ObjectGraphBuilder(classNameResolver: 'com.rise1116.library.domain')

def b = builder.book(title: 'Prog in Java', price: 1000, pages: 500) {
    author(name: 'mehul chopra', ratings: 4, gender: 'm' as Character) {
        contact(email: 'mehulc@hey.com', phone: '9868768768', country: 'IN', state: 'MH', pinCode: 400053)
    }

    author(name: 'jane', ratings: 3, gender: 'f' as Character) {
        contact(email: 'jane@gmail.com', phone: '78786899', country: 'USA', state: 'MI', pinCode: 1234)
    }
}

println b

