def list = [1, 2, 3]
println list.collect { it * 2 } //Use collect to create a new list with doubled values

//Another example

def myMethod() {
    def list = [1,2,3,4,5]
    list.eachWithIndex { item, index -> 
       println item
       if (item == 3) {return} //This now works as expected
    }
    println "Done"
}

myMethod() //"Done" is printed as expected

//Alternatively you can use a loop
for(int i=0; i < list.size(); i++){
    println list[i]
    if(list[i] == 3){ break;}
}
println "Done"
