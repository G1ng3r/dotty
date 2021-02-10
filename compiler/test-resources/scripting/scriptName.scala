#!/usr/bin/env scala

  def main(args: Array[String]): Unit =
    val name = Option(sys.props("script.name")) match {
    case None => printf("no script.name property is defined\n")
    case Some(name) =>
      if( name == null ){
        printf("unexpected null script.name property")
      } else {
        printf("script.name: %s\n",name)
        assert(name == "scriptName.scala")
      }
    }
