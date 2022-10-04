import com.rise1116.banking.domain.Account
import com.rise1116.banking.exceptions.MinBalNotMaintainedException

def acc1 = new Account(name: 'mehul chopra', number: 3456, balance: 10000, contactNos: ['9879876863'])
acc1 << "8768768789"
// println acc1.contactNos

acc1.printContacts()

// println "8768768789" in acc1
// Internally
// println acc1.isCase("8768768789")

// println acc1.deposit(2000)
println acc1 + 2000

// handle the exception
try {
    // println acc1.withdraw(900)
    println acc1 - 900
    // Internally
    // println acc1.minus(900)
} catch (MinBalNotMaintainedException | IllegalArgumentException exception) {
    exception.printStackTrace()
} /* catch (IllegalArgumentException e) {
    e.printStackTrace()
} */


// println acc1 + 500

def acc2 = new Account(name: 'jane', number: 1234, balance: 20000)
println acc2.contactNos
acc2.printContacts()

acc2 << "37683758" << "97395834659"

println acc2.contactNos

println "Program ends!"
