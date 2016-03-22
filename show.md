# The Wonderfulness of IntelliJ IDEA

## Introduction

###### Whitespaces
Show whitespaces in

## Look and Feel

###### Switch Menu
Press CTRL + `.

* Look and Feel
* Color Scheme
* View Mode
* Keymap

## Navigation

### Basic Navigation

###### CTRL + SHIFT + N

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

###### CTRL + N
List just classes

###### CTRL + ALT + LEFT/RIGHT
Back to places you've seen. Problems with drivers!

###### CTRL + SHIFT + BACKSPACE
To the last modified place.

### Tabs

###### ALT + LEFT/RIGHT

Generally a bad idea to use tabs. They distract, you spend
 too much time to look for proper tab.

###### Change Tabs
* `Tabs Placement: Left`
* `Tabs Placement: None`
* `Window: Small labels in editor tabs`
* `Use file colors in editor tabs`
* `Show "close" button on editor tabs`

###### Closing Tabs
* CTRL + F4 - Close current
* Close All
* Close Others

### Windows

###### Hide All Windows
Sometimes I see people working with so tiny window.
Don't do that. Press CTRL + SHIFT + F12 to get some freedom.

##### Switcher
Press CTRL + TAB to see convenient window switcher:
* CTRL + TAB and CTRL + SHIFT + TAB to navigate
* While CTRL remain pressed
 * numbers
 * cursors
 * press delete/backspace to close (magic!)
 * CTRL + SHIFT + UP/DOWN to shrink/extend

### Selection

##### Smart Selection
Context sensitive:
* CTRL + W
* CTRL + SHIFT + W

### Moving

###### Move element right and left

To move statements to the left or right press ALT + CTRL + SHIFT
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

CTRL + SHIFT + 1
CTRL + Q
Colours

## Refactoring

#### Constant extraction
CTRL + ALT + C - by default public.
To change visibility press CTRL + ALT + C twice.

#### Surround with
CTRL + ALT + T
hashCode() == 1

## Writing code

##### Reformatting
CTRL + ALT + L (twice)
CTRL + ALT + O

##### Adjust Code Style
ALT + ENTER on selection.

##### Static imports on the fly
Since 2016.1 it's possible to just press ALT + ENTER to add missing import

#### Completion

###### Chain completion

If none of the symbols available have compatible type, but chained methods do,
 then press CTRL + SHIFT + SPACE twice. Try with `List list = ` and choose
 `Arrays.asList`.

###### Static Imports
In 2016.1 it's much easier to add static imports. Just press ALT + ENTER.
To gain even more boost, you can enable "Add unambiguous imports on the fly option".

## Inspections

##### Declaration access can be weaker

IDEA 2016.1 comes with inspection to prevent making fields, methods and classes
 public unnecessarily. See `PayOneZlotyForMe`.

## Debugging
* ALT + SHIFT + F9
* CTRL + F8
* CTRL + SHIFT + F8
* F9 F8 F7
* Run to cursor
* Drop Frame
* Force Return

## Terminal
Open with ALT + F12.

###### Exiting
* ALT + 2 in IDEA 15
* ALT + 9, SHIFT + ESC, ALT + F12 in IDEA 2016.1
* CTRL + D

###### Searching
Just CTRL + F in IDEA 2016.1!

###### Tabs
CTRL + SHIFT + T
CTRL + SHIFT + W

Ideas:
- gradle new project
- color picker
- show Xpath
- show effective POM
