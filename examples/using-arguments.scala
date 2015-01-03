#!/bin/bash
exec scala "$0" "$@"
!#
args.foreach(println)
//args.foreach(arg => println(arg))
//If an function literal consists of one statement that takes a single argument, you need not explicitly name and specify the argument.
