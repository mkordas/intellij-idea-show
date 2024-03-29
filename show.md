# The Wonderfulness of IntelliJ IDEA

## Introduction

#####
Learn IntelliJ when starting

##### Show Whitespaces
Type `/editor whitespaces` in SHIFT x 2
Useful for `TabsVsSpaces`

##### Line Numbers
Type `/editor line numbers` in SHIFT x 2

##### CamelHumps
Type `/editor "CamelHumps` in SHIFT x 2

##### Search git objects
in SHIFT x2

##### Calculate
`sqrt(42)`

##### Run anything
CTRLx2

##### Run any action
CTRL+SHIFT+A


## Look and Feel

##### Switch Menu
Press CTRL + `~`

* Look and Feel
* Color Scheme
* View Mode
* Keymap

## Navigation

### Basic Navigation

##### CTRL + SHIFT + N

Having class `ProblemFactory` you can write:
- ProFac
- PF
- profact
- pf
- profory – doesn't work
- prof*ory

More things:
* CTRL + SHIFT + N second time
* `/` to search in directories
* CTRL + UP + DOWN - history
* `File Colors enabled`
* file types
* move to line and column

##### CTRL + N
List just classes

##### CTRL + SHIFT + ALT + N
All methods and members. Present using `iKnowOnly`.
Can be prefixed with fully qualified name.

##### CTRL + ALT + LEFT/RIGHT
Back to places you've seen. Problems with drivers!

##### CTRL + SHIFT + BACKSPACE
To the last modified place.

##### Recent Files
CTRL + E (+enter)
CTRL + SHIFT + E
SHIFT x 2

##### Structure
* CTRL + F12
* ALT + 7

##### Navigation Bar
* ALT + HOME
* use it as popup
* add file with ALT + INSERT
* search there

##### Select in
ALT + F1
* project
* structure
* VCS
* files
Customize - set shortcut for `Select File in Project View` CTRL+ALT+SHIFT+O

##### F12
Goes back to last used pane. ESC to go to code.

##### Hierarchies
Go to `ImplementMe`.
Call hierarchy with CTRL + ALT + H
Draw diagram with CTRL + ALT + U

##### Bookmarks
* F11
* SHIFT + F11

### Tabs

##### ALT + LEFT/RIGHT

Generally a bad idea to use tabs. They distract, you spend
 too much time to look for proper tab.

##### Change Tabs
* `Tabs Placement: Left`
* `Tabs Placement: None`
* `Window: Small labels in editor tabs`
* `Use file colors in editor tabs`
* `Show "close" button on editor tabs`

##### Closing Tabs
* CTRL + F4 - Close current
* ALT + click on close - closes others
* Close Others
* Close All

### Windows

##### Hide All Windows
Sometimes I see people working with so tiny window.
Don't do that. Press CTRL + SHIFT + F12 to get some freedom.

##### Switcher
Press CTRL + TAB to see convenient window switcher:
* CTRL + TAB and CTRL + SHIFT + TAB to navigate
* While CTRL remains pressed
 * numbers
 * cursors
 * press delete/backspace to close (magic!)
 * CTRL + SHIFT + UP/DOWN to shrink/extend

##### Opening New Window
* SHIFT + F4 - current to new
* SHIFT + ENTER - open in new

##### Documentation
CTRL + Q

##### Quick Definition
CTRL + SHIFT + I

### Selection

##### Smart Selection
Context sensitive:
* CTRL + W
* CTRL + SHIFT + W

##### Usage Highlighting
CTRL + SHIFT + F7

##### Multiselection
* ALT + SHIFT + INSERT
* ALT + J
* CTLR + SHIFT + ALT + J
* CTLR + SHIFT + ALT + CLICK
* 2 x CTRL

### Creation
* use ALT + INSERT
* provide fully qualified names to create directories

### Moving

##### Move element right and left

To move statements to the left or right press
 ALT + CTRL + SHIFT + LEFT/RIGHT
* XML
* method parameters
* elements in an array

### Context

##### Parameter Info
Press CTRL + P

##### Actual Type
To get fully qualified derived type press CTRL + SHIFT + P.
IntelliJ will ask for expression if not unambiguous.

##### ALT + Q
Shows current declaration when it is not visible. Show in `TabsVsSpaces`

## History

##### Local History
* Single file
* Entire directory/project
* CTRL + SHIFT + V

##### Recent Changes
ALT + SHIFT + C

##### Move Between Changes
CTRL + ALT + SHIFT + UP/DOWN

## Refactoring

#### Constant extraction
CTRL + ALT + C - by default public.
To change visibility press CTRL + ALT + C twice.

#### Surround with
* CTRL + ALT + T
* Show e.g. with `hashCode() == 1`

##### Copy & Move
* F5 to copy class
* F6 to move
 * classes
 * static fields
 * static methods

##### Refactor This
CTRL + ALT + SHIFT + T

## Writing code

##### Emmet
In XML type `report>header>date+messageId^trade>tradeHeader>party$*10`
 and press TAB.

##### Quick Variable
* Type `new ArLi` + CTRL + ALT + V
* Change "case sensitive completion" setting to "None"
  and type `new arli`

##### Reformatting
* CTRL + ALT + L (twice)
* CTRL + ALT + I
* CTRL + ALT + O

##### Adjust Code Style
ALT + ENTER on selection

##### Static imports on the fly
Since 2016.1 it's possible to just press ALT + ENTER to add missing import

##### TDD
F2 and SHIFT + F2

##### XPath
CTRL + ALT + X

#### Completion

##### Cancel Completion
CTRL + UP/DOWN to cancel completion and move

##### Finish Completion
Completion can be finished with
* `.` (sometimes CTRL is needed)
* `,`
* `!` when boolean method is selected
* CTRL + SHIFT + ENTER
* CTRL + ALT + V

##### Chain completion

If none of the symbols available have compatible type, but chained methods do,
 then press CTRL + SHIFT + SPACE twice. Try with `List list = ` and choose
 `Arrays.asList`.

##### Static Imports
In 2016.1 it's much easier to add static imports. Just press ALT + ENTER.
To gain even more boost, you can enable "Add unambiguous imports on the fly option".

##### HippieCompletion
ALT + /

##### Commenting Code
* CTRL + `/`
* CTRL + SHIFT + `/`

## Inspections

##### Declaration access can be weaker

IDEA 2016.1 comes with inspection to prevent making fields, methods and classes
 public unnecessarily. See `PayOneZlotyForMe`.

##### DSM
ALT + Z
Analyze Dependency Matrix

## Debugging
* ALT + SHIFT + F9
* CTRL + F8
* CTRL + SHIFT + F8
* F9 F8 F7
* Run to cursor
* Drop Frame
* Force Return

## Version Control

### Log

* thin stripe instead of rolling bar
* CTRL + L (jump to search)
* CTRL + F (jump to branch/hash)
* regular expressions, case sensitivity 
* choose several commits
* date filtering
* undo commit
* Restore and Delete tracked branch
* Managing Git remotes
* case-only renames


### Merge and Diff

* ignore imports and formatting (but spaces in strings are preserved)
* resolving simple conflicts

### File History

* performance
* go to log
* show changes from other branches

## Unversioned files

## Find in Path

* preview is merged
* all shortcuts work as before	

## Various Recent Improvements

* Recent Tests `Shift+Ctrl+;`
* Flat file icons
* Find by shortcut
* font ligatures (Fira Code Pro)
 * ![](https://raw.githubusercontent.com/tonsky/FiraCode/master/showcases/all_ligatures.png)
 * != && >=
* background image
* inspections
* notifications
* composite builds
* polyglot maven

## New Java Migration

## Puzzlers

* `IAmBroken`
* `cd target/classes`, `java ...`

## Terminal
Open with ALT + F12.

##### Exiting
* ALT + 9, SHIFT + ESC, ALT + F12 in IDEA 2016.1
* CTRL + D

##### Searching
Just CTRL + F in IDEA 2016.1!

##### Tabs
* CTRL + SHIFT + T
* CTRL + SHIFT + W

## Others
* Color Picker
* Show effective POM
* My Productivity
