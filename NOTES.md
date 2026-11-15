# Inventory Manager

## Status
- Done: setup, Item class (fields, constructor, getters, toString)
- Next: add setQuantity and setPrice, then Stage 2 (Inventory class)

## Decisions
- Item has 4 fields: name, quantity, price, category
- Setters only for quantity and price (name is the HashMap key, so it never changes)
- Item names are one word, stored in lowercase

## Dev log
- Fields are private so only Item's own code can change them. Other classes use getters.
- Constructor parameters are separate local variables. this.name is the field, plain name is the parameter.
- println(a) calls a.toString(). My @Override replaces the default Item@hash text.
- Typo in a parameter name (nane) breaks this.name = name. Check spelling first.

## Later ideas
(new features go here, not into the code, until Stage 6 is done)
