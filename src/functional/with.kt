package functional

fun main(args: Array<String>) {
    val props = System.getProperties()

    with(props) {
        list(System.out)
        println(getProperty("user.home"))
    }

    //without with
    /*  props.list(System.out)
      props.getProperty("user.home")*/
}