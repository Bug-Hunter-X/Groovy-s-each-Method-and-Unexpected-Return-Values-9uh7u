def list = [1, 2, 3]
println list.each { it * 2 } //This will print the original list, not the doubled list

//Another example

def myMethod() {
    def list = [1,2,3,4,5]
    list.each { 
       println it
       if (it == 3) {return}
    }
    println "Done"
}

myMethod() //This will print 1,2,3 but not "Done"
