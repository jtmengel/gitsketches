#!/bin/sh
exec scala "$0" "$@"
!#

object SampleShellScript{
  def main(args: Array[String]) = {
    println(s"Hello World, ${args.mkString("::")}");
  }
}

SampleShellScript.main(args)
