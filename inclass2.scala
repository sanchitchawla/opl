def loop(): Int = loop
def loopBool(): Boolean = loopBool
def leftCBC(x: Int, y: Int) = x
def leftCBN(x: Int, y: => Int) = x

// println(leftCBN(1 + 1, loop))
// println(leftCBC(loop, 1+ 1)) // doesnt terminate
// println(leftCBN(1+1, loop))
// println(leftCBC(loop, 1+1)) // doesnt terminate

def and(x: => Boolean, y: => Boolean): Boolean = {

	if (x) y else x

}

def or(x: => Boolean, y: => Boolean): Boolean = {
	
	if (x) x else y
}

println(or(true, loopBool))
println(and(false, loopBool))