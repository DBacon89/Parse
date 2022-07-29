## Getting Started

This was originally a Java Applet written by professor Zerksis D. Umrigar to demonstrate parsing with different context free grammars. This app is now used as a learning tool by Professor Charles T. Wilkes at the University Of Massachusetts Lowell in the Organization Of Programming Languages course. I modified the code so it became a stand alone app, as Java Applets have become deprecated. In addition to implementing grammars at the request of Professor Wilkes , I also added features such as being able to rerun parsings during runtime and being able to choose a grammar from a drop down menu.

To use simply compile all files and run the main class in ParsDemo.Java.

## Windows Vs Linux

Please note that while Java is often touted as a language you can "write once and run everywhere." The Java Swing library runs slightly different in Windows and Linux. On top of that, this is almost 30 year old code. Your best bet is to run it in Linux, preferably Ubuntu where it is the most stable.

## New Features

Live load Algorithms (7/28/22) : You can now live load Algorithms via a drop down menu instead of restarting the program over and over.

Free Scrolling (7/29/22) : You can now click or drag the scrollbars without having to hover over the window to update the graphics. You can also do this while the parsing animation runs.

## Bugs

Unstable Graphics : When starting up the app or resizing the window the graphics are often unstable, this ranges from slight on Ubuntu to almost unusuable on Windows.

## Proposed New Features

- Having the program read in file input in addition to code from the text field.
- The ability to rewind a Parse with a Rewind Button.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

