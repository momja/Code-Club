- Using the java swing user-interface toolkit, we can make user-interface components!

# Layout Management

- build user interfaces by adding components into containers like panels
  - containers each have layout managers
  - **JPanel** uses a *flow-layout*
    - flow-layout: arranges components from left to right and starts a new row when there is no more room in the current row
    - border-layout: groups the container into five areas: center, n,s,e,w

```java
//create a simple grid for ATM buttons
JPanel buttonPanel = new JPanel();
buttonPanel.setLayout(new GridLayout(/*rows*/4, /*columns*/3));
buttonPanel.add(button7):
buttonPanel.add(button8);
buttonPanel.add(button9);
buttonPanel.add(button4);
// ...
```

- nesting panels lets you create a complex layouts

```java
JPanel keypadPanel = new JPanel();
keypadPanel.setLayout(new BorderLayout());
JPanel buttonPanel = new JPanel();
buttonPanel.setLayout(new GridLayout(/*rows*/4, /*columns*/3));
buttonPanel.add(button7):
buttonPanel.add(button8);
buttonPanel.add(button9);
buttonPanel.add(button4);
// ...
keypadPanel.add(buttonPanel, BorderLayout.CENTER);
JTextFile display = new JTextField();
keypadPanel.add(display, BorderLayout.NORTH);
```
