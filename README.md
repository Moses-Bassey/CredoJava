[![Issue Count](https://codeclimate.com/github/SeunAdelekan/CredoJava/badges/issue_count.svg)](https://codeclimate.com/github/SeunAdelekan/CredoJava)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

# CredoJava

A Java API wrapper for the facilitation of quick and easy development and integration of Java based applications with the the Credo API.

CredoJava removes the grunt involved in consuming the Credo API and implements a diverse array of helper methods to enable rapid prototyping and testing. 

## Links
- Project: https://github.com/Moses-Bassey/CredoJava


## Getting started
### Dependencies:
- Unirest (Installation procedures here: https://github.com/Mashape/unirest-java#installing)

### CredoJava installation:
- Download CredoJava
- Add jar file as a Module to your Java project:
- On Intellij IDEA: File -> Project Structure -> Modules -> Dependencies Tab -> Add -> JARs or Directories -> Attach jar
- On Netbeans: Project properties -> Libraries -> Compile -> ADD JAR/folder -> Add Jar


## Examples

To create a new Credo payments:
```java
Payments payments = new Payments();
payments.pay("[transRef]", "[amount]", "[customerEmail]","[customerName]", "[paymentOptions]", "[customerPhoneNo]", "[currency]","[redirectUrl]"
	)
```

**Remember to always shut down the API connection once you are done making requests**
#### CredoJava utilizes a background event loop and your Java application won't be able to exit until you manually shutdown all the threads by invoking:
```java
ApiConnection.shutDown();
```

## NOTE
### CredoJava utilizes a Keys.json file for the management of api key resources. This file must be placed in your root project directory and has the following structure:
```json
{
  "API_KEYS":{
    "KEY_IN_USE": "sk_test_xxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
    "TEST_SECRET_KEY": "sk_test_xxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
    "TEST_PUBLIC_KEY": "pk_test_xxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
    "LIVE_SECRET_KEY": "sk_live_xxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
    "LIVE_PUBLIC_KEY": "pk_live_xxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
  }
}
```
### The value attached to KEY_IN_USE is the value used for Authorization by CredoJava

## Utilities at a glance
### ApiConnection {Class}:
#### methods:
- connectAndQuery [JSONObject]
- connectAndQueryWithGet [JSONObject]
- connectAndQueryWithPut [JSONObject]
- shutDown [void]

### ApiQuery {Class}:
#### methods:
- newQuery [void]
- putParams [JSONObject]

### Transactions {Class}:
#### methods:
- initializeTransaction [JSONObject]
- verifyTransaction [JSONObject]
- fetchTransaction [JSONObject]


License
----

The MIT License (MIT)

Copyright (c) 2016 Moses Bassey

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
