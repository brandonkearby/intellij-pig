# IntelliJ - Pig Plugin
Pig Plugin adds [Apache Pig](http://pig.apache.org/) Language support to [IntelliJ](http://www.jetbrains.com/idea/).

# Features
* Find Usages and refactoring support for UDFs and pig variables
* Data Type Auto-completion
* Keyword highlighting
* Code commenting/uncommenting
* Brace matching
* Syntax and errors highlighting
* Custom Color Settings Page

# Installation
Install from the IntelliJ plugin repo.

## Authors
* Brandon Kearby
* Russell Melick

## How to get started developing
1. Check out with git
2. Set up intellij for plugin development https://confluence.jetbrains.com/display/IDEADEV/Getting+Started+with+Plugin+Development#GettingStartedwithPluginDevelopment-anchor2
3. Install grammar kit plugin
4. DO NOT Install jflex plugin.  The grammar kit plugin is sufficient.
5. "Generate parser code" by right clicking on the Pig.bnf file
6. "Run jflex generator" by right clicking on the Pig.flex file
7. Go through the Intellij tutorial if you get stuck (https://confluence.jetbrains.com/display/IntelliJIDEA/Custom+Language+Support)


## Change log

### Version 1.7
* Add Find Usages and refactoring support for UDFs and pig variables

### Version 1.6
* 1.5 features did not seem to get uploaded correctly into JetBrains

### Version 1.5
* Add support for * in REGISTER and RMF statements
* Minor bugfixes to color settings page

### Version 1.4
I'm happy to announce that rmelick and brandon.kearby have unified their efforts in the IntelliJ Pig Language Plugin. This release includes any deltas between our codebases.

* Fix SyntaxHighlighter bug that was causing plugin to crash in older version of IDEA (e.x. 11)
* Added support for the pig color settings page

### Version 1.3
* Data type auto-completion

### Version 1.2
* Bug fixes issues with parens
* Fixes with keywords in the set property name
* Fixed order by clause missing simi

### Version 1.1:
* Keyword highlighting
* Code commenting/uncommenting
* Brace matching
* Syntax and errors highlighting
