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

##### Static imports on the fly
Since 2016.1 it's possible to just press ALT + ENTER to add missing import

## Inspections

##### Declaration access can be weaker

IDEA 2016.1 comes with inspection to prevent making fields, methods and classes
 public unnecessarily. See `PayOneZlotyForMe`.

Ideas:
- gradle new project
- color picker
- show Xpath
- show effective POM
