# Essential

## Context actions

2. The action "Safe delete 'redundant'" should now be called "Remove parameter 'redundant'".

4. We can use another 'intentionExample' here;
   the users then should choose an intention 'Convert to expression body'.

## Search for actions

no changes

## Search everywhere

no changes

I've added documentation comments (KDoc, /** ... */) to BufferedReader.kt to have something displayed
when we check documentation -- the same can be added for Java sample as well.

## Basic completion

1. Start typing 'l' right where the caret is... (it should suggest 'listOf').

3. Select `INITIAL` inside the lookup menu. 
   (The cursor should be moved here because listOf() by default choose a function with parameters
   but we need the one with parameters to have the cursor inside parentheses)
   
4. No real need to complete the statement -- no semicolon in Kotlin

5. It's kind of hard to invent an example to illustrate the necessity to invoke completion for second time.
   (Completion has become smart and works, even for Java example). Probably, it can be simply omitted.

