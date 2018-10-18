http-core
==========

[![Build Status](https://travis-ci.org/hmrc/http-core.svg)](https://travis-ci.org/hmrc/http-core) [ ![Download](https://api.bintray.com/packages/hmrc/releases/http-core/images/download.svg) ](https://bintray.com/hmrc/releases/http-core/_latestVersion)

## This library is deprecated
### All classes from this library have been copied to http-verbs starting from version 8.5.0. Originally http-core was meant to be Play Framework independent but it still contained play-json. Play json used in Play 2.5 and 2.6 is not binary compatible and a decision was made to merge http-core back to http-verbs.

http-core is a Scala micro library providing a set of common concerns and classes that help fulfillment of asynchronous HTTP calls.

It encapsulates some common concerns required for making HTTP calls on the HMRC Tax Platform, including:
* Logging
* Header Carrier
* Http Transport
* Core Http function interfaces




#### Adding to your app

Unless your project is a library that implements the HTTP transport and Core HTTP functions, this library should not be added to your project directly.
  Instead, include libraries that provide concrete implementation of the http transport and Core http functions (ie: both http-verbs and http-verbs-play-25) to get the full functionality.


All examples are available here:[hmrc/http-verbs-example](https://github.com/hmrc/http-verbs-example)  

## License ##

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
