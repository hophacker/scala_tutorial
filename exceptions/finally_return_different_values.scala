def f(): Int = try {return 1} finally {return 2}
def g(): Int = try {1} finally {2}
println(f()) // Int = 2
println(g()) // Int = 1
//TODO: why?
