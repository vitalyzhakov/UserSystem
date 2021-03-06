fun main(args: Array<String>) {
    SayHello(args)
}

fun SayHello(args: Array<String>)
{
    val systemName = System.getProperty("os.name")
    val userName = System.getProperty("user.name")
    var systemRequired = false
    var userRequired = false
    for ( argument in args )
    {
        when (argument)
        {
            "-u" -> userRequired = true
            "-s" -> systemRequired = true
            else -> println("Program has unknown argument " + argument)
        }
    }

    var result = "Hello!"
    if ( systemRequired && userRequired)
    {
        result = "Hello, " + userName + " at " + systemName + " system!"
    } else if ( userRequired )
    {
        result = " Hello, " + userName + ")"
    } else if ( systemRequired)
    {
        result = "Hello at " + systemName + "!"
    }
    println( result )
}
