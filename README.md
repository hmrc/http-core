http-core
==========



## This library is deprecated
### All classes from this library have been copied to http-verbs starting from version 8.5.0. Some time ago http-verbs was split into three libraries: http-core (meant to be play-independent), http-verbs (play independent) and http-verbs-play-25 (with a dependency on play). Unfortunately http-core still contained play-json which is not binary compatibile between play 2.5 and 2.6. This means that libraries compiled against http-core could fail at runtime when used with a microservice using play 2.6. A decision was made to collapse all the classess from http-core, http-verbs and http-verbs-play-25 and only keep one single library: http-verbs. It will be available for both Play 2.5 and Play 2.6.


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
